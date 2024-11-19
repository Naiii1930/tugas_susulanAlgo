import java.util.Scanner;
public class menghitungNilai {
    public static void main(String[] args) {
      int nilai;

      Scanner inputan = new Scanner(System.in);
      System.out.print("Masukkan Nilai: ");
        
      nilai = inputan.nextInt();

      if (nilai >= 75) {
        System.out.println("Lulus");
      } else {
        System.out.println("Tidak Lulus");
      }
    }
}
