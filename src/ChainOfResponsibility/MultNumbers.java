package ChainOfResponsibility;

public class MultNumbers implements Chain{

    private Chain nextChainInCurrent;

    @Override
    public void setNextChain(Chain nextChain) {

        nextChainInCurrent = nextChain;
    }

    @Override
    public void calculate(Numbers request) {
        if(request.getCalculationWanted() == "mult"){
            System.out.println(request.getNumber1() + " * " + request.getNumber2() + " = " + (request.getNumber1() * request.getNumber2()));
        }else{
            nextChainInCurrent.calculate(request);
        }
    }
}
