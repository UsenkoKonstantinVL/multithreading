package Table;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by toshiba on 18.03.2017.
 */
public class TableTest {

    Table table;

    @Before
    public void init(){
        table = new Table();
        table.put("four", 4);
        table.put("five hundred one", 501);
        table.put("one thousand three hundred five", 1305);
        table.put("one", 1);
    }

    @Test
    public void get() throws Exception {
        assertTrue(table.get().equals("one"));
        assertTrue(table.get().equals("four"));
        assertTrue(table.get().equals("five hundred one"));
    }

}