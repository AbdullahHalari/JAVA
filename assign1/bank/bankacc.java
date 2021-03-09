
import java.util.*;

public class bankacc {
    
    static Scanner data = new Scanner(System.in); 
    String name;
    int amount, acc_no, balance, transfer_acc_no;

    bankacc(String name, int balance, int acc_no){
        this.name = name;
        this.acc_no = acc_no;
        this.balance = balance;
    }
    
    void depositAmt(){
        
        System.out.println("Enter deposit amount: ");
        amount = Integer.parseInt(data.nextLine());
        if(0 > amount){
            System.out.println("Invalid amount!");
            depositAmt();
        }
        else{
            balance = balance + amount;
            System.out.println("Your amount has been deposited successfully!");
        }
        

    }
    
    void withdrawAmt(){
        
        System.out.println("Enter withdrawal amount: ");
        amount = Integer.parseInt(data.nextLine());
        if(0 > amount){
            System.out.println("Invalid amount!");
            withdrawAmt();
        }
        else if(amount > balance){
            System.out.println("You have insufficient Balance!");
        }
        else{
            balance = balance - amount;
            System.out.println("Your cash has been withdrawn successfully!");
        }
        
    }
    
    void transferAmt(){
        
        System.out.println("Enter transfer amount: ");
        amount = Integer.parseInt(data.nextLine());

        System.out.println("Enter the account number to transfer the amount into: ");
        transfer_acc_no = Integer.parseInt(data.nextLine());
        
        if(0 > amount){
            System.out.println("Invalid amount!");
            transferAmt();
        }
        else if(amount > balance){
            System.out.println("You have insufficient Balance!");
        }
        else{
            balance = balance - amount;
            System.out.println("Your amount has been transferred to [" + transfer_acc_no + "] successfully!");
        }
        
    }

    
    void viewAmt(){
    
        System.out.println("Account Number: " + acc_no);
        System.out.println("Account Balance: " + balance);
    }
    
    
}
