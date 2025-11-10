import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner user = new Scanner(System.in);
        boolean lanjutkan = true;
        int pilih;
        while(lanjutkan){
            menu();
            System.out.println();
            do{
                System.out.println("Apakah Anda ingin mengulang?");
                System.out.println("1. Iyaaa aku mau hitung lagi");
                System.out.println("2. Tidak, aku mau keluar");
                System.out.print("Pilihan Anda: ");
                pilih = user.nextInt();
                switch(pilih){
                    case 1:
                        break;
                    case 2:
                        System.out.println("Terima kasih telah menggunakan program kami ^^");
                        lanjutkan = false;
                        break;
                    default:
                        System.out.println("Masukkan Angka Sesuai Pada Menu!!!!");
                        System.out.println();
                        break;
                }
            }while(pilih != 1 && pilih != 2);
            System.out.println();
        }
    }
    public static void menu(){
        Scanner in = new Scanner(System.in);
            System.out.println("== SISTEM PENGHITUNG LUAS BANGUN DATAR ==");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Luas Persegi Panjang");
            System.out.println("3. Luas Segitiga");
            System.out.println("4. Luas Lingkaran");
            System.out.print("Masukkan Pilihan Anda: ");
            int n = in.nextInt();

        switch(n){
            case 1:
                System.out.printf("%-30s: ", "Masukkan panjang sisi persegi");
                int s = in.nextInt();
                System.out.println("Luas Persegi Anda Adalah: " + luas(s));
                break;
            case 2:
                System.out.printf("%-32s: ", "Masukkan panjang persegi panjang");
                int p = in.nextInt();
                System.out.printf("%-32s: ", "Masukkan lebar persegi panjang");
                int l = in.nextInt();
                System.out.println("Luas Persegi Panjang Anda Adalah: " + luas(p, l));
                break;
            case 3:
                System.out.printf("%-30s: ", "Masukkan tinggi segitiga");
                float t = in.nextFloat();
                System.out.printf("%-30s: ", "Masukkan alas segitiga");
                float a = in.nextFloat();
                System.out.println("Luas Segitiga Anda Adalah: " + luas(a, t));
                break;
            case 4:
                System.out.printf("%-30s: ", "Masukkan jari-jari lingkaran");
                double r = in.nextDouble();
                System.out.println("Luas Lingkaran Anda Adalah: " + luas(r));
                break;
            default:
                System.out.println("Masukkan Angka Sesuai Pada Menu!!!!");
                System.out.println();
                menu();
                break;
        }
    }
    public static int luas(int sisi){
        int L = 0;
        L = sisi*sisi;
        return L;
    }
    public static int luas(int panjang, int lebar){
        int L = 0;
        L = panjang*lebar;
        return L;
    }
    public static float luas (float alas, float tinggi){
        float L = 0;
        L = (alas*tinggi)/2;
        return L;
    }
    public static double luas (double r){
        double L = 0;
        if(r % 7 == 0){
            L = (22*r*r)/7;
        }else{
            L = 3.14 * r * r;
        }
        return L;
    }
}