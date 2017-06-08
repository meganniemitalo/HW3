import java.util.*;
/**
 * Checkbook records checks and calculates the running balance.
 * Megan Niemitalo
 * 
 */
public class Checkbook
{
    private float balance;
    private ArrayList<Check> checkList;
    private float amount;
    
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook()
    {
        balance = 5000;
        checkList = new ArrayList<Check>();
        amount = 0;
    }  
    /**
     * Calculates the running balance as user adds checks.
     */
    public float getBalance()
    {
        balance = balance - amount; 
        return balance;
    }
    /**
     * Creates list of checks as user adds individual checks to checkbook.
     */
    public void addCheck (Check newCheck)
    {
        checkList.add(newCheck);
    } 
    /**
     * Retrieves number of checks in chechbook.
     */
    public int getNumberOfCheckList()
    {
        return checkList.size();
    }
    /**
     * User enters check amount in order to calculate the balance. 
     */
    public void enterAmount(float dollarAmount)
    {
        amount = dollarAmount;
    }
    /**
     * Displays amount that the user has entered.
     */
    public float getAmount()
    {
        return amount;
    }
}
