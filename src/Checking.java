public class Checking extends Account {
    //list properties specific to checking account
    private int debitCardNumber;
    private int debitCardPin;

    //Constructor to initialize checking account properties
    public Checking(String name, String sSN, double initDeposit){
        super(name,sSN,initDeposit);
        accountNumber = "2" + accountNumber;
       // System.out.println("Account number: " + this.accountNumber);
       // System.out.println("new checking account");

        setDebitCard();

    }
    @Override
    public void setRate() {
        System.out.println("Implement rate for checking");
        rate = getBaseRate() * .15;
    }
    private void setDebitCard(){
        debitCardNumber = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));
    }



    //List any methods specific to the checking account
    public void showInfo(){
        super.showInfo();
        System.out.println(" Your Checking Account Features" + "\nDebit Card Number : " + debitCardNumber + "\n Debit Card Pin: " + debitCardPin );

    }
}
