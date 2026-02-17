import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FactoryMethod factory = null;
        int opcion = 0;

        while (true) {
            System.out.println("\n--- Bienvenido al Restaurante ---");
            System.out.println("Por favor, seleccione el tipo de menu que desea:");
            System.out.println("1. Menu Vegetariano");
            System.out.println("2. Menu Gourmet");
            System.out.println("3. Menu Saludable");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Por favor ingrese un numero valido.");
                continue;
            }

            if (opcion == 4) {
                System.out.println("Gracias por su visita. Hasta luego!");
                break;
            }

            switch (opcion) {
                case 1:
                    factory = new FactoryVegetariano();
                    System.out.println("\nHa seleccionado: Menu Vegetariano");
                    break;
                case 2:
                    factory = new FactoryGourmet();
                    System.out.println("\nHa seleccionado: Menu Gourmet");
                    break;
                case 3:
                    factory = new FactorySaludable();
                    System.out.println("\nHa seleccionado: Menu Saludable");
                    break;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    continue;
            }

            // Create the full menu
            Entrada entrada = factory.crearEntrada();
            PlatoPrincipal plato = factory.crearPlatoPrincipal();
            Bebida bebida = factory.crearBebida();
            Postre postre = factory.crearPostre();

            boolean menuActivo = true;
            while (menuActivo) {
                System.out.println("\n--- Estado de su Menu ---");
                System.out.println("Seleccione un plato para comer/beber:");
                System.out.println("1. Entrada " + (entrada.isTerminado() ? "(Terminado)" : "(Pendiente)"));
                System.out.println("2. Plato Principal " + (plato.isTerminado() ? "(Terminado)" : "(Pendiente)"));
                System.out.println("3. Bebida " + (bebida.isTerminado() ? "(Terminado)" : "(Pendiente)"));
                System.out.println("4. Postre " + (postre.isTerminado() ? "(Terminado)" : "(Pendiente)"));
                System.out.println("5. Finalizar Menu");
                System.out.print("Opcion: ");

                int subOpcion = 0;
                try {
                    subOpcion = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Por favor ingrese un numero valido.");
                    continue;
                }

                switch (subOpcion) {
                    case 1:
                        if (!entrada.isTerminado()) {
                            entrada.comer();
                            entrada.setTerminado(true);
                        } else {
                            System.out.println("Ya has terminado la entrada.");
                        }
                        break;
                    case 2:
                        if (!plato.isTerminado()) {
                            plato.comer();
                            plato.setTerminado(true);
                        } else {
                            System.out.println("Ya has terminado el plato principal.");
                        }
                        break;
                    case 3:
                        if (!bebida.isTerminado()) {
                            bebida.Beber();
                            bebida.setTerminado(true);
                        } else {
                            System.out.println("Ya has terminado la bebida.");
                        }
                        break;
                    case 4:
                        if (!postre.isTerminado()) {
                            postre.comer();
                            postre.setTerminado(true);
                        } else {
                            System.out.println("Ya has terminado el postre.");
                        }
                        break;
                    case 5:
                        menuActivo = false;
                        System.out.println("\nEsperamos que disfrute su comida!");
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            }
        }

        scanner.close();
    }
}
