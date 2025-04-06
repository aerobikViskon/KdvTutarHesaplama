import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Tutar Giriniz : ");
        double tutar = sc.nextDouble();

        double kdvOrani = (tutar > 1000) ? 0.08 : 0.18;
        double kdvliFiyat = (tutar * kdvOrani) + tutar;
        System.out.println("KDV Tutarı: " + (tutar * kdvOrani));
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);
    }
}
