import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz:");
        int kilo=scanner.nextInt();
        System.out.println("lütfen boyunuzu giriniz:");
        double boy=scanner.nextDouble();
        double bki= kilo/(boy*boy);
        System.out.println("beden kitle endeksiniz: "+ bki);

        }
    }
