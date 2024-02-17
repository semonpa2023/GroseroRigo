package org.example;
//SEBASTIAN MONTOYA PARRA
//LUIS MIGUEL
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombreUser;
        String nombreUserBD = "maradona123";
        LocalDateTime fecha = LocalDateTime.now();
        String contrasena;
        String contrasenaBD = "nodrogas";
        String correo;
        String correoBD = "maracoca24@barrio.com";
        Double saldoDisponible = 0.00;
        Integer intentos = 3;
        Scanner leerDato = new Scanner(System.in);
        boolean loginExitoso = false;
        int opcion = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        Integer productoSeleccionado;
        Double costototalsinpropina = 0.0;
        Double costototalconpropina=0.0;
        int propina;


        while (intentos > 0 && !loginExitoso) {

            System.out.println("********Bienbenido a GROSERIA BY RIGO********");
            System.out.println("Por favon ingrese su usuario: ");
            nombreUser = leerDato.nextLine();
            System.out.println("Por favor ingresa tu contraseña: ");
            contrasena = leerDato.nextLine();
            System.out.println("Por favor ingresa tu correo: ");
            correo = leerDato.nextLine();


            if (nombreUser.equals(nombreUserBD) && contrasena.equals(contrasenaBD) && correo.equals(correoBD)) {
                System.out.println("Inicio sesion exitoso");
                loginExitoso = true;
            } else {
                intentos--;
                System.out.println("Usuario y/o contraseña incorrectos. Intentos restantes: " + intentos);
                if (intentos == 0) {
                    System.out.println("Se excedio el numero de intentos permitido. Cancelando operacion");
                    return;
                }
            }

        }

        while (loginExitoso) {
            System.out.println("\n Que deseas hacer en GROSERIA BY RIGO");
            System.out.println("1. Ingresar orden");
            System.out.println("2. Modificar compra");
            System.out.println("3. Terminar orden y Calcular total ");
            System.out.println("4. Salir");

            System.out.println("Seleccione una opcion: ");
            opcion = leerDato.nextInt();
            if (opcion == 1) {

                do {
                    System.out.println("\n. GROSERIA BY RIGO");
                    System.out.println("1. Entrada de cangrejo urraeño  __________________ $28000");
                    System.out.println("2. Escalopes a la Rigo          __________________ $35000");
                    System.out.println("3. Filete tour de france        __________________ $150000");
                    System.out.println("4. Corvina de Rigo              __________________ $200000");
                    System.out.println("5. Coctel de Rigo               __________________ $20000");
                    System.out.println("6. Jugos de Urrao               __________________ $20000");
                    System.out.println("7.salir");
                    System.out.println("Seleccione una opcion");


                    System.out.println("Digite producto deseado:");
                    productoSeleccionado = leerDato.nextInt();
                    switch (productoSeleccionado) {
                        case 1:
                            System.out.println("Digita Cantidad de cangrejo de urrao deseada : ");
                            cont1 = leerDato.nextInt();
                            break;
                        case 2:
                            System.out.println("Digita Cantidad de escalopes deseada :");
                            cont2 = leerDato.nextInt();
                            break;
                        case 3:
                            System.out.println("Digita Cantidad de filetes deseada : ");
                            cont3 = leerDato.nextInt();
                            break;
                        case 4:
                            System.out.println("Digita Cantidad de corvina deseada :: ");
                            cont4 = leerDato.nextInt();
                            break;
                        case 5:
                            System.out.println("Digita Cuantas cocteles deseas: ");
                            cont5 = leerDato.nextInt();
                            break;
                        case 6:
                            System.out.println("Digita cuantos jugos deseas: ");
                            cont6 = leerDato.nextInt();
                            break;
                        case 7:
                            System.out.println("Orden terminada");
                            break;
                        default:
                            System.out.println("Producto no encontrado");


                    }
                } while (productoSeleccionado != 7);


            } else if (opcion == 2) {

            }
            else if (opcion == 3) {
                costototalsinpropina=((cont1*28000.0)+(cont2*35000.0)+(cont3*150000.0)+(cont4*200000.0)+
                        (cont5*20000.0)+(cont6*20000.0));
                System.out.println("Digite 1 si desea incluuir propina del 5%");
                System.out.println("Digite 2 si desea incluir una propina del 10%");
                propina=leerDato.nextInt();
                if(propina==1){
                    costototalconpropina=costototalsinpropina+costototalsinpropina*0.05;
                    System.out.println("El total de su compra es de: $"+costototalconpropina);
                    break;

                } else if (propina==2) {
                    costototalconpropina=costototalsinpropina+costototalsinpropina*0.10;
                    System.out.println("El total de su compra es de: $"+costototalconpropina);
                    break;
                }else {
                    System.out.println("Digite una opcion valida");
                    break;
                }




            }


        }
    }
}