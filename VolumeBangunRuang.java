import java.util.Scanner;

public class VolumeBangunRuang{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        do{
                System.out.println("Kalkulator\n");
                System.out.println("1.Volume Balok\n");
                System.out.println("2.Volume Bola\n");
                System.out.println("3.Hitung Umur\n");
                
                System.out.println("Pilih menu: ");
                number = input.nextInt();
                        //String menu="";
            if (number == 1){
                System.out.print("=====Volume Balok=====\n");
                
                System.out.println("Panjang balok:");
                int panjang = input.nextInt();

                System.out.println("lebar balok:"); 
                int lebar = input.nextInt();

                System.out.println("tinggi balok:");    
                int tinggi = input.nextInt();

                int hasil = panjang * lebar * tinggi;

                System.out.println("Volume balok tersebut adalah " + hasil + " cm^3 \n\n");

            }
            else if (number == 2){
                System.out.print("=====Volume Bola=====\n");

                System.out.print("Phi( 3.14 || 22/7):");
                float Phi = input.nextFloat();

                System.out.print("Jari-jari: ");
                float Jari = input.nextFloat();

                float Total = 4 * Phi * Jari * Jari * Jari;
                float TotalAkhir = Total / 3;
                //Jari^3
                System.out.println("Phi = " + Phi);
                System.out.println("Jari-jari = " + Jari);
                System.out.println("Volume bola adalah = " + TotalAkhir + "\n\n");
            }
            else if (number == 3){
                System.out.print("=====Hitung Umur=====\n");

                System.out.print("Masukkan tahun lahir : ");
                int thn_lahir = input.nextInt();

                System.out.print("Masukkan tahun saat ini : ");
                int thn_skrg = input.nextInt();

                int umur = thn_skrg - thn_lahir;
                System.out.print("Umur kamu saat ini adalah : " + umur   + "\n\n");
            }
        }
        while (number < 4);
         input.close();
     }
}