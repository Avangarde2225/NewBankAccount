import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();


        String file = "C:\\Users\\suler\\Desktop\\udemyexcelfile.csv";

       /* Checking chkacc1 = new Checking("Tom Wilson","233222334", 1500);

        Savings savacc1 = new Savings("Rick Lok", "456789988", 2500);

        savacc1.compound();

        savacc1.showInfo();
        System.out.println("******************************");
        chkacc1.showInfo();
*/


        // read a csv file and create new accounts based on that data

        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder:newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if(accountType.equals("Savings")){
                System.out.println("Open a savings account");
                accounts.add(new Savings(name, sSN, initDeposit));

            } else if ( accountType.equals("Checking")){
                System.out.println("Open a checking account");
                accounts.add(new Checking(name, sSN,initDeposit));
            } else{
                System.out.println("Error reading the account type");
            }
        }
        for (Account acc: accounts){
            System.out.println("\n********************");
            acc.showInfo();
        }

    }
}
