package Writer;

import Table.Table;

/**
 * Created by toshiba on 14.03.2017.
 */
public class Writer implements Runnable {

    Table table;

    public Writer(Table table){
        this.table = table;
    }

    @Override
    public void run() {
        while(true) {

            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {

            }

            String res = table.get();
            if(res == null || res.equals("")){
                System.out.println("Array is clear...");
            }
            else {

                System.out.println(res);
            }

        }

    }
}
