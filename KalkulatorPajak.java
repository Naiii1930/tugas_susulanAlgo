import java.util.Scanner;
public class KalkulatorPajak {
    public static void main(String[] args) throws Exception {
    
        double pkp, pph;

        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan penghasilan kena pajak :");
        pkp = inputan.nextInt();
        
        if (pkp < 50000000 ) {
            pph =  pkp * 5/100;
            pkp =  pph;
        }  else if (pkp >= 50000000 && pkp <= 250000000){
            pph = pkp * 15/100;
            pkp =  pph;
        } else if (pkp > 250000000 && pkp <= 500000000) {
            pph =  pkp * 25/100;
            pkp =  pph;
        } else {
            pph = pkp * 50/100;
            pkp =  pph;
        }
        System.out.println("Pajak yang harus dibayar pertahun :" + pkp + " Juta");
        }
    }
