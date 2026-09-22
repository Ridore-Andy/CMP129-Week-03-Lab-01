public class Date 
{
    int month = 0;
    int day = 0;
    int year = 0;
    String nameOfMonth;

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
    {this.year = year;}

    public String getNameOfMonth(String nameOfMonth)
    {return nameOfMonth;}
    public void setNameOfMonth(String nameOfMonth)
    {this.nameOfMonth = nameOfMonth;}

    public void theDate()
    {
        System.out.println();
        System.out.println(month+"/"+day+"/"+year);
        System.out.println(nameOfMonth+" "+day+","+year);
        System.out.println(day+" "+nameOfMonth+" "+year);
    }    
}
