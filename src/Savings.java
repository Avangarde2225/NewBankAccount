public class Savings extends Account {
    //list properties specific to savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    int getSafetyDepositBoxIDdepositBoxKey;

    //Constructor to initialize settings for the savings account properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1"+ accountNumber;
       // System.out.println("Account number: " + this.accountNumber);
       // System.out.println("New Savings Account");

        setSafetyDepositBox();


    }
    @Override
    public void setRate()
    {
        System.out.println("Implement rate for savings");
        rate = getBaseRate() - .25;
    }


    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey= (int)(Math.random() * Math.pow(10,4));
    }




    //List any methods specific to the savings account
    public void showInfo(){
        super.showInfo();
        System.out.println(" Your Savings Account Features" + "\nSafety deposit box id : " + safetyDepositBoxID + "\nSafety Deposit Box Key : " + safetyDepositBoxKey );

    }

}
