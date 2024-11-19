import java.util.Scanner;
public class konversiNilai {
    public static void main(String[] args) {
        int nilai;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan Nilai: ");

        nilai = inputan.nextInt();

        if (nilai >= 85 ){
            System.out.println("A");
        } else if (nilai >= 75 && nilai < 85 ) {
            System.out.println("B");
        } else if (nilai >= 65 && nilai < 75){
            System.out.println("C");
        } else if (nilai >= 55){
            System.out.println("D");
        }else {
            System.out.println("E");
        }
    }
}
