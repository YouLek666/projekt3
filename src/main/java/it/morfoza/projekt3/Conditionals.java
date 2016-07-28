package it.morfoza.projekt3;

/**
 * Created by widzew on 2016-07-28.
 */
public class Conditionals
{public static void main(String[] args) {


    int wiek = 16;
    boolean gimbaza = (wiek >= 13 && wiek <= 16);
    if(gimbaza) {
        System.out.println("Witaj gimbazo");
    }

    boolean brakgimbazy = (wiek < 13 || wiek > 16);
    if (brakgimbazy) {
        System.out.println("Cześć normalny");
    }


    if (wiek > 16 && wiek <= 20) {
            System.out.println("uczniu LO");
    }
    if (wiek <= 16 || wiek > 20) {
        System.out.println("NIE LO");
    }
}

}

