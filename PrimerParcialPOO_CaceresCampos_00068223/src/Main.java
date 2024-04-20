import Devices.Laptop;
import Devices.Mobile;
import ElectronicDevice.ElectronicDevice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    static ArrayList<ElectronicDevice>electronicDevices = new ArrayList<ElectronicDevice>();

    public static void main(String[] args) {
        mostrarMenuPrincipal();
    }
    private static void mostrarMenuPrincipal() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while (true) {
            try {
                imprimirMenu();
                opcion = sn.nextInt();
                sn.nextLine();
                if(opcion == 0){
                    System.out.printf("Ha salido del sistema...\n");
                    break;
                }
                switch (opcion){
                    case 1:
                        addDevice();
                        break;

                    case 2:
                        modifieAnArticle();
                        break;

                    case 3:
                        showArticles();
                        break;

                    default:
                        System.out.printf("Ingrese una opcion valida. Intente de nuevo.\n");
                        break;


                }

            }catch (InputMismatchException e){
                System.out.printf("Ingrese un valor valido. Intente de nuevo.\n");
                sn.nextLine();
            }
        }
    }

    private static void showArticles() {
        for (int i = 0; i < electronicDevices.size(); i++){
            System.out.println("**********");
            System.out.println("Nombre del dispotivo: " + electronicDevices.get(i).getName());
            System.out.println("Modelo del dispotivo: " + electronicDevices.get(i).getModel());
            System.out.println("Descripcion del dispotivo: " + electronicDevices.get(i).getDescription());
            System.out.println("Precio del dispotivo: " + electronicDevices.get(i).getPrice());
            System.out.println("\n");

        }
    }

    private static void modifieAnArticle() {
        Scanner sn = new Scanner(System.in);

                        System.out.println("Ingrese el nombre del articulo a modificar: ");
                        String nombre = sn.nextLine();
                        for (int i = 0; i < electronicDevices.size(); i++) {
                            if (electronicDevices.get(i).getName().equals(nombre)) {
                                System.out.println("Ingrese el nuevo precio del articulo " + electronicDevices.get(i).getName() + " en dolares ($)");
                                float newPrice = sn.nextFloat();
                                electronicDevices.get(i).setPrice(newPrice);
                                System.out.println("Precio modificado exitosamente!");

                            }

                        }


return;
        }


    private static void addDevice() {
        Scanner sn = new Scanner(System.in);
        String name;
        String model;
        String description;
        float price;
        String brand = null;
        String size = null;
        float newPrice = 0;
        String IOS;
        int RAM;
        System.out.printf("Ingrese el nombre del dispositivo: \n");
        name = sn.nextLine();
        System.out.printf("Ingrese el modelo del dispositivo: \n");
        model = sn.nextLine();
        System.out.printf("Ingrese la descripcion del dispositivo: \n");
        description = sn.nextLine();
        System.out.printf("Ingrese el precio del dispositivo: \n");
        price = sn.nextFloat();
        sn.nextLine();
        ElectronicDevice electronicDevice = new ElectronicDevice(name, model, description, price);
        int eDivice = tipoEDevice();
        ElectronicDevice electronicDevice2 = null;
        switch (eDivice){
            case 1:
                System.out.println("Ingrese el sistema operativo del dispositivo: ");
                IOS = sn.nextLine();
                System.out.println("Ingrese la RAM del dispositivo: ");
                RAM = sn.nextInt();
                sn.nextLine();
                electronicDevice2 = new Laptop(electronicDevice, IOS, RAM);
                break;
            case 2:
                System.out.println("Ingrese la marca del dispositivo: ");
                brand = sn.nextLine();
                System.out.println("Ingrese el tamaño del dispositivo: (largo por ancho en cm)");
                size = sn.nextLine();
                electronicDevice2 = new Mobile(electronicDevice, brand, size);
                break;
            default:
                System.out.println("Selecione una opcion valida. Intente de nuevo.");
                break;
        }
        System.out.printf("Dispositivo agregado existosamente!\n");
        electronicDevices.add(electronicDevice);

    }

    private static void imprimirMenu() {
        System.out.printf("Seleccione una opcion: \n");
        System.out.printf("\t1- Crear un articulo\n");
        System.out.printf("\t2- Modificar un articulo\n");
        System.out.printf("\t3- Consultar articulos\n");
        System.out.printf("\t4- Salir\n");
        System.out.printf("Opcion > ");
    }

    private static int tipoEDevice() {
        Scanner sn = new Scanner(System.in);
        while (true) {
            try {
                System.out.printf("Seleccione una opcion: \n");
                System.out.printf("\t1- Laptop\n");
                System.out.printf("\t2- Celular\n");
                System.out.printf("Opcion > ");
                int opc = sn.nextInt();
                sn.nextLine();
                if (opc >= 1 && opc <= 2)
                    return opc;
                System.out.println("Ingrese una opcion valida");
            } catch (Exception e) {
                System.out.println("Ingrese un valor valido");

            } finally {
                sn.nextLine();
            }
        }


    }

}