package calc;

public class SimpleCalculator2 {
    public double dblFistNum, dblSecNum;

//Конструктор если X и Y типа Int
    SimpleCalculator2(int firstNum, int secNum) {
        this.dblFistNum = firstNum;
        this.dblSecNum = secNum;
    }

    SimpleCalculator2(int firstNum, double dblSecNum) {
        this.dblFistNum = firstNum;
        this.dblSecNum = dblSecNum;
    }

    SimpleCalculator2(double dblFistNum, int secNum) {
        this.dblFistNum = secNum;
        this.dblFistNum = dblFistNum;
    }

    SimpleCalculator2(double dblFistNum, double dblSecNum) {
        this.dblSecNum = dblSecNum;
        this.dblFistNum = dblFistNum;
    }

//Методы +,-,/,*
    public double plus() {
        return dblFistNum + dblSecNum;
    }
    public double subst() {
        return dblFistNum - dblSecNum;
    }
    public double mult() {
        return dblFistNum*dblSecNum;
    }
    public double dev() {
        return dblFistNum/dblSecNum;
    }


}