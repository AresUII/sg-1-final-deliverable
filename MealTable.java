/*
 * Edison Flanagan
 * 20201130
 * Section W01
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
    byte[] isClean={
        (byte)('c'&0xff),
        (byte)('l'&0xff),
        (byte)('e'&0xff),
        (byte)('a'&0xff),
        (byte)('n'&0xff),
        (byte)(' '&0xff),
        (byte)(' '&0xff),
        (byte)(' '&0xff)
    };
    byte[] isOccupied={
        (byte)('o'&0xff),
        (byte)('c'&0xff),
        (byte)('c'&0xff),
        (byte)('u'&0xff),
        (byte)('p'&0xff),
        (byte)('i'&0xff),
        (byte)('e'&0xff),
        (byte)('d'&0xff)
    };
    byte[] isDirty={
        (byte)('d'&0xff),
        (byte)('i'&0xff),
        (byte)('r'&0xff),
        (byte)('t'&0xff),
        (byte)('y'&0xff),
        (byte)(' '&0xff),
        (byte)(' '&0xff),
        (byte)(' '&0xff),
    };
    public byte getStatus(){return tableStatus;}
    public void printStatus(){
        if(this.tableStatus==0){ByteCLI.printBytes(isClean);}
        if(this.tableStatus==1){ByteCLI.printBytes(isOccupied);}
        if(this.tableStatus==2){ByteCLI.printBytes(isDirty);}
    }
}
