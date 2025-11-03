import java.util.Scanner;

public class BiayaPengiriman {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        System.out.print("berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.println("jarak pengiriman (km): ");
        double jarak = input.nextDouble();

        System.out.println("panjang paket (cm): ");
        double panjang = input.nextDouble();

        System.out.println("lebar paket (cm): ");
        double lebar = input.nextDouble();

        System.out.println("tinggi paket (cm):");
        double tinggi = input.nextDouble();

        double volume = panjang*lebar*tinggi;

         double biayaPerKg;
        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double biayaPengiriman= berat*biayaPerKg;

          if (volume > 100) {
            biayaPengiriman += 50000;
        }
        
        System.out.println("berat paket: "+berat+" kg");
        System.out.println("Jarak yang ditempuh: "+jarak+" km");
        System.out.println("volume paket: "+volume+" cm^3");
        System.out.println("Biaya per kg: "+biayaPerKg+" kg");

          if (volume > 100) {
            System.out.println("Biaya tambahan volume: Rp 50.000");
        } else {
            System.out.println("Biaya tambahan volume: Rp 0");
        }

         System.out.println("Total biaya pengiriman: Rp " + biayaPengiriman);
        
    }
}