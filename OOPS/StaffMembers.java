 package OOPS;

public class StaffMembers extends Employee {
    private String designation;
    private double overtimeHours;
    public StaffMembers(String employeeId,String name,String designation,double overtimeHours){
        super(employeeId, name);
        this.designation=designation;
        this.overtimeHours=overtimeHours;
    }
public double calculateSalary(double salary){
    return salary+25*overtimeHours;
}
public void displayDetails(){
    printBasicInfo();
    System.out.println("Designation:"+designation);
    System.out.println("Overtime:"+overtimeHours);
}
    
}
