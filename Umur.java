import java.util.Scanner;



class Umur {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting float input

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Tahun Awal: ");
        int thn_awal = input.nextInt();

        System.out.print("Tahun Akhir: ");
        int thn_akhir = input.nextInt();

        for(int i = thn_akhir  ; i > thn_awal ; i--) {
            int umur = i - thn_awal;
            System.out.println(nama + " umur " + umur + " pada tahun " + i + "\n");
        }

        input.close();
    };

}