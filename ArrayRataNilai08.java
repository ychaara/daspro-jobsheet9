import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        int[] nilaiMhs = new int[10];
        int total = 0;
        double rata2;
        String predikat;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
        }
        rata2 = (double) total / nilaiMhs.length;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 75) {
            predikat = "BAIK";
        } else if (rata2 >= 65) {
            predikat = "CUKUP";
        } else if (rata2 >= 50) {
            predikat = "KURANG";
        } else {
            predikat = "SANGAT KURANG";
        }
        System.out.println("Total nilai mahasiswa: " + total);
        System.out.println("Rata-rata nilai mahasiswa: " + rata2);

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi)
                tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah)
                terendah = nilaiMhs[i];
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat rata-rata: " + predikat);
    }
}