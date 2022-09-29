import java.util.Scanner;



class OperatorSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Getting float input
        System.out.print("Operator: \n");
        System.out.print("1.(+)Pertambahan \n");
        System.out.print("2.(-)Pengurangan \n");
        System.out.print("3.(*)Perkalian\n");
        System.out.print("3.(/)Pembagian\n");

        System.out.print("Choose an operator: ");
        String operator = input.nextLine();
        String op;
        System.out.print("Masukkan Bilangan Pertama: ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua: ");
        int bil2 = input.nextInt();
        

        switch (operator) {
            case "+":
                op = "Pertambahan\n";
                System.out.print(op);
                int hasilpertambahan = bil1 + bil2;
                System.out.println("Hasil pertambahannya adalah " + hasilpertambahan);

                break;
            case "-":
                op = "Pengurangan\n";
                System.out.print(op);
                int hasilpengurangan = bil1 - bil2;
                System.out.println("Hasil pengurangannya adalah " + hasilpengurangan);

                break;
            case "*":
                op = "Perkalian\n";
                System.out.print(op);
                int hasilperkalian = bil1 * bil2;
                System.out.println("Hasil perkaliannya adalah " + hasilperkalian);

                break;        
            case "/":
                op = "Pembagian\n";
                System.out.print(op);
                int hasilpembagian = bil1 / bil2;
                System.out.println("Hasil pembagiannya adalah " + hasilpembagian);

                break;         
            default:
                System.out.println("Masukkan operator");

                break;
        };
        input.close();
        
    }

}