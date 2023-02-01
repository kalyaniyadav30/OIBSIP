import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        char c;
        int Customerid=9617619;
        int Customerpin=415003;
        String CustomerIFSCcode="OSIS0022567";

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter customer Id: ");
        int id=sc.nextInt();

        System.out.println("Enter customer Pin: ");
        int pin=sc.nextInt();

        System.out.println("Enter customer IFSC CODE: ");
        String code=sc.next();
        System.out.println();
        if(Customerid == id && Customerpin == pin && CustomerIFSCcode.equals(code) )
        {
            System.out.println("You are welcomed to our PCT Bank");
            System.out.println("Customer name: MS.PREETI CHAUHAN");
            System.out.println("Customer account number: 1596215111371924");
            System.out.println("Customer's city: PUNE");
            System.out.println("");

            while(true)
            {
                int balance=5000;
                int withdraw;
                int deposit;
                System.out.println("WELCOME TO OUR ATM");
                System.out.println("Choice 1:Transaction History");
                System.out.println("Choice 2:Withdraw");
                System.out.println("Choice 3:Deposit");
                System.out.println("Choice 4:Transfer");
                System.out.println("Choice 5:Quit");
                System.out.println("Please select any of the above choices that you wish to perform: ");
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println(" VIEW YOUR TRANSACTION HISTORY ");
                        System.out.println("Account Balance:- " +balance);
                        break;
                    case 2:
                        System.out.println(" ENTER MONEY TO BE WITHDRAWN ");
                        withdraw=sc.nextInt();
                        if(balance>withdraw)
                        {
                            balance=balance-withdraw;
                            System.out.println("You can withdraw your money");
                        }
                        else
                        {
                            System.out.println("Unfortunately you cannot withdraw your money");
                        }
                        System.out.println("");
                        break;
                    case 3:
                        System.out.println(" ENTER MONEY YOU WANT TO DEPOSIT ");
                        deposit=sc.nextInt();
                        balance=balance+deposit;
                        System.out.println("Money is being deposited successfully");
                        System.out.println("");
                        break;
                    case 4:
                        System.out.println(" ENTER BANK DETAILS TO TRANSFER YOUR MONEY: ");
                        String bankname=sc.next();
                        System.out.println();
                        int accountnumber=sc.nextInt();
                        System.out.println("ENTER AMOUNT OF MONEY YOU WANT TO TRANSFER: ");
                        float amount=sc.nextFloat();
                        if(amount<=balance)
                        {
                            System.out.println("TRANSFER SUCCESSFUL");
                        }
                        else
                        {
                            System.out.println("TRANSFER FAILED");
                        }
                        break;
                    case 5:
                        System.exit(0);
                        break;

                }
                System.out.println("DO YOU WANT TO CONTINUE(Yes/No)?");
                c=sc.next().charAt(0);
                if(c=='Y')
                {
                    continue;
                }
                if(c=='N')
                {
                    System.exit(0);
                }
            }


        }


    }
}


