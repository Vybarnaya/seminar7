package hw7;

public class DivideOperation implements OperationsCalculator{
    @Override
    public double doOperations(double num1, double num2) {
        if (num2==0){
            throw new RuntimeException("ДЕЛИТЬ НА НОЛЬ НЕЛЬЗЯ!");
        }
        else {
            return num1/num2;

        }
    }
}
