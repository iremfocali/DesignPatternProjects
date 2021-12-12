//18070006032-İrem Foçalı
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Printer printer = null;
        AdapterPrint adapterPrint = null;

        System.out.println("Please enter printer type : ");
        Scanner girdi = new Scanner(System.in);
        String type = girdi.next();
        if(type.equals("char")){
            printer = new CharPrinter();
            adapterPrint = new CharPrinterImplementation(printer);
        }else if(type.equals("buffer")){
            printer = new BufferPrinter();
            adapterPrint = new BufferPrinterImplementation(printer);
        }
        adapterPrint.getString();
    }

}
