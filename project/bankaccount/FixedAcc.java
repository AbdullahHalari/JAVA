package bankaccount;

import java.util.Scanner;

public class FixedAcc extends Account{
    private float balance;
    float prof,amount;
    Scanner sc = new Scanner(System.in);
    int month = 0;
    
    FixedAcc(float balance, String Name, int phone){
        super(Name, phone);
        this.balance = balance;
    }
    
    float withdraw (float amount){
      if (this.balance < 0)
      {
          System.out.println("\tYou Insufficient!\n");
      }
      else
      {
         this.balance -= amount;
      }
      
      return this.balance;
   }
    
    
    float getbalance(){
        return balance;
    }
    
    void depositAmt(){
        float amount;
        
        System.out.println("\tEnter deposit amount: ");
        amount = Float.parseFloat(sc.nextLine());
        if(0 == amount){
            System.out.println("\tInvalid amount!");
            depositAmt();
        }
        else{
            balance = balance + amount;
            System.out.println("\tYour amount deposited successfully!\n");
        }
        

    }
    
    void withdrawAmt(float amount,float prof){ 
        this.amount = amount;
        this.prof = (this.balance*10)/100;
        
        System.out.println("\tEnter how many months ago you created your account");
        month = Integer.parseInt(sc.nextLine());
        if(month>=6){
            System.out.println("\tEnter amount for withdrawn: ");
            amount = Integer.parseInt(sc.nextLine());
            this.withdraw(amount);
                System.out.println("######################################################");
                System.out.println("\tYour request has been completed,\n\tCongratulaton you recieve 10% profit of your total which is " + prof);
                System.out.println("\tThe total amount you recieved  " + (amount+prof) );
                System.out.println("\tYour remaining balance is "+ this.balance);
                System.out.println("######################################################");
            }
        
        else{
                System.out.println("\tyou are not eligible because you can only withdraw after 6 months period");
            }
        }
    

    void viewAmt(){
        System.out.println("\tAccount Balance: " + this.balance);
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
                    withdrawAmt(amount,prof);
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
                    System.out.println("\tThank for creating Account!\n");

                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
                }
            }while(quit!=true);
}
    
}
