package restaurantsystem;

/*
 * Edison Flanagan
 * Juan Jaime
 * [add your names here]
 */

/**
 *
 * @author AresUII
 */
import restaurantsystem.ByteCLI;
import restaurantsystem.MenuItem;
public class CustomerOrder { 
    // Declaring all variables that are going to be used on this class
    MenuItem[] itemList;
    
	private int OrderID, TableID, Subtotal, Tax, Total;

	
	//Setterss and getters for each variable
    public itemList[] 
    
	public int getOrderID() {
		return OrderID;
	}

	public void setOrderID(int orderID) {
		OrderID = orderID;
	}

	public int getTableID() {
		return TableID;
	}

	public void setTableID(int tableID) {
		TableID = tableID;
	}

	public int getSubtotal() {
		return Subtotal;
	}

	public void setSubtotal(int subtotal) {
		Subtotal = subtotal;
	}

	public int getTax() {
		return Tax;
	}

	public void setTax(int tax) {
		Tax = tax;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}
    long tip;
    double getTip(){return (double)(tip*200.0d;)}
}
