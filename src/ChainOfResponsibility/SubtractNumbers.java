package ChainOfResponsibility;

public class SubtractNumbers implements Chain{
    private Chain nextChainInCurrent;

    @Override
    public void setNextChain(Chain nextChain) {
        nextChainInCurrent = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "sub") {
            System.out.print(request.getNumber1() + " - " + request.getNumber2() + " = "+
            (request.getNumber1()-request.getNumber2()));
        }else{
            nextChainInCurrent.calculate(request);
        }
    }
}
