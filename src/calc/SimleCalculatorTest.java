package calc;

public class SimleCalculatorTest {
    public static void main(String args[]){
        SimpleCalculator2 s = new SimpleCalculator2(5,6);
        testOper("5+6",10, s.plus());

        s = new SimpleCalculator2(2,11.3);
        testOper("2-11.3",-9.3, s.subst());

        s = new SimpleCalculator2(2,7);
        testOper("2*7",14, s.mult());

        s = new SimpleCalculator2(14,7);
        testOper("14/7",2, s.dev());
    }


//Метод который вызывает метод assertSomething класса Assert и обрабатывает исключение.
    private static void testOper(String message, double expect, double actual) {


        Assert asrt = new Assert();
        try {

            asrt.assertSomething(message, expect, actual);
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
