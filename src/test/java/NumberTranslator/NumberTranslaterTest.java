package NumberTranslator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by toshiba on 18.03.2017.
 */
public class NumberTranslaterTest {
    @Test
    public void getNumberTest1() throws Exception {
        NumberTranslater translator = new NumberTranslater();

        assertEquals(4, translator.getNumber("four"));
    }

    @Test
    public void getNumberTest2() throws Exception {
        NumberTranslater translator = new NumberTranslater();

        assertEquals(45, translator.getNumber("forty five"));
    }

    @Test
    public void getNumberTest3() throws Exception {
        NumberTranslater translator = new NumberTranslater();

        assertEquals(100, translator.getNumber("one hundred"));
    }

    @Test
    public void getNumberTest4() throws Exception {
        NumberTranslater translator = new NumberTranslater();

        assertEquals(5000, translator.getNumber("five thousand"));
    }
    @Test
    public void getNumberTestFail() throws Exception {
        NumberTranslater translator = new NumberTranslater();

        assertTrue(5540 !=
                translator.getNumber("five thousand five hundred four"));
    }



}