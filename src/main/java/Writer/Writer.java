package Writer;

import Table.Table;

/**
 * Класс, задача которого выводить на консоль минимальное введенное число через каждые  5 секунд
 */
public class Writer implements Runnable {

    private Table table;

    public Writer(Table table){
        this.table = table;
    }

    /***
     * Функция, которая через каждые 5 секунд достаёт из table минимальное значение и выводит его на консоль в прописном виде
     */
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
