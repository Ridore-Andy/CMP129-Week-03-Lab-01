import java.util.Scanner;
public class DateTest 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);

        Date d1 = new Date();
        String[] monthName = 
        {"0","January","February","March","April","May","June",
        "July","August","September","October","November","December"};

        System.out.println("Enter the month.");
        int theMonth = keyboard.nextInt();
        while(theMonth < 1 || theMonth > 12)
        {
            System.out.println("That is not a month");
            System.out.println("Enter the month.");
            theMonth = keyboard.nextInt();
        }
        d1.setMonth(theMonth);
        d1.setNameOfMonth(monthName[theMonth]);

        System.out.println("\nEnter the day.");
        int theDay = keyboard.nextInt();
        while(theDay < 1 || theDay > 31)
        {
            System.out.println("There are not that many days in a month");
            System.out.println("Enter the day.");
            theDay = keyboard.nextInt();
        }
        d1.setDay(theDay);

        System.out.println("\nEnter the year.");
        d1.setYear(keyboard.nextInt());

        d1.theDate();

        keyboard.close();
    }
    
}
