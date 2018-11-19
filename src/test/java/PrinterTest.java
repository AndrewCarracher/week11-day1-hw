import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
    public void before(){
        this.printer = new Printer(100, 50);
    }

    @Test
    public void print(){
        printer.print(10, 10);
        assertEquals(90, printer.getNumberOfSheets());
    }

    @Test
    public void refillPaper(){
        printer.refillPaper(100);
        assertEquals(200, printer.getNumberOfSheets());
    }

    @Test
    public void refillToner(){
        printer.refillToner(100);
        assertEquals(150, printer.getToner());
    }

}
