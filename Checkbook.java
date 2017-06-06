import java.util.*;
/**
 * Checkbook lists all necessary information for each check written and calculates 
 * the new balance.
 * Megan Niemitalo
 * 
 */
public class Checkbook
{
    private String date;
    private int checkNumber;
    private String reason;
    private int amount;
    private int balance;
    private ArrayList<Check> checkList;
    
    /**
     * Constructor for objects of class Checkbook
     */
    public Checkbook()
    {
        date = "June 6, 2017";
        checkNumber = 0;
        reason = "unknown";
        amount = 0;
        balance = 5000;
        checkList = new ArrayList<Check>();
    }

    public void writeDate(String date)
    {
        date = date;
    }
    
    public void writeCheckNumber(int number)
    {
        checkNumber = number;
    }
    
    public void writeReason(String purpose)
    {
        reason = purpose;
    }
    
    public void writeAmount(int dollars)
    {
        amount = dollars;
    }
    
    public int getBalance()
    {
        balance = balance - amount;
        return balance;
    }
}
