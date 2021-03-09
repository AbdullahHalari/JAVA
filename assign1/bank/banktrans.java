import java.util.*;

public class banktrans {
        
    
    public static void main(String[] args) {
        
        int account_no, bal, option;
        
        String n;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name: ");
        n = input.nextLine();
        System.out.println("Enter your desired 5-digit account number: ");
        account_no = Integer.parseInt(input.nextLine());

        System.out.println("Enter initial balance deposit amount: ");
        bal = Integer.parseInt(input.nextLine());
        
        bankacc account1 = new bankacc(n, bal, account_no);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$|   AL HABIB BANK (Pvt. Ltd.)   |$$$$$$$$$$$$$$$$$$$$$");

        int quit=0;
        
        do{
            System.out.println("\n1) Deposit Cash ");
            System.out.println("2) Transfer Amount ");
            System.out.println("3) Withdraw Cash ");
            System.out.println("4) View Account Balance ");
            System.out.println("5) Quit \n");
            System.out.println("Please enter the option: ");
            option = Integer.parseInt(input.nextLine());
        
            switch(option){
                case 1:
                    account1.depositAmt(); 
                        break;
                case 2:
                    account1.transferAmt();
                    break;
                case 3:
                    account1.withdrawAmt();
                    break;
                case 4:
                    account1.viewAmt();
                    break;
                case 5:
                    quit = 1;
                    break;
                default:
                    System.out.println("Chose a valid option!");
                    break;
            }
        }while(quit != 1);
       
    }
    
}