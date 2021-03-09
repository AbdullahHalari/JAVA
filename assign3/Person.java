package assign3;

import java.util.*;

public class Person {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        String name,work,designation;
        int empID;
        
        System.out.println("Enter the name: ");
        name = sc.nextLine();

        System.out.println("Is he person working? (yes/no): ");
        work = sc.nextLine();
        
        
        if("YES".equals(work) || "yes".equals(work)){
            
            System.out.print("Enter the Employee ID: ");
            empID = Integer.parseInt(sc.nextLine());
            
            System.out.print("Employee Designation? ");
            designation = sc.nextLine();
            
                    if("MANAGER".equals(designation) || "manager".equals(designation)){
            
                        Manager m = new Manager(name,empID,"Full-Time Employee");
                        m.display();
            
                    }
            
                    else if("ENGINEER".equals(designation) || "engineer".equals(designation)){
                
                        System.out.println("Is " + name + " Full-Time Employee? (yes/no): ");
                        String type = sc.nextLine();
                
                            if("YES".equals(type) || "yes".equals(type)){
                                type = "Full-Time Employee";
                            }
                            
                            else{
                                type = "Part-Time Employee";
                            }
                
                        Engineer e = new Engineer(name,empID,type,designation);
                        e.display();
                    }
            }
        
        else{
            System.out.println("Therefore, " + name + " is a student.");
        }
        
    }
    
}
