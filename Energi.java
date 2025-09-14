
import java.util.Scanner;

public class Energi{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Nilai Massa :");
        Double m = in.nextDouble();
        System.out.println("Masukkan Nilai Grafitasi :");
        Double g = in.nextDouble();
        System.out.println("Masukkan Nilai Ketinggian :");
        Double h = in.nextDouble();
        System.out.println("Masukkan Nilai Kecepatan :");
        Double V = in.nextDouble();

        Double Ep = m*g*h;
        Double Ek = (m*V*V)/2;
        Double Em = Ep+Ek;

        System.out.printf("Hasil Energi Potensial = %.2f\n", Ep);
        System.out.printf("Hasil Energi Kinetik = %.2f\n" , Ek);
        System.out.printf("Hasil Energi Mekanik = %.2f\n" , Em);

        in.close();
    }
}