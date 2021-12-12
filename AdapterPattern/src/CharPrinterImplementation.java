import java.util.Scanner;

public class CharPrinterImplementation implements AdapterPrint {
    private Printer charprinter;

    public CharPrinterImplementation(Printer charprinter) {
        this.charprinter = charprinter;
    }
    @Override
    public void getString() {
        convertChar();
    }
    private void convertChar(){
        String text = null;
        System.out.println("Enter your text : ");
        Scanner girdi= new Scanner(System.in);
        text = girdi.nextLine();
        char[] dizi = text.toCharArray();
        for (int i = 0; i < dizi.length ; i++) {
            System.out.println(dizi[i]);
        }
    }
}
