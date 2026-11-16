import java.util.Scanner;

public class Tugas108 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int jumlah = input.nextInt();
        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlah;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println("\nHASIL PENGELOLAAN NILAI");
        System.out.println("Rata-rata nilai : " + rataRata);
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah  : " + terendah);

        System.out.println("\nDAFTAR NILAI MAHASISWA");
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Mahasiswa ke-" + (i + 1));
            System.out.print(" : " + nilai[i]);
            if (nilai[i] >= 70) {
                System.out.println(" (LULUS)");
            } else {
                System.out.println(" (TIDAK LULUS)");
            }
        }
        input.close();
    }
}