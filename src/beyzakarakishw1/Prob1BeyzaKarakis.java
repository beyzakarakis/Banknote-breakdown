/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beyzakarakishw1;

//Scanner objesi olusturulmasi icin java util altindaki Scanner sinifi import edilir.
import java.util.Scanner;

/**
 *
 * @author Beyza Karakis
 */
public class Prob1BeyzaKarakis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Belirli miktardaki parayi daha kucuk parasal birimlere donusturme.

        //Kullanicidan input almak icin Scanner objesi olusturuyorum.
        Scanner input = new Scanner(System.in);
        //Kullaniciya ne istedigimiz bilmesi icin mesaj birakiyorum.
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amountOfMoney = input.nextDouble();

        /* Bu para miktarinda kac tane hangi banknotdan oldugunu bulmak icin
         girilen para miktarini banknot degerine bolup bolumu kadar banknot oldugunu bulacagim 
        ve kalan parayi ise bir kucuk banknot degerine bolup islemime bu sekilde devam edecegim. */
 /*Kac tane olduklarini gormek icin integer sayiya ihtiyacim var. Bu yuzden integera boldugum sayilarda sadece double sayiyi integera cast edecegim.
         iki sayininda double oldugu durumlarda paranteze alip sonucun hepsini integera cast edecegim.*/
        int numberOf200banknote = (int) amountOfMoney / 200;
        double remainingMoney1 = amountOfMoney % 200;
        int numberOf100banknote = (int) remainingMoney1 / 100;
        double remainingMoney2 = remainingMoney1 % 100;
        int numberOf50banknote = (int) remainingMoney2 / 50;
        double remainingMoney3 = remainingMoney2 % 50;
        int numberOf20banknote = (int) remainingMoney3 / 20;
        double remainingMoney4 = remainingMoney3 % 20;
        int numberOf10banknote = (int) remainingMoney4 / 10;
        double remainingMoney5 = remainingMoney4 % 10;
        int numberOf5banknote = (int) remainingMoney5 / 5;
        double remainingMoney6 = remainingMoney5 % 5;
        int numberOf1lira = (int) remainingMoney6 / 1;
        double remainingMoney7 = remainingMoney6 % 1;
        int numberOf50krs = (int) (remainingMoney7 / 0.5);
        double remainingMoney8 = remainingMoney7 % 0.5;
        int numberOf25krs = (int) (remainingMoney8 / 0.25);
        double remainingMoney9 = remainingMoney8 % 0.25;
        int numberOf10krs = (int) (remainingMoney9 / 0.10);
        double remainingMoney10 = remainingMoney9 % 0.10;
        int numberOf5krs = (int) (remainingMoney10 / 0.05);
        double remainingMoney11 = remainingMoney10 % 0.05;
        int numberOf1krs = (int) (remainingMoney11 / 0.01);

        System.out.println("Your amount " + amountOfMoney + " consists of");
        System.out.println(numberOf200banknote + " 200 TLs");
        System.out.println(numberOf100banknote + " 100 TLs");
        System.out.println(numberOf50banknote + " 50 TLs");
        System.out.println(numberOf20banknote + " 20 TLs");
        System.out.println(numberOf10banknote + " 10 TLs");
        System.out.println(numberOf5banknote + " 5 TLs");
        System.out.println(numberOf1lira + " 1 TLs");
        System.out.println(numberOf50krs + " 50 Krs");
        System.out.println(numberOf25krs + " 25 Krs");
        System.out.println(numberOf10krs + " 10 Krs");
        System.out.println(numberOf5krs + " 5 Krs");
        System.out.println(numberOf1krs + " 1Krs");
    }

}
