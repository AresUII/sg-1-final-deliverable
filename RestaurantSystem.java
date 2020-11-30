/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem;
import restaurantsystem.*;
/**
 *
 * @author AresUII
 */
public class RestaurantSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MealTable foo=new MealTable();
        foo.setStatus((byte)2);
        foo.printStatus();
    }
    
}
