import java.util.Scanner;
public class Kasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kg, armutKiloFiyati, elmaKiloFiyati, domatesKiloFiyati, muzKiloFiyati, patlicanKiloFiyati, toplamFiyat;
        double armutToplam, elmaToplam, domatesToplam, muzToplam, patlicanToplam;

        armutKiloFiyati = 2.14;
        elmaKiloFiyati = 3.67;
        domatesKiloFiyati = 1.11;
        muzKiloFiyati = 0.95;
        patlicanKiloFiyati = 5.00;

        System.out.print("Kaç kilo armut? ");
        kg = input.nextInt();
        armutToplam = kg * armutKiloFiyati;

        System.out.print("Kaç kilo elma? ");
        kg = input.nextInt();
        elmaToplam = kg * elmaKiloFiyati;

        System.out.print("Kaç kilo domates? ");
        kg = input.nextInt();
        domatesToplam = kg * domatesKiloFiyati;

        System.out.print("Kaç kilo muz? ");
        kg = input.nextInt();
        muzToplam = kg * muzKiloFiyati;

        System.out.print("Kaç kilo patlıcan? ");
        kg = input.nextInt();
        patlicanToplam = kg * patlicanKiloFiyati;

        toplamFiyat = armutToplam + elmaToplam + domatesToplam + muzToplam + patlicanToplam;
        System.out.println("₺ " + toplamFiyat + " borcunuz bulunmaktadır.");


    }
}
