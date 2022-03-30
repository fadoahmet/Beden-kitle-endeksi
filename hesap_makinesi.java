import java.util.Scanner;

public class hesap_makinesi {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("********************************");
        String islemler ="1.Toplam Islemi\n"
                        +"2.Cikarma Islemi\n"
                        +"3.Carpma Islemi\n"
                        +"4.Bolme Islemi";
        System.out.println(islemler);        
        System.out.println("********************************");

        System.out.println("Islemi seciniz:");
        String islem = scanner.nextLine();

        int a;
        int b;

        switch (islem) {
               case "1":
                
                    System.out.print("Birinci sayi:");
                    a = scanner.nextInt();
                    System.out.print("Ikinci sayi:");
                    b = scanner.nextInt();
                    System.out.print("Toplam:" + (a + b));
                    break;

                case "2":

                    System.out.print("Birinci sayi:");
                    a = scanner.nextInt();
                    System.out.print("Ikinci sayi:");
                    b = scanner.nextInt();
                    System.out.print("Cıkan:" + (a - b));
                    break; 

                case "3":
                 
                   System.out.print("Birinci sayi:");
                   a = scanner.nextInt();
                   System.out.print("Ikinci sayi:");
                   b = scanner.nextInt();
                   System.out.print("Girilen sayilarin carpimi:" + (a * b));
                   break; 
                    
                case "4":
                  
                   System.out.print("Birinci sayi:");
                   a = scanner.nextInt();
                   System.out.print("Ikinci sayi:");
                   b = scanner.nextInt();
                   System.out.print("Girilen sayilarin carpimi:" + ((double) a / b));
                   break;

        }


    }
    
}
