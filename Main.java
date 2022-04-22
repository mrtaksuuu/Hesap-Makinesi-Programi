import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       int n1, n2;
       String select;
       Scanner kb = new Scanner(System.in);

       System.out.print("İlk Sayıyı Giriniz : ");
       n1 = kb.nextInt();

       System.out.print("İkinci Sayıyı Giriniz : ");
       n2 = kb.nextInt();

       System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
       System.out.println("Seçiminiz :");
       select = kb.next();

       switch (select) {
           case "1":
               System.out.println("Toplam : " + (n1 + n2));
               break;
           case "2":
               System.out.println("Çıkarma :" + (n1 - n2));
               break;
           case "3":
               System.out.println("Çarpma : " + (n1 * n2) );
                break;
               case "4":
                   System.out.println("Bölme : " + (n1 / n2) );
                    break;
           default:
               System.out.println("Geçersi GİRİŞ!");
               break;

       }





    }
}
