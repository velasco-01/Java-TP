import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Declaración de todas las variables
        //Datos Cliente
        int dia;
        int mes;
        int year;
        int DniN;
        int opciones=1;
        //Datos Cuenta
        char tcuenta;
        int a1 = 9, a2 = 0, a3 = 1, a4 = 0;
        int b1 = 0, b2 = 2, b3 = 0, b4 = 1;
        int c1 , c2;
        int r1 = 0, r2 = 0;
        int d1, d2, d3, d4, d5, d6, d7, d8, d9, d10;
        double dinero,deposito,retirada;

        while (opciones !=0) {
            Funciones.menu();
            opciones= teclado.nextInt();
            switch (opciones) {
                case 0:
                    break;
                case 1:
                    System.out.print("\nIntroduzca el nombre del cliente:");
                    String Nombre = teclado.next();
                    System.out.print("Introduzca los apellidos del cliente:");
                    String Apellido = teclado.next();
                    System.out.print("Introduzca la fecha de nacimiento del cliente (dd mm aaaa):");
                    dia = teclado.nextInt();
                    mes = teclado.nextInt();
                    year = teclado.nextInt();
                    //Comprobación Fecha
                    Funciones.ComprobarYear(dia, mes, year);
                    System.out.print("Introduzca el DNI del cliente (Ej: 12345678 N):");
                    DniN = teclado.nextInt();
                    String DniL = teclado.nextLine();
                    System.out.print("Introduzca el correo electrónico del cliente (@upm.es o @alumnos.upm.es):");
                    String correo = teclado.nextLine();

                    //Resumen datos cliente
                    System.out.println("\n\nCliente creado correctamente:");
                    System.out.println("---------------------------");
                    System.out.println("Nombre y Apellidos: " + Nombre + " " + Apellido);
                    System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + year);
                    System.out.println("DNI: " + DniN + DniL);
                    System.out.println("Correo electrónico: " + correo);
                    break;

                case 2:
                    System.out.print("Introduzca el tipo de cuenta (Corriente (C), Ahorro (A) o Remunerada (R):");
                    tcuenta = teclado.next().charAt(0);
                    Funciones.comprobarCuenta(tcuenta);
                    d1 = (int) Math.round(Math.random() * 9);
                    d2 = (int) Math.round(Math.random() * 9);
                    d3 = (int) Math.round(Math.random() * 9);
                    d4 = (int) Math.round(Math.random() * 9);
                    d5 = (int) Math.round(Math.random() * 9);
                    d6 = (int) Math.round(Math.random() * 9);
                    d7 = (int) Math.round(Math.random() * 9);
                    d8 = (int) Math.round(Math.random() * 9);
                    d9 = (int) Math.round(Math.random() * 9);
                    d10 = (int) Math.round(Math.random() * 9);

                    c1 = Funciones.GenerarC1(r1, b4, b3, b2, b1, a4, a3, a2, a1);
                    c2 = Funciones.GenerarC2(r2, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10);

                    System.out.print("Introduzca la cantidad de dinero disponible (En euros):");
                    dinero = teclado.nextDouble();
                    //Resumen datos cuenta bancaria
                    System.out.println("\n\nDatos de la cuenta:");
                    System.out.println("---------------------------");
                    System.out.println("Tipo de cuenta: " + tcuenta);
                    System.out.println("Número de cuenta: " + a1 + a2 + a3 + a4 + " " + b1 + b2 + b3 + b4 + " " + c1 + c2 + " " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
                    System.out.println("Saldo en la cuenta: " + dinero + "€");
                    break;

                case 3:
                    System.out.print("\n\nIntroduzca la cantidad a depositar (En €):");
                    deposito= teclado.nextInt();
                    System.out.println(deposito);
                    if (deposito>0){
                        dinero=dinero+deposito;
                    }else{
                        System.out.println("La cantidad introducida no es válida");
                    }
                    break;

                case 4:
                    System.out.print("\n\nIntroduzca la cantidad a retirar (En €):");
                    retirada= teclado.nextInt();
                    System.out.println(retirada);
                    if (retirada>0){
                        if (dinero>retirada){
                            dinero =dinero-retirada;
                        }else{
                            System.out.println("Saldo insuficiente");
                        }
                    }else{
                        System.out.println("La cantidad introducida no es válida");
                    }
                    break;

                case 5:

                    break;

                case 6:


                    break;
            }
        }
    }
}
