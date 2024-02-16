import java.util.Scanner;
import java.util.Random;

public class MorraCineseControComputer {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random generatore=new Random();
        boolean corretto=false;
        String oggetto1=null;
        String oggetto2=null;
        int oggetto=generatore.nextInt(3);
        if (oggetto==0)
            oggetto2="sasso";
        else if(oggetto==1)
            oggetto2="forbici";
        else if(oggetto==2)
            oggetto2="carta";

        while (!corretto){
            System.out.println("scegli tra sasso, carta e forbice");
            oggetto1=in.nextLine();
            if (oggetto1.equalsIgnoreCase("sasso") || oggetto1.equalsIgnoreCase("forbice") || oggetto1.equalsIgnoreCase("carta")){
                corretto=true;
            }
            else
                System.out.println("non esiste questo oggetto nella morra cinese; inserisci un altro oggetto");
        }
        if (oggetto1.equalsIgnoreCase("sasso") && oggetto2.equalsIgnoreCase("sasso"))
            System.out.println("il computer ha scelto "+oggetto2+", pareggio");
        if (oggetto1.equalsIgnoreCase("sasso") && oggetto2.equalsIgnoreCase("forbice"))
            System.out.println("il computer ha scelto "+oggetto2+", hai vinto");
        if (oggetto1.equalsIgnoreCase("sasso") && oggetto2.equalsIgnoreCase("carta"))
            System.out.println("il computer ha scelto "+oggetto2+", hai perso");
        if (oggetto1.equalsIgnoreCase("forbice") && oggetto2.equalsIgnoreCase("forbice"))
            System.out.println("il computer ha scelto "+oggetto2+", pareggio");
        if (oggetto1.equalsIgnoreCase("forbice") && oggetto2.equalsIgnoreCase("sasso"))
            System.out.println("il computer ha scelto "+oggetto2+", hai perso");
        if (oggetto1.equalsIgnoreCase("forbice") && oggetto2.equalsIgnoreCase("carta"))
            System.out.println("il computer ha scelto "+oggetto2+", hai vinto");
        if (oggetto1.equalsIgnoreCase("carta") && oggetto2.equalsIgnoreCase("carta"))
            System.out.println("il computer ha scelto "+oggetto2+", pareggio");
        if (oggetto1.equalsIgnoreCase("carta") && oggetto2.equalsIgnoreCase("sasso"))
            System.out.println("il computer ha scelto "+oggetto2+", hai vinto");
        if (oggetto1.equalsIgnoreCase("carta") && oggetto2.equalsIgnoreCase("forbice"))
            System.out.println("il computer ha scelto "+oggetto2+", hai perso");

    }
}