package cashregister;

public class MockPurchase extends Purchase {


    public MockPurchase(Item[] items) {
        super(items);
    }

    public String asString() {
        return "print this";
    }

}
