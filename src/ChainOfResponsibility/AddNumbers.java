package ChainOfResponsibility;

public class AddNumbers implements Chain{

    //first nextChainInCurrent is a property of AddNumbers
    private Chain nextChainInCurrent;

    //second change the current chain (chainCalc1) into the new chain (chainCalc2)
    @Override
    public void setNextChain(Chain nextChain) {
        nextChainInCurrent = nextChain;
    }

    //third if it is not add, let the next chain (which is the new chain in the second step)
    //the current is now the new chain, and we want that to handle de request.
    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "add"){
            System.out.println(request.getNumber1() + " + " + request.getNumber2() + " = " + (request.getNumber1() + request.getNumber2()));
        }else{
            nextChainInCurrent.calculate(request);
        }
    }
}
