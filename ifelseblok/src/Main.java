import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
     int input;
     input= scanner.nextInt();
     if(input<18)
         System.out.println("girdiğiniz sayı 18den küçüktür");
     else
         System.out.println("girdiğiniz sayı 18den büyüktür");
        }
    }