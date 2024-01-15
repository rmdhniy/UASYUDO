import java.util.ArrayList;
import java.util.Scanner;

public class UASYUDO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> floor1 = new ArrayList<>();
        ArrayList<String> floor2 = new ArrayList<>();
        ArrayList<String> floor3 = new ArrayList<>();

        int menuOption;

        while (true) {
            System.out.println("\n===== Aplikasi Manajemen Parkir =====");
            System.out.println("1. Masukkan Kendaraan");
            System.out.println("2. Keluar");
            System.out.print("Pilih menu (1/2): ");
            menuOption = scanner.nextInt();

            switch (menuOption) {
                case 1:
                    addVehicle(scanner, floor1, floor2, floor3);
                    break;
                case 2:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Menu tidak valid. Silakan pilih 1 atau 2.");
            }
        }
    }

    private static void addVehicle(Scanner scanner, ArrayList<String> floor1, ArrayList<String> floor2, ArrayList<String> floor3) {
        System.out.print("\nMasukkan kapasitas mesin kendaraan (CC): ");
        int engineCapacity = scanner.nextInt();

        String vehicleInfo = "Kendaraan (CC: " + engineCapacity + ")";

        if (engineCapacity >= 1000 && engineCapacity <= 1200) {
            floor3.add(vehicleInfo);
            System.out.println("Kendaraan berhasil ditambahkan di Lantai 3.");
        } else if (engineCapacity >= 1500 && engineCapacity <= 2000) {
            floor2.add(vehicleInfo);
            System.out.println("Kendaraan berhasil ditambahkan di Lantai 2.");
        } else if (engineCapacity >= 2500) {
            floor1.add(vehicleInfo);
            System.out.println("Kendaraan berhasil ditambahkan di Lantai 1.");
        } else {
            System.out.println("Kendaraan tidak memenuhi ketentuan. Silakan coba lagi.");
        }
    }
}
