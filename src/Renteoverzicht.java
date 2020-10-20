import java.util.Scanner;

public class Renteoverzicht {
    public static void main(String[] args) {
//We gaan een rentepercentage berekenen aan de hand van je invoer
        System.out.println("Welkom, Hoe mag ik je noemen?");
        Scanner s = new Scanner(System.in);
        String naam = s.nextLine();
        System.out.println("Welkom, " + naam + "");
        System.out.println("Met welk bedrag mogen wij je rekening aanvullen");
        float startBedrag = s.nextFloat();
        System.out.print("Hoeveel jaren wilt u de rente vastleggen?");
        int jaren = s.nextInt();
        float rente;
        rente = s.nextFloat();
        System.out.println("Als u " + rente + " % per jaar wilt sparen is uw rente na " + jaren++ + " jaar");

        boolean Geldigheid = true;
        short invoer = 1|1000;
       int geldigheid = (100/5*20);

        if (invoer < 1 | invoer >= 1000){

        }
        else if (invoer <= jaren) {
            startBedrag = startBedrag * (1 + rente / 100);
            System.out.format("Jaar" + invoer + ": € " + "%.2f", startBedrag);
            System.out.println("Dit is uw rente voor zoveel jaar, doen?");
            String invoeren = s.nextLine();

        }
    }
        }