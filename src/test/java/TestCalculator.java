import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class TestCalculator {

    @DataProvider(name = "sum")
    public Object[][] dataProviderSum() {
        return new Object[][]{
                {11.9999, 13.0501, 25.05},
                {-15, 10, -5},
                {-15, 0, -15}
        };
    }
    @DataProvider(name = "sub")
    public Object[][] dataProviderSub() {
        return new Object[][]{
                {11.6666, 3.0666, 8.6},
                {-15, 10, -25},
                {15, 0, 15}
        };
    }
    @DataProvider(name = "div")
    public Object[][] dataProviderDiv() {
        return new Object[][]{
                {7.75, 6.25, 1.24},
                {-15, 10, -1.50},
        };
    }
    @DataProvider(name = "mult")
    public Object[][] dataProviderMult() {
        return new Object[][]{
                {7.6, 6.9, 52.44},
                {-15, 10, -150},
                {15, 0, 0}
        };
    }
    @Test(dataProvider = "sum")
    public void sumTest(double first, double second, double expected) {
        double actual = Calculator.sum(first, second);
        assertEquals(actual, expected);
    }

    @Test(dataProvider = "sub")
    public void subTest(double first, double second, double expected) {
        double actual = Calculator.sub(first, second);
        assertEquals(actual, expected);
    }
    @Test(dataProvider = "mult")
    public void multTest(double first, double second, double expected) {
        double actual = Calculator.mult(first, second);
        assertEquals(actual, expected);
    }
    @Test(dataProvider = "div")
    public void divTest(double first, double second, double expected) {
        double actual = Calculator.div(first, second);
        assertEquals(actual, expected);
    }
    @Test
    public void divNegativeTest(){
        assertThrows(ArithmeticException.class, ()->{
            double div = Calculator.div(10, 0);});
    }

//    @Test
//    public void sumTest2() {
//        double actual = Calculator.sum(-1, -3);
//        assertEquals(actual, -4);
//    }
//
//    @Test
//    public void sumTest3() {
//        double actual = Calculator.sum(1, -3);
//        assertEquals(actual, -2);
//    }
//
//    @Test
//    public void subTest1() {
//        double actual = Calculator.sub(3, 1);
//        assertEquals(actual, 2);
//    }
//
//    @Test
//    public void subTest2() {
//        double actual = Calculator.sub(1, 3);
//        assertEquals(actual, -2);
//    }
//
//    @Test
//    public void subTest3() {
//        double actual = Calculator.sub(-3, -1);
//        assertEquals(actual, -2);
//    }
//
//    @Test
//    public void multTest1() {
//        double actual = Calculator.mult(2, 3);
//        assertEquals(actual, 6);
//    }
//
//    @Test
//    public void multTest2() {
//        double actual = Calculator.mult(2, -3);
//        assertEquals(actual, -6);
//    }
//
//    @Test
//    public void multTest3() {
//        double actual = Calculator.mult(-2, -6);
//        assertEquals(actual, 12);
//    }
//
//    @Test
//    public void divTest1() {
//        double actual = Calculator.div(4, 2);
//        assertEquals(actual, 2);
//    }
//
//    @Test
//    public void divTest2() {
//        double actual = Calculator.div(-4, 2);
//        assertEquals(actual, -2);
//    }
//
//    @Test
//    public void divTest3() {
//        double actual = Calculator.div(4, 0);
//        assertEquals(actual, Infinity);
//    }

//    @Test
//    public void sumWorstTest(){
//        double actual = Calculator.sum(a, 3);
//        assertEquals(actual, 4);
//    }
}
