import java.util.Scanner;
public class Tugas208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar",
            "Kentang Goreng", "Teh Tarik", "Cappucino",
            "Chocolate Ice"
        };
        int[] harga = {
            15000, 13000, 10000, 12000, 8000, 18000, 20000
        };
        System.out.println("===== MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp" + harga[i]);
        }
        System.out.print("\nMasukkan nama menu yang ingin dicari: ");
        String cari = input.nextLine();
        int posisi = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                posisi = i;
                break;
            }
        }
        if (posisi != -1) {
            System.out.println("Menu ditemukan: " + menu[posisi]);
            System.out.println("Harga: Rp" + harga[posisi]);
        } else {
            System.out.println("Maaf, menu tidak tersedia.");
        }
        System.out.print("\nMasukkan jumlah item yang ingin dipesan: ");
        int jumlah = input.nextInt();
        input.nextLine();
        String[] pesanan = new String[jumlah];
        int[] hargaPesanan = new int[jumlah];
        int totalBiaya = 0;
        for (int i = 0; i < jumlah; i++) {
            boolean ditemukan = false;
            while (!ditemukan) {
                System.out.print("Masukkan nama menu pesanan ke-" + (i + 1) + ": ");
                String namaPesanan = input.nextLine();
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        pesanan[i] = menu[j];
                        hargaPesanan[i] = harga[j];
                        totalBiaya += harga[j];
                        ditemukan = true;
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia. Silakan masukkan menu yang benar.");
                }
            }
        }
        System.out.println("\n========== STRUK PEMESANAN ==========");
        System.out.printf("%-5s %-22s %s%n", "No", "Nama Menu", "Harga");
        System.out.println("-------------------------------------");
        for (int i = 0; i < pesanan.length; i++) {
            System.out.printf("%-5d %-22s Rp%,d%n",
                    (i + 1), pesanan[i], hargaPesanan[i]);
        }
        System.out.println("-------------------------------------");
        System.out.printf("Total biaya: Rp%,d%n", totalBiaya);
        System.out.println("=====================================");
        input.close();
    }
}
