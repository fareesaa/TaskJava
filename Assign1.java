import java.util.Scanner;

class Assign1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String nama = "Hary";
        System.out.print("Masukkan tanggal lahir");
        int tgl_lahir = input.nextInt();
        System.out.print("Masukkan bulan lahir");
        int bln_lahir = input.nextInt();
        System.out.print("Masukkan tahun lahir");
        int thn_lahir = input.nextInt();
        String bulan = "";
        int umur = 0;

        if(bln_lahir == 5){
            umur = 2022 - thn_lahir;
            bulan = " Mei ";  
            
        }
        else if(bln_lahir == 6){
            umur = 2022 - thn_lahir;
            bulan = "Juni";
            
        }  
        else if(bln_lahir == 7){
            umur = 2022 - thn_lahir;
            bulan = "Juli";
            
        }
        else if(bln_lahir == 8){
            umur = 2022 - thn_lahir;
            bulan = "Agustus";
            
        }
        else if(bln_lahir == 9){
            umur = 2022 - thn_lahir;
            bulan = "September";
            
        }
        else if(bln_lahir == 10){
            umur = 2022 - thn_lahir;
            bulan = "Oktober";
            
        }
        else if(bln_lahir == 11){
            umur = 2022 - thn_lahir;
            bulan = "November";
            
        }
        else if(bln_lahir == 12){
            umur = 2022 - thn_lahir;
            bulan = "Desember";
            
        }
        else if(bln_lahir == 1){
            umur = 2022 - thn_lahir;
            bulan = "Januari";
            
        }
        else if(bln_lahir == 2){
            umur = 2022 - thn_lahir;
            bulan = "Februari";
            
        }
        else if(bln_lahir == 3){
            umur = 2022 - thn_lahir;
            bulan = "Maret";
            
        }
        else if(bln_lahir == 4){
            umur = 2022 - thn_lahir;
            bulan = "April";
            
        }

        System.out.println("Nama saya " + nama + ", lahir pada " + tgl_lahir + " " + bulan + " " + thn_lahir + " berumur " + umur + " tahun." );
        in.close();
        
    }

}