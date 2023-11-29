package hw7;

public class Main {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorController controller = new CalculatorController(model, view);

        String operation = view.enterOperation();
        int num1 = view.enterOperand();
        int num2 = view.enterOperand();

        controller.doOperations(operation, num1, num2);
    }
}


