import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   Scanner scanner=new Scanner(System.in);

        System.out.println("arabanız kilometre başına kaç kuruş yakar?");
        double kurus=scanner.nextDouble();
        System.out.println("arabanızla kaç kilometre yol aldınız");
        double yol=scanner.nextDouble();
        System.out.println("toplam ücret"+(kurus*yol));
        }
    }
