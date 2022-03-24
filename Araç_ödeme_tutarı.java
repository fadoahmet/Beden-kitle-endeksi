import java.util.Scanner;

public class Araç_ödeme_tutarı {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Araciniz kilometrede kac kurus yakiyor? (For example:0.32)");
        double kurus = scanner.nextDouble();

        System.out.println("Araciniz ile kac kilometre gittiniz?");
        int km = scanner.nextInt();

        System.out.println("Toplam odemeniz gereken tutar:"+ kurus*km +"tl dir...");


    }
}
