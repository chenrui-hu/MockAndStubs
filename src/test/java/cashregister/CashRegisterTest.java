package cashregister;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class CashRegisterTest {

    @Test
    public void shouldPrintNullPurchase(){

        PrinterMockup pm = new PrinterMockup();
        CashRegister cashRegister = new CashRegister(pm);

        cashRegister.process(null);

        assertEquals(false, pm.getPtintState());

    }

    @Test
    public void shouldPrintPurchase(){
        PrinterMockup pm = new PrinterMockup();
        CashRegister cashRegister = new CashRegister(pm);


        String print_string = "print this";

        Item item = new Item("cake", 10.0);
        Item[] items = {item};
        MockPurchase pc = new MockPurchase(items);

        cashRegister.process(pc);

        assertEquals(true, pm.getPtintState());
        assertEquals(print_string, pc.asString());

    }

}
