
package examen_prueba_ordinaria;

import model.*;

public class Examen_prueba_ordinaria {

    public static void main(String[] args) {
        Subject producto = new Product ("TV LED de 56 pulgadas ", 500.0 );
        Observer b1 = new Bidder ("ana");
        Observer b2 = new Bidder ("pablo");
        Observer b3 = new Bidder ("María");
        
        producto.registerObserver(b1);
        producto.registerObserver(b2);
        producto.registerObserver(b3);
        
        producto.setBidAmount(b1, 501.0);
    }
    
}
