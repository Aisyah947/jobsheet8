import java.util.Scanner;

public class Porseni2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Jumlah politeknik yang mendaftar
        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        
        // Jumlah atlet per cabor
        final int jumlahAtletPerCabor = 5;
        final int jumlahCabor = 4; // 4 cabor: Badminton, Tenis Meja, Basket, Bola Voli
        
        // Array untuk menyimpan nama politeknik dan nama atlet per cabor
        String[] namaPoliteknik = new String[jumlahPoliteknik];
        String[][][] atlet = new String[jumlahPoliteknik][jumlahCabor][jumlahAtletPerCabor];
        
        // Nama cabang olahraga
        String[] namaCabor = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        
        // Input nama politeknik
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.print("Masukkan nama politeknik " + (i + 1) + ": ");
            namaPoliteknik[i] = scanner.nextLine();
        }
        
        // Input nama atlet
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("Politeknik " + namaPoliteknik[i] + ":");
            for (int j = 0; j < jumlahCabor; j++) {
                System.out.println("Masukkan nama " + jumlahAtletPerCabor + " atlet untuk " + namaCabor[j] + ":");
                for (int k = 0; k < jumlahAtletPerCabor; k++) {
                    System.out.print("Atlet " + (k + 1) + ": ");
                    atlet[i][j][k] = scanner.nextLine();
                }
            }
        }
        
        // Menampilkan informasi nama atlet
        System.out.println("\nDaftar Atlet per Politeknik:");
        for (int i = 0; i < jumlahPoliteknik; i++) {
            System.out.println("Politeknik " + namaPoliteknik[i] + ":");
            for (int j = 0; j < jumlahCabor; j++) {
                System.out.print("Atlet " + namaCabor[j] + ": ");
                for (int k = 0; k < jumlahAtletPerCabor; k++) {
                    System.out.print(atlet[i][j][k]);
                    if (k < jumlahAtletPerCabor - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
