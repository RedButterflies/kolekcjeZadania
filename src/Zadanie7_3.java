import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.StrictMath.abs;

public class Zadanie7_3 {
    public static void main(String[] args) {
        Zadanie7_3.Pobieranie();
    }
    public static ArrayList<Integer>Lista=new ArrayList<>();
    public static void Pobieranie()
    {
        int liczba;
        int suma=0;
        int iloczyn=1;
        while((abs(suma))<250 && abs(iloczyn)<3000000) {
            System.out.println("Wprowadz liczbe calkowita: ");
            Scanner sc = new Scanner(System.in);
            liczba=sc.nextInt();
            Lista.add(liczba);
            suma+=liczba;
            iloczyn*=liczba;
            System.out.println("Suma "+ suma);
            System.out.println("Iloczyn "+iloczyn);
        }
        Lista.sort(Collections.reverseOrder());
        System.out.println(Lista);

    }
}
