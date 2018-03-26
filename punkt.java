public class punkt {
    //klasa z informacjami o pkt materialnym
    private double masa;
    private double r=0; //odleglosc od osi obrotu

    public void setMasa(double m){
        //akcesor z kontrola wartosci, masa nie moze byc ujemna
        if(m>=0)
        {
            masa=m;
        }
        else
        {
            masa=0;
        }
    }
    public double getMasa(){
        return masa;
    }
    public double moment_bezwladnosci(){
        double I=masa*r*r;
        return I;
    }

    public double tw_Steinera(double x){
        double I=masa*r*r+masa*x*x;
        return I;
    }

    public void opis_obiektu(){
        System.out.println("Punkt materialny");
    }
    public punkt(int m){
        masa=m;
        //konstruktor umozliwiajacy podanie masy
    }

    public punkt(){
        masa=1;
        //konstruktor domyslny, masa rowna 1
    }

    public static void main(String[] args){
    }
}