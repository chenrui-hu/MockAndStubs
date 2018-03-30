package cashregister;

class CashRegister {
    Printer printer;

    public CashRegister(Printer printer) {
        this.printer = printer;
    }

    public void process(Purchase purchase) {

        if (purchase!=null){
            printer.print(purchase.asString());
        }

    }


}
