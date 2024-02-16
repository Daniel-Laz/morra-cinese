import java.util.Scanner;

public class MorraCinese {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        boolean corretto1=false;
        boolean corretto2=false;
        String oggetto1=null;
        String oggetto2=null;
        System.out.println("inserisci il nome del primo giocatore");
        String giocatore1=in.nextLine();
        System.out.println("inserisci il nome del secondo giocatore");
        String giocatore2=in.nextLine();
        while (!corretto1){
            System.out.println(giocatore1+", scegli tra: sasso, carta e forbice");
            oggetto1=in.nextLine();
            if (oggetto1.equalsIgnoreCase("sasso") || oggetto1.equalsIgnoreCase("forbice") || oggetto1.equalsIgnoreCase("carta")){
                corretto1=true;
            }
            else
                System.out.println("non esiste questo oggetto nella morra cinese; inserisci un altro oggetto");
        }
        while (!corretto2){
            System.out.println(giocatore2+", scegli tra: sasso, carta e forbice");
            oggetto2=in.nextLine();
            if (oggetto2.equalsIgnoreCase("sasso") || oggetto2.equalsIgnoreCase("forbice") || oggetto2.equalsIgnoreCase("carta")){
                corretto2=true;
            }
            else
                System.out.println("non esiste questo oggetto nella morra cinese; inserisci un altro oggetto");
        }
        if (oggetto1.equalsIgnoreCase("sasso") && oggetto2.equalsIgnoreCase("sasso"))
            System.out.println("pareggio");
        if (oggetto1.equalsIgnoreCase("sasso") && oggetto2.equalsIgnoreCase("forbice"))
            System.out.println(giocatore1+" vince");
        if (oggetto1.equalsIgnoreCase("sasso") && oggetto2.equalsIgnoreCase("carta"))
            System.out.println(giocatore2+" vince");
        if (oggetto1.equalsIgnoreCase("forbice") && oggetto2.equalsIgnoreCase("forbice"))
            System.out.println("pareggio");
        if (oggetto1.equalsIgnoreCase("forbice") && oggetto2.equalsIgnoreCase("sasso"))
            System.out.println(giocatore2+" vince");
        if (oggetto1.equalsIgnoreCase("forbice") && oggetto2.equalsIgnoreCase("carta"))
            System.out.println(giocatore1+" vince");
        if (oggetto1.equalsIgnoreCase("carta") && oggetto2.equalsIgnoreCase("carta"))
            System.out.println("pareggio");
        if (oggetto1.equalsIgnoreCase("carta") && oggetto2.equalsIgnoreCase("sasso"))
            System.out.println(giocatore1+" vince");
        if (oggetto1.equalsIgnoreCase("carta") && oggetto2.equalsIgnoreCase("forbice"))
            System.out.println(giocatore2+" vince");

    }
}
