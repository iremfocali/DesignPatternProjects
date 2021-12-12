import java.util.Scanner;

public class BufferPrinterImplementation implements AdapterPrint {
    private Printer bufferprinter;

    public BufferPrinterImplementation(Printer bufferprinter) {
        this.bufferprinter = bufferprinter;
    }

    @Override
    public void getString() {
        convertChar(bufferprinter.getString());
    }
    private void convertChar(String text){
        System.out.println("Enter your text : ");
        Scanner girdi = new Scanner(System.in);
        text = girdi.nextLine();

            for (int i = 0; i < text.length(); i=i+2) {
                System.out.print(text.substring(i,i+2));
                System.out.println();
            }
        }
    }
