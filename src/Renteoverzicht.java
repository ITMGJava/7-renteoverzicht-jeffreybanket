import java.util.Scanner;

public class Renteoverzicht {
    public static void main(String[] args) {


        //We gaan een rentepercentage berekenen aan de hand van je invoer

        //Houd rekening dat de rente percentage afhankelijk is van de invoer. Onderstaande formule word gehanteerd:
        // 100 t/m 299 euro -> 3% rente
        // 300 t/m 599 euro -> 2% rente
        // 600 t/m 999 euro -> 1% rente
        // 1000 & daarboven -> 0,5% rente

        // hier voer je de naam in voor een welkomstboodschap met de ingevoerde naam

        System.out.println("Welkom bij Banket bankieren, Hoe mag ik je noemen?");
        Scanner s = new Scanner(System.in);
        String naam = s.nextLine();
        System.out.println("Welkom, " + naam + "");
        System.out.println("Wij gaan voor u berekenen welke rente er word gehanteerd aan de hand van uw ingevoerde gegevens");
        System.out.println("Houd er rekening mee dat er verschillende rente percentages zijn, dit is volledig afhankelijk van hoeveel geld u wilt gaan sparen.");
        System.out.println("Tussen "+(100)+" & "+(299)+"hanteren wij "+(3)+" % rente");
        System.out.println("Tussen "+(300)+" & "+(599)+"hanteren wij "+(2)+" % rente");
        System.out.println("Bij "+(600)+" & "+(999)+"hanteren wij "+(1)+" % rente");
        System.out.println("Indien u wenst kunnen we de rente laten dalen maar dan moet u wel boven de "+(1000)+" storten want dan hanteren wij "+(0.5)+" % rente");
        //Hieronder vul je het bedrag in dat je graag wilt sparen
        System.out.println("Met welk bedrag mogen wij je rekening aanvullen");
        float startBedrag;
        startBedrag = s.nextFloat();
        System.out.println("Bedankt voor uw invoer");
        //Bij onderstaande vul je de aantal jaren in dat je het geld wilt vastleggen voor een rente berekening
        System.out.println("Vul nu de gewenste tijdsperiode in getallen bijv "+5+" jaar");
        //int jaren = s.nextInt();
        float jaren;
        jaren = s.nextFloat();
        System.out.println("Bedankt voor uw invoer");
        if (startBedrag < 100| startBedrag <299){

        }
        float rente = 0§    ;

        System.out.println("U heeft ingevuld "+startBedrag+" + " +jaren+ " met deze informatie is uw rente: "+rente+"");


    System.out.println("Als u " + startBedrag + " per jaar wilt sparen is uw rente na " + jaren++ + " jaar");

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