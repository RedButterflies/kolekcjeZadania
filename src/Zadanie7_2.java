/*Napisz program pobierający od użytkownika liczby całkowite dopóki nie zostanie
wprowadzona liczba 0. Po zakończeniu pobierania podaj ile wprowadzono liczb, ich sumę,
oraz iloczyn (nie wliczaj 0).*/
import java.util.ArrayList;
import java.util.Scanner;

public class Zadanie7_2 {
    public static void main(String[] args) {
        Zadanie7_2.Pobieranie();
    }
    static ArrayList<Integer>Lista= new ArrayList<>();
    static int suma=0;
    static int iloczyn=1;
    public static void Pobieranie() {
        int i=0;
        while(true) {
            i++;
            System.out.println("Wprowadz "+i+"-ta liczbe calkowita: ");
            Scanner skaner = new Scanner(System.in);
            int liczba=skaner.nextInt();
            if(liczba==0)
            {
                break;
            }
            Lista.add(liczba);


        }
        for(int a: Lista)
        {
            suma+=a;
            iloczyn*=a;
        }
        System.out.println("Suma: "+suma);
        System.out.println("Iloczyn: "+iloczyn);
        System.out.println("Wprowadzono "+Lista.size()+ " liczb");



    }
}