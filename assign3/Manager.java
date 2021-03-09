package assign3;


public class Manager implements SalaryInterface{
    
    String name;
    private int empID;
    String designation = "Manager";
    String type;
    double salary = 90000; 
    
    Manager(String name, int empID, String type){
        
        this.type = type;
        this.name = name;
        setID(empID);
        
    }
    
        public void setID(int empID){
            this.empID = empID;
        }
    
        public int getID(){
            return empID;
        }
    
    public void display(){
        
        System.out.println("888888888888888888888888888888");
        System.out.println("Name: " + name);
        System.out.println("ID: " + this.getID());
        System.out.println("Designation: " + designation);
        System.out.println("Employee Type: " + type);
        System.out.println("Salary: " + salary + " per month");
        System.out.println("888888888888888888888888888888");
        
    }
    
    @Override
    public double calcsalary(float weekhrs){
        
        double amount = weekhrs * 4;
        amount = amount * 500;
        return amount;
        
    }
}