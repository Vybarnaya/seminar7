package hw7;

public class CalculatorModel {
    private double result;
    private OperationsCalculator operationCalculator;

    public double getResult() {

        return result;
    }

    public void  setOperationCalculator(OperationsCalculator operationCalculator){
        this.operationCalculator= operationCalculator;
    }

    public void  doOperations(double num1, double num2){

        result = operationCalculator.doOperations(num1,num2);
    }
}
