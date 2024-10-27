import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int first;
    int second;
    int gecici;
        System.out.println("enter the number first");
        first= scan.nextInt();
        System.out.println("enter the number second");
        second= scan.nextInt();
        System.out.println("first number:"+ first +"second number:"+second);
        gecici=first;
        first=second;
        second=gecici;
        System.out.println("değişme sonrası");
        System.out.println("first number:"+ first+ "second number:"+second);
        }
    }
