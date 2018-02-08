package calc;

public class SimpleCalculator2 {
    public double dblX, dblY;

    SimpleCalculator2(int intX, int intY) {
        this.dblX = intX;
        this.dblY = intY;
    }

    SimpleCalculator2(int intX, double dblY) {
        this.dblX = intX;
        this.dblY = dblY;
    }

    SimpleCalculator2(double dblX, int intY) {
        this.dblX = intY;
        this.dblX = dblX;
    }

    SimpleCalculator2(double dblX, double dblY) {
        this.dblY = dblY;
        this.dblX = dblX;
    }


    public double plus() {
        return dblX + dblY;
    }
    public double subst() {
        return dblX - dblY;
    }
    public double mult() {
        return dblX*dblY;
    }
    public double dev() {
        return dblX/dblY;
    }


}