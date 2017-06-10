
/**
 * System for printing checks.
 *
 * Megan Niemitalo
 */
public class Check
{
    private String name;
    private int checkNumber;
    private String payee;
    public float amount;
    private String reason;

    /**
     * Constructor for objects of class Check
     */
    public Check(int dollarAmount)
    {
        amount = dollarAmount;
        name = "Megan Niemitalo";
        checkNumber = 1;
        payee = "unknown";
        reason = "unknown";
        
    }
    
    /**
     * User indicates the reason for writing the check, ex. groceries or utilities.  
     */
    public void writeReason(String purpose)
    {
        reason = purpose;
    }
    
    /**
     * User indicates the person or thing for whom they are writing the check.
     */
    public void writePayee(String name)
    {
        payee = name;

    }
    
    /**
     * User notes the check number.
     */
    public void writeCheckNumber(int number)
    {
        checkNumber = number;
    }
    
    /**
     * Retrieves the check amount.
     */
    public float getAmount()
    {
        return amount;
    }
    
    /**
     * Retrieves the reason for which the user wrote the check.
     */
    public String getReason()
    {
        return reason;
    }
    
    /**
     * Retrieves the payee of the check.
     */
    public String getPayee()
    {
        return payee;
    }
    
    /**
     * Retrieves the check number.
     */
    public int getCheckNumber()
    {
        return checkNumber;
    }
    
    /**
     * Retrieves the name of the user who is writing the check.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Prints the check.
     */
    public void printCheck()
    {
        System.out.println(name + "                       " + checkNumber);
        System.out.println("Pay to the order of " + payee + " $" + amount);
        System.out.println("For " + reason);
    }
}
