/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem;
import restaurantsystem.ByteCLI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author ill-education
 */
public class MenuItem {
    private byte[] itemName = new byte[50];
    private long price;
    private ArrayList<byte[]> customerOptions = new ArrayList<byte[]>();

    public MenuItem() {
    	byte[] a = "Item Name".getBytes();
    	System.arraycopy(a,0,itemName,0,a.length);
    	price = 0;
	}

    public MenuItem(byte[] name, double p) {
    	System.arraycopy(name,0,itemName,0,name.length);
    	price = (long)(p*200.0d);
	}

    //TODO: bools or bytes for any options we need to add
    public void setMenuItemName(byte[] a){
        System.arraycopy(a,0,itemName,0,a.length);
    }

    public byte[] getMenuItemName(){
        return itemName;
    }

    public void setMenuItemPrice(double p){
        price = (long)(p*200);
    }

    public double getMenuItemPrice(){
        return (double)(price/200.0d);
    }

    public void addCustomerOption(byte[] o){

    	boolean optionExists = false;

    	for (int i = 0; i < customerOptions.size(); i++) {
			if (Arrays.equals(customerOptions.get(i),o)){
				optionExists = true;
			}
		}

    	if (optionExists == false){

    		customerOptions.add(o);

    		ByteCLI.printBytes(o);
    		System.out.print(" has been added to Customer Options");
    		System.out.println();
    	}
    	else{
    		ByteCLI.printBytes(o);
    		System.out.print(" already exists in Customer Options");
    		System.out.println();
    	}
    }

    public void removeCustomerOption(byte[] o){

    	boolean optionExists = false;
    	int loc = -1;

    	for (int i = 0; i < customerOptions.size(); i++) {
			if (Arrays.equals(customerOptions.get(i),o)){
				optionExists = true;
				loc = i;
			}
		}

    	if (optionExists){

    		customerOptions.remove(loc);

    		ByteCLI.printBytes(o);
    		System.out.print(" has been removed from Customer Options");
    		System.out.println();
    	}
    	else{
    		ByteCLI.printBytes(o);
    		System.out.print(" does not exist in Customer Options");
    		System.out.println();
    	}

    }

    public ArrayList<byte[]> getCustomerOptions(){
        return customerOptions;
    }

    public void displayCustomerOptions(){

    	ListIterator<byte[]> optionList = customerOptions.listIterator();

    	while (optionList.hasNext()) {
    		ByteCLI.printBytes(optionList.next());
    		System.out.print(" ");
    	}
    }
    public static void editMenu(){
        Frame gfx=new Frame();
        gfx.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent killGfx){gfx.dispose();}
        });
        //Item ID
        gfx.setSize(800,600);
        TextField itemField=new TextField("Item ID");
        itemField.setBounds(
            300,
            50,
            200,
            25
        );
        gfx.add(itemField);
        //Item Info
        TextField infoField=new TextField("ItemInfo");
        infoField.setBounds(
            300,
            150,
            200,
            25
        );
        gfx.add(infoField);
        //Fetch
        Button fetchItem=new Button("Fetch");
        fetchItem.setBounds(
            300,
            250,
            200,
            50
        );
        gfx.add(fetchItem);
        //Update
        Button updateInfo=new Button("Update");
        updateInfo.setBounds(
            300,
            350,
            200,
            50
        );
        gfx.setLayout(null);
        gfx.setVisible(true);
    }
}
