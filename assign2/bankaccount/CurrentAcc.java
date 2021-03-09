package bankaccount;

import java.util.Scanner;


public class CurrentAcc extends BankAccount{    //inheritance
    
    private float balance;  // using Access
    float amount;
    Scanner sc = new Scanner(System.in);
    
    CurrentAcc(float balance, String Name, int pin){ //constructor
        super(Name, pin);                         
        this.balance = balance;
    }
    
    float getbalance(){     //Access modifier
        return balance;
    }
    
    void depositAmt(){
        float amount;
        System.out.println("Enter deposit amount: ");
        amount = Integer.parseInt(sc.nextLine());
        if(0 > amount){
            System.out.println("Invalid amount!");
            depositAmt();
        }
        else{
            balance = balance + amount;
            System.out.println("Your cash has been deposited successfully!");
        }
        

    }
    
    void withdrawAmt(float amount){ //
        this.amount = amount;
        
        System.out.println("Enter withdrawal amount: ");
        amount = Integer.parseInt(sc.nextLine());
        if(0 > amount){
            System.out.println("Invalid amount!");
            withdrawAmt(amount);
        }
        else if(amount > balance){
            System.out.println("You have insufficient Balance!");
        }
        else{
            balance = balance - amount;
            System.out.println("Your cash has been withdrawn successfully!");
        }
        
    } 


    void viewAmt(){
        System.out.println("Account Balance: " + balance);
    }
    
    void cashopt(){
        boolean quit = false;
        int a;
        
        
        do{ 
        
            System.out.println("Do You want to: \n1] Deposit Amount\n2] Withdraw Amount\n3] View Account\n4] Quit\nEnter your choice:");
            a = Integer.parseInt(sc.nextLine());
            
            switch(a){
            
                case 1:
                    depositAmt();
                    break;
                case 2:
                    withdrawAmt(amount);
                    break;
                case 3:
                    viewAmt();
                    break;
                case 4:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
                }
        }while(quit!=true);
}
}
    
