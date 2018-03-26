import java.util.*;
public class program_testowy{
    public static void main(String[] args){
        //klasa - program testowy
        punkt pierwszy = new punkt(); //konstruktor domyslny
        punkt drugi = new punkt(5); //konstruktor z przypisaniem masy

        //wypisanie wlasciwosci obiektu nr 1
        pierwszy.opis_obiektu();
        System.out.println("Masa obiektu pierwszego: "+ pierwszy.getMasa());
        System.out.println("Gl. moment bezwladnosci: "+pierwszy.moment_bezwladnosci());
        System.out.println("Moment bezwladnosci wzgledem osi oddalonej o 5: "+pierwszy.tw_Steinera(5));

        //wypisanie wlasciwosci obiektu nr 2
        drugi.opis_obiektu();
        System.out.println("Masa obiektu pierwszego: "+ drugi.getMasa());
        System.out.println("Gl. moment bezwladnosci: "+drugi.moment_bezwladnosci());
        System.out.println("Moment bezwladnosci wzgledem osi oddalonej o 5: "+drugi.tw_Steinera(5));

        //zmiana masy obiektu nr 1 na 10
        pierwszy.setMasa(10);

        //wlasciwosci obiektu 1 po zmianie masy
        pierwszy.opis_obiektu();
        System.out.println("Masa obiektu pierwszego: "+ pierwszy.getMasa());
        System.out.println("Gl. moment bezwladnosci: "+pierwszy.moment_bezwladnosci());
        System.out.println("Moment bezwladnosci wzgledem osi oddalonej o 5: "+pierwszy.tw_Steinera(5));

        //tworzenie tablicy obiektow o roznych masach
        ArrayList<punkt> lista_punktow = new ArrayList<punkt>();
        for(int i=0;i<7;i++){
            lista_punktow.add(new punkt(2*i));
        }

        //wypisywanie informacji o obiektach z tablicy
        for(int j=0;j<lista_punktow.size();j++){
            System.out.println("Obiekt "+j+" to ");
            lista_punktow.get(j).opis_obiektu();
            System.out.println("Masa obiektu " +j+ " z petli wynosi: "+lista_punktow.get(j).getMasa());
            System.out.println("Gl. moment bezwladnosci obiektu " +j+": "+lista_punktow.get(j).moment_bezwladnosci());
            System.out.println("Moment bezwladnosci wzgledem osi oddalonej o 5 dla obiektu "+j+": "+lista_punktow.get(j).tw_Steinera(5));
            System.out.println();
        }
        }
    }
