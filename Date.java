public class Date 
{
    int month = 0;
    int day = 0;
    int year = 0;

    //
    public int getMonth(int month)
    {return month;}
    public void setMonth(int month)
    {this.month = month;}

    public int getDay(int day)
    {return day;}
    public void setDay(int day)
    {this.day = day;}

    public int getYear(int year)
    {return year;}
    public void setYear(int year)
    {this.month = year;}

    public void theDate()
    {
        System.out.println(month+"/"+day+"/"+year);
        System.out.println("month "+day+","+year);
        System.out.println(day+" month "+year);
    }    
}
