import java.util.Scanner;

public class Beden_kitle_endeksi {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen kilonuzu giriniz:");
        int kilo = scanner.nextInt();

        System.out.print("Lutfen boyunuzu giriniz:(For example:1,72)");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);

        System.out.println("Beden kitle Indeksiniz:" + bki);
        
        if (bki < 18.5) {

            System.out.println("Zayif");
        }
        else if (bki >= 18.5 && bki <25 ) {

            System.out.println("Normal");   
        }
        else if (bki >= 25 && bki < 30) {

            System.out.println("Fazla kilolu");
        }
        else {
            System.out.println("Obez");
        }
    }
}
