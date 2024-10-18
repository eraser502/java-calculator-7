package calculator;

import calculator.controller.StringAddCalculatorController;
import calculator.service.StringAddCalculatorService;
import calculator.view.InputView;
import calculator.view.ConsoleInputView;
import calculator.view.OutputView;
import calculator.view.StandardOutputView;

public class Application {

    public static void main(String[] args) {
        InputView inputView = new ConsoleInputView();
        OutputView outputView = new StandardOutputView();

        StringAddCalculatorService stringAddCalculatorService = new StringAddCalculatorService();
        StringAddCalculatorController stringAddCalculatorController = new StringAddCalculatorController(stringAddCalculatorService);

        String output = stringAddCalculatorController.stringAdd(inputView.readLine());

        outputView.print(output);
    }
}
