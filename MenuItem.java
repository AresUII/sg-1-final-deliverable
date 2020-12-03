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
/**
 *
 * @author ill-education
 */
public class MenuItem {
    private byte[] itemName = new byte[50];
    private double price;
    private ArrayList<byte[]> customerOptions = new ArrayList<byte[]>();

    public MenuItem() {
    	byte[] a = "Item Name".getBytes();
    	System.arraycopy(a,0,itemName,0,a.length);
    	price = 0.00;
	}

    public MenuItem(byte[] name, double p) {
    	System.arraycopy(name,0,itemName,0,name.length);
    	price = p;
	}

    //TODO: bools or bytes for any options we need to add
    public void setMenuItemName(byte[] a){
        System.arraycopy(a,0,itemName,0,a.length);
    }

    public byte[] getMenuItemName(){
        return itemName;
    }

    public void setMenuItemPrice(double p){
        price = p;
    }

    public double getMenuItemPrice(){
        return price;
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
}
