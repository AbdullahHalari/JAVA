package bankaccount;

import java.util.Scanner;


public class BankAccount {

    private String Name;
    private int ID;
    
    public BankAccount (String Name, int ID){
        this.Name = Name;
        this.ID = ID;
    }
    
    protected String getName(){
        return Name;
    }
    
    protected int getID(){
        return ID;
    }
    
    
    public static void main(String[] args) {
        String name;
        int phone,pin;
        float balance;
        int choice,ch;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("######################################################");
        System.out.println("\nWELCOME TO MEEZAN, THE PREMIER ISLAMIC BANK");
        System.out.println("\n######################################################");
        System.out.println("To create your account:\nEnter your name:");
        name = sc.nextLine();
        System.out.println("Enter your desired Account Pin-code:");
        pin = Integer.parseInt(sc.nextLine());
        System.out.println("Enter your phone No:");
        phone = Integer.parseInt(sc.nextLine());
        
        BankAccount acc1 = new BankAccount(name, pin);
        
        System.out.println("Which type of Account you want to create?\n1) Current Account\n2) Saving Account\n3) Fixed Deposit Account");
        choice = Integer.parseInt(sc.nextLine());
        switch(choice){
            
            case 1:
                CurrentAcc ca1 = new CurrentAcc(0, name, pin);
                System.out.println("Your account has been successfully created!");
                ca1.cashopt();
                break;
            case 2:
                System.out.println("Before finishing with your registeration, you must deposit an amount about 500rs or more.");
                System.out.println("Enter the amount:");
                balance = Float.parseFloat(sc.nextLine());
                
                do{
                    if(balance>=1000){
                        break;
                    }
                    else{
                        System.out.println("Minimum starting deposit must be 500rs!");
                        System.out.println("Enter the amount:");
                        balance = Float.parseFloat(sc.nextLine());
                    }
                }while(1000>balance);
                
                SaveAcc sa1 = new SaveAcc(balance, name, pin);
                System.out.println("Your account has been successfully created!");
                sa1.cashopt();
                break;              

                
            case 3:
                System.out.println("Before finishing with your registeration, you must deposit an amount:");
                System.out.println("Enter the amount:");
                balance = Float.parseFloat(sc.nextLine());
               
                FixedAcc fa1 = new FixedAcc(balance, name, pin);
                System.out.println("Your account has been successfully created!");
                fa1.cashopt();
                break;
                
            default:
                System.out.println("Invalid option!");
                break;
                
        }
    
        
    }
    

   
    
}
