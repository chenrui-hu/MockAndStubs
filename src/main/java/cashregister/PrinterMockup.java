package cashregister;

public class PrinterMockup extends Printer {


    private boolean printState = false;

    @Override
    public void print(String printThis){
        printState = true;
    }

    public boolean getPtintState(){
        return printState;
    }

}
