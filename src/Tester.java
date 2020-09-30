import java.util.Scanner;

public class Tester {

    private static int rente;

    public static void main(String[] args) {
        System.out.println("Welkom, Mijn naam is Siri, Hoe mag ik u noemen?");
        Scanner s = new Scanner(System.in);
        String naam = s.nextLine();
        System.out.println("Welkom, " + naam + "");

        System.out.println("Waarmee kan ik u vandaag mee van dienst zijn?");
//Scanner j = new Scanner(System.in);
        String antwoord = s.nextLine();

        System.out.println("Klopt dit?, " + antwoord + "?");
        String antwoord100 = s.nextLine();

        System.out.println("Met welk bedrag mogen wij je rentepercentage berekenen?");
        var antwoord2 = s.nextLine();

        System.out.println("En voor hoeveel jaar wilt u dit vastleggen?");
        var antwoord3 = s.nextLine();

        //hier zijn we geeindigd
        var x = antwoord2;

        var y = antwoord3;
        int k = rente;
        int rente = 1;

      System.out.println("Wij hanteren bij " + x + " een rente van"+rente+"");

        System.out.println("ik ga nu " + x + " voor u berekenen keer " + rente + " over een periode van " + y + "");
        System.out.println("Heeft u een moment geduld?");
        String antwoord4 = s.nextLine();


        System.out.println("Ik voer even de gegevens in in mijn computer en dan kom ik bij u terug.");
        System.out.println(""+ antwoord2 + " * " + rente + " +y+");

    }
}

