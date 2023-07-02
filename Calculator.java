package calculator;

public final class Calculator {


    public static void main(String[] args) {
        // Assemble all the pieces of the MVC
        new CalculatorController(new CalculatorModel(), new CalculatorView());
    }
}