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
public class MealTable {
    //tables have three statuses (clean, occupied, dirty)
    byte tableStatus;
    public void setStatus(byte a){
        if((byte)0<=a&&a<=(byte)2){
            this.tableStatus=a;
        }
    }
    byte[] isClean;
    byte[] isOccupied;
    byte[] isDirty;
    public void printStatus(){
        if(this.tableStatus==0){ByteCLI.printBytes(isClean);}
        if(this.tableStatus==1){ByteCLI.printBytes(isOccupied);}
        if(this.tableStatus==2){ByteCLI.printBytes(isDirty);}
    }
}
