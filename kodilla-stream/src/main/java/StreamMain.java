import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 3, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 3, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 3, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 3, (a, b) -> a / b);


        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("tekst", (text) -> "ładny " + text);
        poemBeautifier.beautify("XYZ ", (text) -> text + "ABC");
        poemBeautifier.beautify("Inny tekst ", (text) -> text.toUpperCase());
        poemBeautifier.beautify("Tekst ", (text) -> text.replace("ks", "x"));
        poemBeautifier.beautify("ABC ", (text) -> text.substring(1));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
