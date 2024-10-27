public class Employee {
    private  String name;
    public double salary;
    private int workhours,hireyear;

    Employee(int workhours,int hireyear,double salary,String name){
        this.name=name;
        this.salary=salary;
        this.workhours=workhours;
        this.hireyear=hireyear;

    }
    public double tax()
    {
       if(this.salary>=1000){
           return salary*0.03;

       }
       return 0.0;
    }
    public double bonus()
    {
        int extrahours=this.workhours-40;
        if(extrahours>0){
            return 30*extrahours;
        }
        return 0.0;
    }
    public double increase()
    {
        int year=2020-this.hireyear;
        if(year<10){
            return salary*0.5;

        }else if( year>=10 && year<20){
            return salary*0.10;

        }else
            return salary*0.15;
    }

}

