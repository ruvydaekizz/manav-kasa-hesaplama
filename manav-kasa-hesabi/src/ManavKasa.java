import java.util.Scanner;

public class ManavKasa {

    public static void main(String[] args) {
        //  MANAV - KASA ÖRNEĞİ

        /*
        Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

        Meyveler ve KG Fiyatları

        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL


        Örnek Çıktı;

        Armut Kaç Kilo ? :0
        Elma Kaç Kilo ? :1
        Domates Kaç Kilo ? :1
        Muz Kaç Kilo ? :2
        Patlıcan Kaç Kilo ? :3
        Toplam Tutar : 21.68 TL
        */

        double armut, elma, domates, muz, patlican;
        double armutdeger, elmadeger, domatesdeger, muzdeger, patlicandeger, toplamtutar;

        Scanner scan = new Scanner(System.in);

        System.out.print("Armut kaç kilo istersiniz? : ");
        armut = scan.nextDouble();

        if (armut == 1) {
            System.out.println("1 kilo , 2.14 TL");
            armutdeger = 2.14;
        } else if (armut == 2) {
            System.out.println("2 kilo , 4.28 TL");
            armutdeger = 4.28;
        } else if (armut == 3) {
            System.out.println("3 kilo , 6.42 TL");
            armutdeger = 6.42;
        } else {
            System.out.println("0 kilo , 0 TL ");
            armutdeger = 0;
        }


        System.out.print("Elma kaç kilo istersiniz? : ");
        elma = scan.nextDouble();

        if (elma == 1) {
            System.out.println("1 kilo , 3.67 TL");
            elmadeger = 3.67;
        } else if (elma == 2) {
            System.out.println("2 kilo , 7.34 TL");
            elmadeger = 7.34;
        } else if (elma == 3) {
            System.out.println("3 kilo , 11.01 TL");
            elmadeger = 11.01;
        } else {
            System.out.println("0 kilo , 0 TL");
            elmadeger = 0;
        }


        System.out.print("Domates kaç kilo istersiniz? : ");
        domates = scan.nextDouble();

        if (domates == 1) {
            System.out.println("1 kilo , 1.11 TL");
            domatesdeger = 1.11;
        } else if (domates == 2) {
            System.out.println("2 kilo , 2.22 TL" );
            domatesdeger = 2.22;
        } else if (domates == 3) {
            System.out.println("3 kilo , 3.33 TL");
            domatesdeger = 3.33;
        } else {
            System.out.println("0 kilo , O TL");
            domatesdeger = 0;
        }



        System.out.print("Muz kaç kilo istersiniz? : ");
        muz = scan.nextDouble();

        if (muz == 1) {
            System.out.println("1 kilo , 0.95 TL");
            muzdeger = 0.95;
        } else if (muz == 2) {
            System.out.println("2 kilo , 1.90 TL");
            muzdeger = 1.90;
        } else if (muz == 3) {
            System.out.println("3 kilo , 2.85 TL");
            muzdeger = 2.85;
        } else {
            System.out.println("0 kilo , 0 TL");
            muzdeger = 0;
        }


        System.out.print("Patlıcan kaç kilo istersiniz? : ");
        patlican = scan.nextDouble();

        if (patlican == 1) {
            System.out.println("1 kilo , 5.00 TL");
            patlicandeger = 5.00;
        } else if (patlican == 2) {
            System.out.println("2 kilo , 10.00 TL");
            patlicandeger = 10.00;
        } else if (patlican == 3) {
            System.out.println("3 kilo , 15.00 TL");
            patlicandeger = 15.00;
        } else {
            System.out.println("0 kilo , 0 TL");
            patlicandeger = 0;
        }

        toplamtutar = armutdeger + elmadeger + domatesdeger + muzdeger + patlicandeger;
        System.out.println("Toplam Tutar: " + toplamtutar);


    }

}
