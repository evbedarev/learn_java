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
        CheckValue checkValue = new CheckValue();
        String result = "";
        boolean firstTime = true;


        for (; ;) {  //Бесконечный цикл

            String input = in.nextLine();
            if (!input.equals("")) {    //Проверяем пустая ли строка, если пустая то Выход.
                if (firstTime) {

                    result = makeResult(checkValue.check(input), result); //Вычисляем первое выражение вида а @ b
                    firstTime = false;

                } else {

                    if (input.matches(" *[*+\\-/] *(-?\\d+\\.?\\d*(?:[lLfF])?)$")) { // Если второе выражение типа @ b то
                        CheckSecondValue checkSecValue = new CheckSecondValue();
                        answerFromCheck = checkSecValue.check(result+input);

                            Maths cl = new Maths();
                            result = cl.calcExpr(answerFromCheck);
                            System.out.println(result);

                    } else { //Если второе выражение типа a @ B
                        result = makeResult(checkValue.check(input), result);
                    }

                }


            } else {
                break;
            }
        }
    }

    private static String makeResult(String[] answer, String result) {

        if (answer[0].matches("Error.*")) {
            System.out.println(answer[0]);
        } else {

            Maths cl = new Maths();
            result = cl.calcExpr(answer);
            System.out.println(result);
            return result;
        }
        return  result;
    }



}

