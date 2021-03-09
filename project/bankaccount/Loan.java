package bankaccount;
import java.util.*;

public class Loan extends Account{

    Scanner sc = new Scanner(System.in);

    Loan(String Name, int phone){
        super(Name, phone);
    }
    
public void home(){
        System.out.println("##########################################");
        System.out.println("\tLOAN CONDITIONS: \n\tInterest Rate is 4% after 12 months \n\tMinimum Amount 2,00,000  \n\tMaximum 20,00,000 \n\tTime Period 2 to 5 years");
        System.out.println("##########################################");
        
        System.out.println("\tHow much loan you want:");
        int loan = sc.nextInt();

        System.out.println("\tHow many years would you like to repay?");
        int time = sc.nextInt();

    
        if(loan >= 200000){
            if(time==1){
                System.out.println("\tSUCCESSFULLY your loan application accepted ");
                System.out.println("\tyou repay" + loan + "with 12months");
            }
            else{
                System.out.println("\tSUCCESSFULLY your loan application accepted ");
                int interest = loan*4/100;
                int year = (time-1)*interest;
                System.out.println("\tyou repay " + (loan+year) + " with in " + time + " years" );
            }
        }
        else{
            
            System.out.println("\tyou must apply for loan upto 2,00,000\n");
        }
    
    
    
    }

    public void bussiness(){
        System.out.println("##########################################");
        System.out.println("\tLOAN CONDITIONS: \n\tInterest Rate is 2%  \n\tMinimum Amount 1,00,000  \n\tMaximum 10,00,000 \n\tTime Period 1 to 3 years");
        System.out.println("##########################################");
        
        System.out.println("\tHow much loan you want:");
        int loan = sc.nextInt();

        System.out.println("\tHow long would you like to repay?");
        int time = sc.nextInt();

    
        if(loan >= 100000){
           
                System.out.println("\tSUCCESSFULLY your loan application accepted ");
                int interest = loan*2/100;
                int year = (time)*interest;
                System.out.println("\tyou repay " + (loan+year) + " with in " + time + " years" );
            
        }
        else{
            
            System.out.println("\tyou must apply for loan upto 1,00,000\n");
        }
    
    
    
    }
    public void other(){
        System.out.println("##########################################");
        System.out.println("\tLOAN CONDITIONS: \n\tInterest Rate is 3%  \n\tMinimum Amount 50,000  \n\tMaximum 5,00,000 \n\tTime Period 1 to 4 years");
        System.out.println("##########################################");
    
        System.out.println("\tHow much loan you want:");
        int loan = sc.nextInt();

        System.out.println("\tHow many years would you like to repay ?");
        int time = sc.nextInt();

        System.out.println("\tWhat are you borrowing for ?");
        String others = sc.next();

        if(loan >= 50000){
           
                System.out.println("\tSUCCESSFULLY your loan application for " + others + " accepted.");
                int interest = loan*3/100;
                int year = (time)*interest;
                System.out.println("\tyou repay " + (loan+year) + " with in " + time + " years" );
            
        }
        else{
            
            System.out.println("\tyou must apply for loan upto 50,000\n");
        }
    
    
    
    }
public void loan_types(){
     System.out.println("\tdo you want loan:"); 
               String ask_loan = sc.nextLine();
                if(ask_loan.equals("yes")){

                    boolean quit = false;
                    int a;
                    
                    do{ 
                    
                        System.out.println("\n\tDo You want to: \n\t1]LOAN FOR HOME\n\t2]LOAN FOR BUSSINESS\n\t3]LOAN FOR OTHERS \n\t4] Quit\n\tEnter your choice: ");
                        a = sc.nextInt();
                        switch(a){
                        
                            case 1:
                                home();
                                break;
                            case 2:
                                bussiness();
                                break;
                            case 3:
                                other();
                                break;
                            case 4:
                                quit = true;
                                break;
                            default:
                                System.out.println("\tInvalid option!\n");
                                break;
                            }
                    }while(quit!=true);
                }  
                else {
                    
                    System.out.println("\tThank you for your response\n");
                }     
}
}