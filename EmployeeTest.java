public class EmployeeTest 
{
    public static void main(String[] args) 
    {
        Employee e1 = new Employee("Susan Meyers",47899,"Accounting","Vice President");
        Employee e2 = new Employee("Mark Jones",39119,"IT","Programmer");
        Employee e3 = new Employee("Joy Rogers",81774,"Manufacturing","Engineer");

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
    
}
