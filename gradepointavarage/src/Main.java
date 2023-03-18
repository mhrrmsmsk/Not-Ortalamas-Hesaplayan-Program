import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mat ,fizik,kimya,tarih,turkce,muzik;

        System.out.print("Matematik notunuz :");
        mat=scan.nextInt();
        System.out.print("Fizik notunuz :");
        fizik=scan.nextInt();
        System.out.print("Kimya notunuz :");
        kimya=scan.nextInt();
        System.out.print("Tarih notunuz :");
        tarih=scan.nextInt();
        System.out.print("Türkçe notunuz :");
        turkce=scan.nextInt();
        System.out.print("Müzik notunuz :");
        muzik=scan.nextInt();
       int  toplam=(mat+kimya+fizik+muzik+turkce+tarih);
     double ortalama= toplam/6;
        System.out.println("Ortalamanız:"+ortalama);
        boolean sonuc= (ortalama>60);

        String temp =(sonuc) ? "Geçtiniz":"Kaldınız";
        System.out.println(temp);






    }
}