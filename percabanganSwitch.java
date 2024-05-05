import java.util.Scanner;

public class percabanganSwitch {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String operator;
        double angka1;
        double angka2;
        double hasil =0;

        System.out.println("Masukkan Operator Matematika ( + , - , / , * )");
        operator = scan.nextLine();
        System.out.println("Masukkan Angka Pertama : ");
        angka1 = scan.nextDouble();
        System.out.println("Masukkan Angka Kedua : ");
        angka2 = scan.nextDouble();

        switch(operator){
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            default:
                System.out.println("Operator yang dimasukkan tidak valid!!!");
                break;
        }
        System.out.println("Hasil operasi (" + operator + ") adalah = " + hasil);
    }
}