import java.util.Scanner;

public class Hipotenus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Birinci kenar : ");
        int a = scanner.nextInt();
        
        System.out.print("Ikinci kenar : ");
        int b = scanner.nextInt();

        double h = Math.sqrt(a * a + b *b);
        System.out.println("Hipotenus : " + h);
    }
}
