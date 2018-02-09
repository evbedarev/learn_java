package MemoryJ;

public class mem {
    static class StringWrp {
        public StringWrp(String in) {
            this.in = in;
        }
        String in;
    }


    public static void main (String args[]) {
        StringWrp z = new StringWrp("a");
        StringWrp aa = z;
        StringWrp bb = new StringWrp("b");
        someMethod(aa, bb);
        System.out.println("z=" + z.in);

    }


    static void someMethod (StringWrp a, StringWrp b) {
        String c = a.in;
        a.in = b.in;
        b.in = c;
        System.out.println("a=" + a.in + ", b=" + b.in);
    }
}
