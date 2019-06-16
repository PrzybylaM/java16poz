package pl.sdacademy.java16poz.testowanietdd.introduction;

/**
 * Cafe
 * obiekt posiada stan (określany przez zmienną isServe):
 * - zaserwowany
 * - nie zaserwowany
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 16.06.2019 11:14
 **/
public class Cafe {

    boolean isServe;

    /**
     * Konstruktor
     * Wartość początkowa isServe=false
     */
    public Cafe(){
        isServe = false;
    }

    public void serveCoffee() {
        isServe = true;
    }

    public boolean canServeCoffee() {
        return isServe;
    }
}
