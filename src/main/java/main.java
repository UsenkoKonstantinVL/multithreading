import NumberTranslator.NumberTranslater;
import Table.Table;
import Writer.Writer;
import java.util.Scanner;

/**
 * Входной класс
 */
public class main {

    public static void main(String[] args)
    {
        NumberTranslater translator = new NumberTranslater();
        Scanner in = new Scanner(System.in);
        Table table = new Table();
        Writer writer = new Writer(table);
        Thread thread = new Thread(writer);
        thread.start();


        while(true){
            try{
                String line = in.nextLine();
                if(line.toLowerCase().equals("exit")){
                    printLine("Exit from program");
                    thread.stop();
                    return;
                }
                int x = translator.getNumber(line);
                table.put(line, x);
            }
            catch (Exception ex){
                printLine(ex.getMessage());
            }
        }
    }

    private static void printLine(String str){
        System.out.println(str);
    }
}
