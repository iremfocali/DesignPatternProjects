//18070006032 İrem Foçalı
public class Main {
    public static void main(String[] args) {

        Celebrity c1 = new Celebrity("Karsu Dönmez");
        Celebrity c2 = new Celebrity("Aleyna Tilki");
        Celebrity c3 = new Celebrity("Hadise");
        Fans f1 = new Fans("Sermet",c1);
        Fans f4 = new Fans("Cemre",c1);
        Fans f2 = new Fans("Ayca",c2);
        Fans f3 = new Fans("Emre",c3);

        System.out.println();
        c1.setTweet("Hello everyone :) ");
        System.out.println();

        c2.setTweet("Good morning :) ");
        System.out.println();
        
        c3.setTweet("Wonderful day :) ");
        System.out.println();

        c1.removeObserver(f1);
        c2.removeObserver(f2);
        c3.removeObserver(f3);
        c1.removeObserver(f4);
    }
}
