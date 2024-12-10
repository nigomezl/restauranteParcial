
package parcial;
import java.util.*;

public class Menu {
    private int cantidad;
    
    Menu(int c){
        cantidad = c;
    }
    
    int getCantidad(){
        return this.cantidad;
    }
    
    void vender(int vender){
        cantidad -= vender;
    }
}
