package ba.unsa.etf.rpr;

import java.util.Scanner;
public class Main
{
    public static void main( String[] args )
    {

            System.out.println("Unesite prvi broj: ");
            Scanner unos = new Scanner(System.in);
            int broj = unos.nextInt();
            System.out.println(broj);
            System.out.println("Unesite drugi broj: ");
            broj= unos.nextInt();
            System.out.println(broj);

    }
}
