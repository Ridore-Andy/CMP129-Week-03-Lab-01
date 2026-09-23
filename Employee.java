public class Employee 
{
    private String name;
    private int idNumber;
    private String department;
    private String position;

    //constuctor 1
    public Employee(String name, int idNumber, String department, String position)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }

    //constructor 2
    public Employee(String name, int idNumber)
    {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    //constructor 3
    public Employee()
    {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }


    public String getName()
    {return name;}
    public void setName(String name)
    {this.name = name;}

    public int getIdNumber()
    {return idNumber;}
    public void setIdNumber(int idNumber)
    {this.idNumber = idNumber;}

    public String getDepartment()
    {return department;}
    public void setDepartment(String department)
    {this.department = department;}

    public String getPosition()
    {return position;}
    public void setPosition(String position)
    {this.position = position;}
    

    //display
    public void displayInfo()
    {
        System.out.printf("\n%-20s %-20s %-20s %-20s%n","Name","ID Number","Department","Position");
        System.out.printf("%-20s %-20s %-20s %-20s%n",name, idNumber, department, position);
    }
}
