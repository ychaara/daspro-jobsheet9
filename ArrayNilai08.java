import java.util.Scanner;

class ArrayNilai08 {
    public static void main(String[] args) {
        int[] nilaiAkhir = new int[10];
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = input.nextInt();
        }

        for (int nilai : nilaiAkhir) {
            if (nilai >= 70) {
                System.out.println(nilai + " (LULUS)");
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("Jumlah Mahasiswa Lulus        : " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus  : " + jumlahTidakLulus);

        input.close();
    }
}