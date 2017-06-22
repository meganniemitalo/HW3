import java.util.*;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.nio.file.*;
/**
 * Checkbook records checks and calculates the running balance.
 * Megan Niemitalo
 * 
 */
public class Checkbook
{
    private double balance;
    private ArrayList<Check> checkList;
    private double amount;
    private int numberOfChecks;
    private ObjectOutputStream os;
    private final String FILE_NAME = "checkFile.txt";
    
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook()
    {
        balance = 5000;
        checkList = new ArrayList<Check>();
        amount = 0;
        Path destination = Paths.get(FILE_NAME);
        try{
            os = new ObjectOutputStream(
                                    new FileOutputStream(
                                        destination.toString()));
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }  
    /**
     * Calculates the running balance as user adds checks.
     */
    public double getBalance()
    {
        balance = balance - amount; 
        return balance;
    }
    /**
     * Creates list of checks as user adds individual checks to checkbook.
     */
    public void addCheck (Check newCheck)
    {
        ++numberOfChecks;
        checkList.add(newCheck);
        balance = balance - newCheck.getAmount();
    } 
    /**
     * Retrieves number of checks in chechbook.
     */
    public int getNumberOfCheckList()
    {
        return checkList.size();
    }
    /**
     * Moves value of amount from Check class into Checkbook class. 
     */
    public void enterAmount(double dollarAmount)
    {
        amount = dollarAmount;
    }
    /**
     * Displays amount that the user has entered.
     */
    public double getAmount()
    {
        return amount;
    }
    /**
     * 
     */
    public void appendToFile(Check checkName)
    {
        try{
            os.writeObject(checkName);
            os.flush();
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void appendToFile()
    {
        try{
            for (Check check : checkList){
                os.writeObject(check);
            }
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public void saveOverFile(){
        try{
             os.close();
        } catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
