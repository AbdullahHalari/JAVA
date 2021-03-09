package bankaccount;

import java.util.Scanner;

public class SaveAcc extends Account{
    
    private float balance;
    int month = 0;
    
    Scanner sc = new Scanner(System.in);
    
    SaveAcc(float balance, String Name, int phone){
        super(Name, phone);
        this.balance = balance;
    }
    
    float getbalance(){
        return balance;
    }
    
    float prof(){
        float val;
        
        val = (balance*2)/100;
        val = val+balance;
        
        return val;
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
    
    float withdraw (float amount){
      if (this.balance < 0)
      {
          System.out.println("\tYou do not have sufficient balance in your account!");
      }
      else
      {
         this.balance -= amount;
      }
      
      return this.balance;
   }
    
    void withdrawAmt(){
        float prof;
        float amount;
        System.out.println("\tEnter how many months ago you created you account");
        month = Integer.parseInt(sc.nextLine());
        if(month>=1){
            prof = ((this.balance*3)/100)*month;
            System.out.println("\tEnter amount to be withdrawn: ");
            amount = Integer.parseInt(sc.nextLine());
            this.withdraw(amount);
                System.out.println("######################################################");
                System.out.println("\tYour request has been completed,\n\tYou will also recieve %3 monthly profit of your total which is " + prof);
                System.out.println("\tThe total amount you recieved  " + (amount+prof) );
                System.out.println("\tYour remaining balance is "+ this.balance);
                System.out.println("######################################################");
        }
        
        else{
                System.out.println("\tyou are not eligible because you can only withdraw after exactly a month");
            }
        }


    void viewAmt(){
        System.out.println("\tAccount balance: " + (balance));
    }
    
    
    void cashopt(){
        boolean quit = false;
        int a;
        
        do{ 
            System.out.println("\tDo You want to: \n\t1] Deposit Amount\n\t2] Withdraw Amount\n\t3] View Amount\n\t4] LOAN \n\t5] Quit\n\tEnter your choice:");
            a = Integer.parseInt(sc.nextLine());
        
        
            switch(a){
            
                case 1:
                    depositAmt();
                    break;
                case 2:
                    withdrawAmt();
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
                    System.out.println("\tThank for creating Account\n");
                    break;
                default:
                    System.out.println("\tInvalid option!\n");
                    break;
                }
            }while(quit!=true);
    }
}