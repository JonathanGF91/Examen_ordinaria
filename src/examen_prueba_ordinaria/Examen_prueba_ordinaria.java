
package examen_prueba_ordinaria;

import model.*;

public class Examen_prueba_ordinaria {

    public static void main(String[] args) {
        Subject producto = new Product ("patinete electrico ", 500.0 );
        Observer x1 = new Bidder ("olga");
        Observer x2 = new Bidder ("pablo");

        
        producto.registerObserver(x1);
        producto.registerObserver(x2);

        
        producto.setBidAmount(x1, 501.0);
        producto.setBidAmount(x2, 600.0);
        producto.setBidAmount(x1, 601.5);
        
        producto.getHistory();
    }
    
}
