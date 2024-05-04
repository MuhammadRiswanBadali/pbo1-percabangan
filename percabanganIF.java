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

        
    }
}