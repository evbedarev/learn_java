package calc;

public class Assert {

    public void assertSomething(String message,double ...args) throws Exception {
        if (args[0] != args[1]) throw new Exception(" expected value is not match actual");
        System.out.println(message + " expected value is: " + args[0] + " actual value is: " + args[1]);

    }
}