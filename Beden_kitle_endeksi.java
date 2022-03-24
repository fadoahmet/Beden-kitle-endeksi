import java.util.Scanner;

public class Beden_kitle_endeksi {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lutfen kilonuzu giriniz:");
        int kilo = scanner.nextInt();

        System.out.print("Lutfen boyunuzu giriniz:(For example:1,72)");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        
        System.out.println("Beden Kitle indeksiniz:" + bki);
        
    }
}
