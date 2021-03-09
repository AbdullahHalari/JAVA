package bankaccount;

import java.util.Scanner;

public class SaveAcc extends BankAccount{
    
    private float balance;
    int month = 0;
    
    Scanner sc = new Scanner(System.in);
    
    SaveAcc(float balance, String Name, int pin){
        super(Name, pin);
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
    
    float withdraw (float amount){
      if (this.balance < 0)
      {
          System.out.println("You do not have sufficient balance in your account!");
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
        System.out.println("Enter months");
        month = Integer.parseInt(sc.nextLine());
        if(month>=1){
            prof = ((this.balance*2)/100)*month;
            System.out.println("Enter amount to be withdrawn: ");
            amount = Integer.parseInt(sc.nextLine());
            this.withdraw(amount);
                System.out.println("Your request has been completed, You will also recieve %2 monthly profit of your total which is " + prof);
                System.out.println("Your remaining balance is "+ this.balance);
            }
        
        else{
                System.out.println("you are not eligible because you can only withdraw after exactly a month");
            }
        }


    void viewAmt(){
        System.out.println("Account balance: " + (balance));
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
                    withdrawAmt();
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
    

    

