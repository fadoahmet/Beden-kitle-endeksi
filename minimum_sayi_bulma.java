import java.util.Scanner;

public class minimum_sayi_bulma {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci sayi: ");
        int a = scanner.nextInt();
        System.out.print("Ikinci sayi: ");
        int b = scanner.nextInt();
        System.out.print("Ucuncu sayi: ");
        int c = scanner.nextInt();
             
        int min = 2;

        if (a <= b && a <= c) {

             min = a;
        }
        else if (b <= a && b <= c) {

            min = b;

        }

         else {

            min = c;
        }

        System.out.println("Minimmum sayi:" + min);

    }
    
}
