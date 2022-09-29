import java.util.Scanner;

public class Menu{

     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("NASPAD BTPNS\n");
            System.out.println("1.Rendang Keju\n");
            System.out.println("2.Ayam Telor\n");
            System.out.println("3.Nasi Garam\n");
            System.out.println("Pilih menu:");
            number = input.nextInt();
            if (number == 1){
                System.out.println("Rendang Keju");
            }
            else if (number == 2){
                System.out.println("Ayam Telor");
            }
            else if (number == 3){
                System.out.println("Nasi Garam");
            }
            
        }
        while (number < 4);
        
         input.close();
     }
}