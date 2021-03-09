
package bankaccount;


import java.util.Scanner;


public class FixedAcc extends BankAccount{
    private float balance;
    float prof,amount;
    Scanner sc = new Scanner(System.in);
    int month = 0;
    
    FixedAcc(float balance, String Name, int pin){
        super(Name, pin);
        this.balance = balance;
    }
    
    float withdraw (float amount){
      if (this.balance < 0)
      {
          System.out.println("You Insufficient!");
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
        
        System.out.println("Enter deposit amount: ");
        amount = Float.parseFloat(sc.nextLine());
        if(0 > amount){
            System.out.println("Invalid amount!");
            depositAmt();
        }
        else{
            balance = balance + amount;
            System.out.println("Your amount deposited successfully!");
        }
        

    }
    
    void withdrawAmt(float amount,float prof){ //overloading
        this.amount = amount;
        this.prof = (this.balance*10)/100;
        
        System.out.println("Enter months");
        month = Integer.parseInt(sc.nextLine());
        if(month>=6){
            System.out.println("Enter amount for withdrawn: ");
            amount = Integer.parseInt(sc.nextLine());
            this.withdraw(amount);
                System.out.println("Your request has been completed, Connggratulaton you recieve 10% profit of your total which is " + prof);
                System.out.println("Your remaining balance is "+ this.balance);
            }
        
        else{
                System.out.println("you are not eligible because you can only withdraw after 6 months period");
            }
        }
    

    void viewAmt(){
        System.out.println("Account Balance: " + this.balance);
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
                    withdrawAmt(amount,prof);
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
