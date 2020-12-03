/*
 * Edison Flanagan
 * 20201127
 * Section W01 (?)
 */
package restaurantsystem;
import restaurantsystem.ByteCLI;
/**
 *
 * @author AresUII
 */
public class Employee {
    long employeeID;
    byte[] employeeName;
    long[] employeeHash;//Password; looking at implementing BLAKE2b
    byte[] employeeImagePath;
    public Employee(long empID,byte[] empName,long[] empHash,byte[] empImg){
        employeeID=empID;
        System.arraycopy(empName,0,employeeName,0,150);
        System.arraycopy(empHash,0,employeeHash,0,8);
        System.arraycopy(empImg,0,employeeImagePath,0,255);
    }
    
}
