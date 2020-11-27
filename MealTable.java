/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem;

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
    public String printStatus(){
        String a="";
        if(tableStatus==(byte)0){
            a+="clean";
        }
        if(tableStatus==(byte)1){
            a+="occupied";
        }
        if(tableStatus==(byte)2){
            a+="dirty";
        }
        return a.substring(0,a.length());
    }
}
