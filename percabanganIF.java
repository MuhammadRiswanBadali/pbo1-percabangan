import java.util.Scanner;

public class percabanganIF {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nilai;
        String nama;

        System.out.println("nama : ");
        nama = scan.nextLine();
        System.out.println("nilai : ");
        nilai = scan.nextInt();

        if(nilai>=80){
            System.out.println("selamat " + nama + ", anda lulus!!!");
        } else{
            System.out.println("sayang sekali " + nama + ", anda tidak lulus");
        }

        switch(nilai/10){
            case 9:
                System.out.println("selamat anda mendapatkan predikat A");
                break;
            case 8:
                System.out.println("selama anda mendapatkan predikat B");
                break;
            default:
                System.out.println("anda tidak lulus");
        }
    }
}