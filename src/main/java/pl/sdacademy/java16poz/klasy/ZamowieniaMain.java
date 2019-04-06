package pl.sdacademy.java16poz.klasy;

import pl.sdacademy.java16poz.obiekty.Zamowienie;

/**
 * ZamowieniaMain
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 30.03.2019 10:21
 **/
public class ZamowieniaMain {

    public static void main(String[] args) {

        Zamowienie zamowienie1 = new Zamowienie(1);
        // pobranie ceny zamowienia i wyswietlenie na konsoli
        float aktualnaKwotaDoZaplaty = zamowienie1.pobierzCena();
        System.out.println("Aktualny stan rachunku:"+aktualnaKwotaDoZaplaty);

        /**
         * Zadanie domowe
         * ----------------------------
         * dodaj metode dodajPozycje(float cena)
         * dodaj kilka pozycji do zamowienia i
         * na końcu pobierzCene()
         * i wyświetl mini rachunek
         */
        zamowienie1.dodajPozycje("Pomidor",1.99f);
        zamowienie1.dodajPozycje("Reklamówka", 0.98f);
        zamowienie1.dodajPozycje("Chleb", 3.97f);
        zamowienie1.dodajPozycje("Sałata", 1.96f);
        //zamowienie1.wypiszPozycje(); TODO 1 petli (for,while)

        /**
         * Zadanie domowe 1
         *
         * Wypisać na konsolę z użyciem pętli
         * ładnie - pretty print
         */

        // do poprawki cena zamówienia TODO 2
        /**
         * Zadanie domowe 2
         * w pętli sumować i przypisać sumę
         */

        float cenaZamowienia = zamowienie1.pobierzCena();
        // .2f - dwa miejsca po przecinku f-float
        System.out.printf("Cena zamowienia: %.2f zł",cenaZamowienia);


    }
}
