package assign3;

import java.util.*;

public class Engineer extends Manager{
    
    Engineer(String name, int empID, String type, String designation){
        
        super(name,empID,type);
        super.designation = designation;
        super.setID(empID);
        
    }
    
    @Override
    public void display(){
        double sal = 0;
        Scanner sc = new Scanner(System.in);
        
        float hrs;
        
        if("Part-Time Employee".equals(type)){
            System.out.print("Enter average work hours in a week for this month: ");
            hrs = Float.parseFloat(sc.nextLine());
            sal = super.calcsalary(hrs);
        }
        
        else{
            hrs = 40;
            sal = super.calcsalary(hrs);
        }
        
        
        System.out.println("888888888888888888888888888888");
        System.out.println("Name: " + name);
        System.out.println("ID: " + this.getID());
        System.out.println("Designation: " + designation);
        System.out.println("Employee Type: " + type);
        System.out.println("Salary: " + sal + " per month");
        System.out.println("888888888888888888888888888888");
}
    
}
