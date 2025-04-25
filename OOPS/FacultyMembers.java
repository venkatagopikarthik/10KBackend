 package OOPS;

public class FacultyMembers extends Employee{
    private int departmentCode;
    private int yearsOfServices;
    public FacultyMembers(String employeeId,String name,int departmentCode, int yearsOfServices){
        super( employeeId,name);
        this.departmentCode=departmentCode;
        this.yearsOfServices=yearsOfServices;
    }
public double calculateSalary(double salary){
    return salary+yearsOfServices*1000;

}
public void displayDetails(){
    printBasicInfo();
    System.out.println("Department Code:"+departmentCode);
    System.out.println("Years of Service:"+yearsOfServices);
}
    
}
