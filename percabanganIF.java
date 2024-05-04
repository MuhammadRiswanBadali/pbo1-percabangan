import java.util.Scanner;

public class percabanganIF {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nilai;
        String nama;

        System.out.println("Masukkan Nama : ");
        nama = scan.nextLine();
        System.out.println("Masukkan Nilai : ");
        nilai = scan.nextInt();

        if(nilai>=90 && nilai<=100){
            System.out.println("Selamat " + nama + ", anda mendapatkan predikat A");
        } else if(nilai >=80 && nilai<90){
            System.out.println("Selamat " + nama + ", anda mendapatkan predikat B");
        } else if(nilai>=70 && nilai<80){
            System.out.println("Selamat " + nama + ", anda mendapatkan predikat C");
        } else if(nilai>=60 && nilai <70){
            System.out.println("Selamat " + nama + ", anda mendapatkan predikat D");
        } else if(nilai>=0 && nilai<60){
            System.out.println("Selamat " + nama + ", anda mendapatkan predikat E");
        } else {
            System.out.println("Nilai tidak valid!!!");
        }
    }
}