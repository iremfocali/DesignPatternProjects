//İREM FOÇALI 18070006032

public class Test {
    public static void main(String[] args) {
        Waffle waffle1 = new WrapWaffle();
        waffle1 = new Chocolate(waffle1,"Milky"); //white, milky, dark, nutella and caramel
        waffle1 = new Fruits(waffle1,"Kiwi"); //strawberry, kiwi, pineapple and banana
        waffle1 = new Fruits(waffle1,"Banana");
        waffle1 = new Sauces(waffle1,"Caramel"); //chocolate, caramel and raspberry
        waffle1 = new Nuts(waffle1,"Almond"); //pistachio, almond, hazelnut and walnut
        System.out.print(waffle1.getDescription());
        System.out.println(" Total Price : " + waffle1.getPrice() + "$");

        Waffle waffle2 = new BelgianWaffle();
        waffle2 = new Chocolate(waffle2,"Dark");
        waffle2 = new Fruits(waffle2,"Strawberry");
        waffle2 = new Fruits(waffle2,"Pineapple");
        waffle2 = new Sauces(waffle2,"Raspberry");
        waffle2 = new Nuts(waffle2,"Hazelnut");
        System.out.print(waffle2.getDescription());
        System.out.println(" Total Price : " + waffle2.getPrice() + "$");

    }
}
