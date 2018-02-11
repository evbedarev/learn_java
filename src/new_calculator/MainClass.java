package new_calculator;
import javax.xml.stream.FactoryConfigurationError;
import java.util.Scanner;

public class MainClass {

//    public void firstUse(String[] answerFromCheck, String input) {
//
//    }

    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        String[] answerFromCheck;
        String result = "";
        CheckValue str = new CheckValue();
        boolean firstTime = true;


        for (; ;) {  //Бесконечный цикл

            String input = in.nextLine();
            if (!input.equals("")) {    //Проверяем пустая ли строка
                if (firstTime) {

                    answerFromCheck = str.check(input);

                    if (answerFromCheck[0].matches("Error.*")) {
                        System.out.println(answerFromCheck[0]);
                    } else {

                        Maths cl = new Maths();
                        result = cl.calcExpr(answerFromCheck);
                        System.out.println(result);
                    }

                    firstTime = false;
                } else {

                    if (input.matches(" *[*+\\-/] *(-?\\d+\\.?\\d*(?:[lLfF])?)$")) {
                        answerFromCheck = str.checkSecondValue(result+input);
                        Maths cl = new Maths();
                        result = cl.calcExpr(answerFromCheck);
                        System.out.println(result);
                    }

                }


            } else {
                break;
            }
        }
    }



}

