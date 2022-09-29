import java.util.Scanner;



class Zodiak {

    public static void main(String[] args) {

        

        Scanner input = new Scanner(System.in);

        // Getting float input
       
        String errorinfo = "";
        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("Tanggal Lahir: ");
        int tgl_lahir = input.nextInt();

        System.out.print("Bulan Lahir: ");
        int bln_lahir = input.nextInt();
 
        String zodiak1= "";
        if(tgl_lahir > 0 && tgl_lahir < 32){
            if(tgl_lahir >=21 && bln_lahir == 1 || tgl_lahir <=18 && bln_lahir == 2){
                zodiak1 = "Aquarius";

            }
            else if(tgl_lahir >=19 && tgl_lahir <= 28 && bln_lahir == 2 || tgl_lahir <=20 && bln_lahir == 3){
                zodiak1 = "Pisces";
                

            }
            else if(tgl_lahir >=21 && bln_lahir == 3 || tgl_lahir <=20 && bln_lahir == 4){
                zodiak1 = "Aries";
                

            }
            else if(tgl_lahir >=21 && bln_lahir == 4 || tgl_lahir <=21 && bln_lahir == 5){
                zodiak1 = "Taurus";
                

            }
            else if(tgl_lahir >=22 && bln_lahir == 5 || tgl_lahir <=21 && bln_lahir == 6){
                zodiak1 = "Gemini";
                

            }
            else if(tgl_lahir >=22 && bln_lahir == 6 || tgl_lahir <=23 && bln_lahir == 7){
                zodiak1 = "Cancer";
                

            }
            else if(tgl_lahir >=24 && bln_lahir == 7 || tgl_lahir <=23 && bln_lahir == 8){
                zodiak1 = "Leo";
                

            }
            else if(tgl_lahir >=24 && bln_lahir == 8 || tgl_lahir <=23 && bln_lahir == 9){
                zodiak1 = "Virgo";
                

            }
            else if(tgl_lahir >=24 && bln_lahir == 9 || tgl_lahir <=23 && bln_lahir == 10){
                zodiak1 = "Libra";
                

            }
            else if(tgl_lahir >=24 && bln_lahir == 10 || tgl_lahir <=22 && bln_lahir == 11){
                zodiak1 = "Scorpio";
                System.out.println("Nama saya " + nama + ", zodiak saya adalah " + zodiak1);

            }
            else if(tgl_lahir >=23 && bln_lahir == 11 || tgl_lahir <=22 && bln_lahir == 12){
                zodiak1 = "Sagittarius";
                

            }
            else if(tgl_lahir >=21 && bln_lahir == 12 || tgl_lahir <=20 && bln_lahir == 1){
                zodiak1 = "Capricorn";
                

            }
            System.out.println("Nama saya " + nama + ", zodiak saya adalah " + zodiak1);
        }
        else{
            errorinfo = "Bulan atau Tanggal tidak sesuai.";
            System.out.println(errorinfo);
        }
        
        
        input.close();
    };

}