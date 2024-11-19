import java.util.Scanner;
public class pecahan {
    public static void main(String[] args) throws Exception {
        int jumlahUang;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan nominal uang pecahan: ");
        jumlahUang = inputan.nextInt();

        int jumlahPecahanRatusan = jumlahUang / 100000;  
        jumlahUang = jumlahUang % 100000;
        
        int jumlahPecahanLimapuluh = jumlahUang / 50000; 
        jumlahUang = jumlahUang % 50000;
        
        int jumlahPecahanDuapuluh = jumlahUang / 20000; 
        jumlahUang = jumlahUang % 20000;
        
        int jumlahPecahanSepuluh = jumlahUang / 10000; 
        jumlahUang = jumlahUang % 10000;

        int jumlahPecahanlimaribu = jumlahUang / 5000; 
        jumlahUang = jumlahUang % 5000;

        int jumlahPecahanDuaribu = jumlahUang / 2000; 
        jumlahUang = jumlahUang % 2000;

        int jumlahPecahanSeribu = jumlahUang / 1000; 
        jumlahUang = jumlahUang % 1000;

        int jumlahPecahanLimaratus = jumlahUang / 500; 
        jumlahUang = jumlahUang % 500;

        int jumlahPecahanSeratus = jumlahUang / 100; 
        jumlahUang = jumlahUang % 100;

        System.out.println("Jumlah Pecahan 100.000: " + jumlahPecahanRatusan);
        System.out.println("Jumlah Pecahan 50.000: " + jumlahPecahanLimapuluh);
        System.out.println("Jumlah Pecahan 20.000: " + jumlahPecahanDuapuluh);
        System.out.println("Jumlah Pecahan 10.000: " + jumlahPecahanSepuluh);
        System.out.println("Jumlah Pecahan 5.000: " + jumlahPecahanlimaribu);
        System.out.println("Jumlah Pecahan 2.000: " + jumlahPecahanDuaribu);
        System.out.println("Jumlah Pecahan 1.000: " + jumlahPecahanSeribu);
        System.out.println("Jumlah Pecahan 500: " + jumlahPecahanLimaratus);
        System.out.println("Jumlah Pecahan 100: " + jumlahPecahanSeratus);  
    }
}
