 package OOPS;
public class OOPS {
    public static void main(String[] args) {
        FacultyMembers fm=new FacultyMembers("504VP4","gopi" , 495,10 );
        StaffMembers sm=new StaffMembers("349dfr", "karthik", "hr", 20);
        fm.displayDetails();
        System.out.println("Monthly Salary $"+fm.calculateSalary(40000));
        sm.displayDetails();
        System.out.println("Monthly Salary $"+sm.calculateSalary(90000));
        
    }
    
}
