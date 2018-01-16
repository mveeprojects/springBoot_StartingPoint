import examplePackage.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class ExampleTests {

    @Test
    public void additionTest(){
        int expected = 6;
        int actual = Calculator.addition(2, 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractionTest(){
        int expected = -2;
        int actual = Calculator.subtraction(2, 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationTest(){
        int expected = 8;
        int actual = Calculator.multiplication(2, 4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void divisionTest(){
        double expected = 0.5;
        double actual = Calculator.division(2, 4);
        Assert.assertEquals(expected, actual, 1);
    }
}