package bankaccount;

import java.util.Scanner;
import java.util.jar.Attributes.Name;


public class Account {
    
    String name;
    int phone;
    float balance;
    int choice,ch;
    private String Name;
    private int phone_no;
    
    Scanner sc = new Scanner(System.in);

    public Account (String Name, int phone_no){
        this.Name = Name;
        this.phone_no = phone_no;
    }
    
    protected String getName(){
        return Name;
    }
    
    protected int get_phone(){
        return phone_no;
    }
    

    public void types(){

    
    System.out.println("\n\tWhich type of Account you want to create?\n\t1) Current Account\n\t2) Saving Account\n\t3) Fixed Deposit Account");
        choice = Integer.parseInt(sc.nextLine());
        
        switch(choice){
            
            case 1:
                CurrentAcc ca1 = new CurrentAcc(0, name, phone);
                System.out.println("\tYour account has been successfully created!\n");
                ca1.cashopt();
                break;
            case 2:
                System.out.println("\tBefore finishing with your registeration, you must deposit an amount about 1000rs or more.");
                System.out.println("\tEnter the amount:");
                balance = Float.parseFloat(sc.nextLine());
                
                do{
                    if(balance>=1000){
                        break;
                    }
                    else{
                        System.out.println("\tMinimum starting deposit must be 1000rs!");
                        System.out.println("\tEnter the amount:");
                        balance = Float.parseFloat(sc.nextLine());
                    }
                }while(1000>balance);
                
                SaveAcc sa1 = new SaveAcc(balance, name, phone);
                System.out.println("\tYour account has been successfully created!\n");
                sa1.cashopt();
                break;              

                
            case 3:
                System.out.println("\tBefore finishing with your registeration, you must deposit an amount:");
                System.out.println("\tEnter the amount:");
                balance = Float.parseFloat(sc.nextLine());
               
                FixedAcc fa1 = new FixedAcc(balance, name, phone);
                System.out.println("\tYour account has been successfully created!\n");
                fa1.cashopt();
                break;

            default:
                System.out.println("\tInvalid option!\n");
                break;
            }
                
    }
}