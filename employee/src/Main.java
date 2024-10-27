public class Main {
     public static void main(String[] args){
         Employee emp1=new Employee(45,1985,2000.0,"kemal");
         System.out.println("tax:"+emp1.tax());
         System.out.println("bonus:"+emp1.bonus());
         System.out.println("increase:"+emp1.increase());
         double totalsalary=emp1.salary-emp1.tax()+emp1.bonus();
         System.out.println("total salary:"+totalsalary);
         System.out.println("total sa with the raise of salary:"+emp1.salary+emp1.increase());
     }

}