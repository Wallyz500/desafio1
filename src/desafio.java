import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nombreUsuario = "Marco Salazar";
        String tipoCuenta = "Corriente";
        double saldoCuenta = 0;
        int opciones = 0;

        String interfaz = """
                Bienvenido a Blank.
                
                Nombre de Usuario: %s
                Tipo de cuenta: %s
                Saldo: %.2f
                """.formatted(nombreUsuario, tipoCuenta, saldoCuenta);
        String selector = """
                Seleciona la opcion que quiere realizar.
                
                1- Consulta
                2- Retiro
                3- Deposito
                4- Salir
                """;

        System.out.println(interfaz);

        while (opciones != 4) {
            System.out.println(selector);
            opciones = teclado.nextInt();

            switch (opciones){
                case 1:
                    System.out.println("Su saldo actualizado es: " + saldoCuenta + "$");
                    break;
                case 2:
                    System.out.println("Dijite el saldo que desea retirar");
                    double saldoSutraido = teclado.nextDouble();
                    if (saldoSutraido > saldoCuenta) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoCuenta -= saldoSutraido;
                        System.out.println("Su saldo actualizado es: " + saldoCuenta + "$");
                    }
                    break;
                case 3:
                    System.out.println("Dijite el sado que desea depositar");
                    double saldoAgregado = teclado.nextDouble();
                    saldoCuenta += saldoAgregado;
                    System.out.println("Su saldo actualizado es: " + saldoCuenta + "$");
                    break;
                case 4:
                    System.out.println("Finalizando el programa, gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
