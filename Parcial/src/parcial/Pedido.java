
package parcial;
import java.util.*;

public class Pedido {
    ArrayList menus = new ArrayList();
    private String cliente;
    
    Pedido(String nombre, int cantidadMenu1, int cantidadMenu2, int cantidadMenu3){
        cliente = nombre;
        menus.add(cantidadMenu1);
        menus.add(cantidadMenu2);
        menus.add(cantidadMenu3);
    }
    
    Void getInformation(){
        System.out.println(cliente);
        System.out.println("Menu1:"+ menus.get(0));
        System.out.println("Menu2:"+ menus.get(1));
        System.out.println("Menu2:"+ menus.get(2));
        return null;
    }
}
