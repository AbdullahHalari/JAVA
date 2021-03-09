package bankaccount;

import java.util.Scanner;


public class CurrentAcc extends Account{    
    
    private float balance;  
    float amount;
    Scanner sc = new Scanner(System.in);
    
    CurrentAcc(float balance, String Name, int phone){ 
        super(Name, phone);                         
        this.balance = balance;
    }
    
    float getbalance(){     
        return balance;
    }
    
    void depositAmt(){
        float amount;
        System.out.println("\tEnter deposit amount: ");
        amount = Integer.parseInt(sc.nextLine());
        if(0 == amount){
            System.out.println("\tInvalid amount!\n");
            depositAmt();
        }
        else{
            balance = balance + amount;
            System.out.println("\tYour cash has been deposited successfully!\n");
        }
        

    }
    
    void withdrawAmt(float amount){ 
        this.amount = amount;
        
        System.out.println("\tEnter withdrawal amount: ");
        amount = Integer.parseInt(sc.nextLine());
        if(0 == amount){
            System.out.println("\tInvalid amount!\n");
            withdrawAmt(amount);
        }
        else if(amount > balance){
            System.out.println("\tYou have insufficient Balance!");
        }
        else{
            balance = balance - amount;
            System.out.println("\tYour cash has been withdrawn successfully!");
        }
        
    } 

    void viewAmt(){
        System.out.println("\tAccount Balance: " + balance);
    }
    

    void cashopt(){
        boolean quit = false;
        int a;
        
        
        do{ 
        
            System.out.println("\n\tDo You want to: \n\t1] Deposit Amount\n\t2] Withdraw Amount\n\t3] View Amount\n\t4] LOAN \n\t5] Quit\n\tEnter your choice:");
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
                    Loan obj = new Loan(name,phone);
                     obj.loan_types();   
                    break;
                    
                case 5:
                    quit = true;
                    System.out.println("\tThank You for creating Account\n");
                    break;
                default:
                    System.out.println("\tInvalid option!\n");
                    break;
                }
        }while(quit!=true);
}
}
    
