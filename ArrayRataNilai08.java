import java.util.Scanner;

public class ArrayRataNilai08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int jumlahLulus = 0;
        double rata2;
        String predikat;
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                jumlahLulus++;
            }
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
        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];

        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }

            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }
        System.out.println("Jumlah mahasiswa: " + jumlahMhs);
        System.out.println("Total nilai mahasiswa: " + total);
        System.out.println("Rata-rata nilai mahasiswa: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Predikat rata-rata: " + predikat);
        System.out.println("Jumlah mahasiswa yang lulus: " + jumlahLulus);

        input.close();
    }
}