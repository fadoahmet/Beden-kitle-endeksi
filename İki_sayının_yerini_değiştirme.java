import java.util.Scanner;

public class İki_sayının_yerini_değiştirme {

 public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Birinci sayi : ");
    int birinci_sayi = scanner.nextInt();

    System.out.print("Ikinci_sayi : ");
    int ikinci_sayi = scanner.nextInt();

    System.out.println("Degistirilmeden once...");

    System.out.println("Birinci sayi : " + birinci_sayi + " Ikinci sayi : " + ikinci_sayi);

    int gecici = birinci_sayi;
    birinci_sayi = ikinci_sayi;
    ikinci_sayi = gecici;

    System.out.println("Degistirildikten sonra...");

    System.out.println("Birinci sayi : " + birinci_sayi + " Ikinci sayi : " + ikinci_sayi);

 }
    
}
