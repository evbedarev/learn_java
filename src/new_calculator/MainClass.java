package new_calculator;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        CheckValue str = new CheckValue();
        Scanner in  = new Scanner(System.in);
        String[] answerFromCheck;
        for (; ;) {  //Бесконечный цикл
            String input = in.nextLine();
            if (!input.equals("")) {    //Проверяем пустая ли строка
                answerFromCheck = str.check(input);

                if (answerFromCheck[0].matches("Error.*")) {
                    System.out.println(answerFromCheck[0]);
                } else {
                    Maths cl = new Maths();
                    System.out.println(cl.calcExpr(answerFromCheck));
                }


            } else {
                break;
            }
        }
    }

}

