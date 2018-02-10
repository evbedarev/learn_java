package new_calculator;

public class MainClass {
    public static void main(String[] args) {
        CheckValue str = new CheckValue();
        for (String i:str.check("12f * 21.43l")) {
            System.out.println(i);
        }
    }
}

