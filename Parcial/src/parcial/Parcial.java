
package parcial;
import java.util.*;

public class Parcial {

    public static void main(String[] args) {
        Menu menu1 = new Menu(10);
        Menu menu2 = new Menu(13);
        Menu menu3 = new Menu(20);
        String nombre;
        ArrayList<Pedido> pedidos = new ArrayList();
        Scanner s = new Scanner(System.in);
        boolean sistema = true;
        while (sistema){
            System.out.println("escriba 1 para ver menus disponibles");
            System.out.println("escriba 2 para hacer un pedido");
            System.out.println("escriba 3 para ver los pedidos");
            System.out.println("escriba 0 para cerrar el programa");
            int seleccion = s.nextInt();
            switch(seleccion) {
                case 1:
                    System.out.println("Menu1 disponibles:"+menu1.getCantidad());
                    System.out.println("Menu2 disponibles:"+menu2.getCantidad());
                    System.out.println("Menu3 disponibles:"+menu3.getCantidad());
                    break;
                case 2:
                    int cantidadMenu1 = 0;
                    int cantidadMenu2 = 0;
                    int cantidadMenu3 = 0;
                    System.out.println("Nombre del cliente:");
                    nombre = s.nextLine();
                    nombre = s.nextLine();
                    boolean pidiendo = true;
                    while (pidiendo){
                        System.out.println("Numero del menu:");
                        int opcion = s.nextInt();
                        switch(opcion) {
                            case 1:
                                System.out.println("Cantidad a pedir");
                                cantidadMenu1 = s.nextInt();
                                if (cantidadMenu1 > menu1.getCantidad()){
                                    cantidadMenu1 = 0;
                                    System.out.println("No quedan suficiente menus1 para cumplir tu pedido, quedan:"+ menu1.getCantidad());
                                }
                                break;
                            case 2:
                                System.out.println("Cantidad a pedir");
                                cantidadMenu2 = s.nextInt();
                                if (cantidadMenu2 > menu2.getCantidad()){
                                    cantidadMenu2 = 0;
                                    System.out.println("No quedan suficiente menus1 para cumplir tu pedido, quedan: "+ menu2.getCantidad());
                                }
                                break;
                            case 3:
                                System.out.println("Cantidad a pedir");
                                cantidadMenu3 = s.nextInt();
                                if (cantidadMenu3 > menu3.getCantidad()){
                                    cantidadMenu3 = 0;
                                    System.out.println("No quedan suficiente menus1 para cumplir tu pedido, quedan: "+ menu3.getCantidad());
                                }
                                break;
                            case 0:
                                pidiendo = false;
                                break;
                        }
                    }
                    Pedido pedido = new Pedido(nombre, cantidadMenu1, cantidadMenu2, cantidadMenu3);
                    pedidos.add(pedido);
                    menu1.vender(cantidadMenu1);
                    menu2.vender(cantidadMenu2);
                    menu3.vender(cantidadMenu3);
                    break;
                case 3:
                    System.out.println("numero de pedido");
                    int index = s.nextInt();
                    pedidos.get(index).getInformation();
                    break;
                case 0:
                    sistema = false;
                    break;
            }
        }
    }
}
