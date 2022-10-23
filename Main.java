import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar,yeniTutar, kdvOrani1 = 0.18, kdvorani2 = 0.08;

        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Tutarını Giriniz : ");
        tutar = input.nextDouble();

        double kdvtutari = tutar < 1000 ? (tutar * kdvOrani1) : (tutar * kdvorani2);
        yeniTutar = tutar + kdvtutari;

        System.out.println("KDV tutarı = " + kdvtutari);
        System.out.println("KDV'li tutar = " + yeniTutar);





    }
}