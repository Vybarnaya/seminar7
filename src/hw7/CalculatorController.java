package hw7;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void doOperations(String operation, double num1, double num2) {
        switch (operation) {
            case "+":
                model.setOperationCalculator(new PlusOperation()); ;
                break;
            case "-":
                model.setOperationCalculator(new MinusOperation());
                break;
            case "*":
                model.setOperationCalculator(new MultiOperation());
                break;
            case "/":
                model.setOperationCalculator(new DivideOperation());
                break;
            default:
                System.out.println("Введена некорректная операция.");
        }
        model.doOperations(num1, num2);
        view.showResult(model.getResult());
    }
}

