/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem;
import restaurantsystem.ByteCLI;
/**
 *
 * @author AresUII
 */
public class MenuItem {
    byte[] itemName;
    //TODO: bools or bytes for any options we need to add
    public void setName(byte[] a){
        System.arraycopy(a,0,itemName,0,a.length);
    }
}