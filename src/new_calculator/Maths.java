package new_calculator;

public class Maths {


    public String calcExpr (String[] args) {
        double firsNum, secNum;
        firsNum = verifyType(args[0]);
        secNum = verifyType(args[2]);
//        System.out.println(firsNum);
//        System.out.println(secNum);

        switch (args[1]) {
            case "+":
                return args[0] + " + " + args[2] + " = " + checkZeroAtTheEnd(firsNum + secNum);
            case "*":
                return args[0] + " * " + args[2] + " = " + checkZeroAtTheEnd(firsNum * secNum);
            case "/":
                return args[0] + " / " + args[2] + " = " + checkZeroAtTheEnd(firsNum / secNum);
            case "-":
                return args[0] + " - " + args[2] + " = " + checkZeroAtTheEnd(firsNum - secNum);
        }
        return "";
    }

    //Проверяет число в конце числа,если это точка то возвращает число без дробной части.
    private String checkZeroAtTheEnd (double num) {
        String strNum = Double.toString(num);
        if (strNum.matches("\\d+\\.0$")) {
            return strNum.substring(0, strNum.length()-2);
        } else {
            return strNum;
        }
    }



    private Double verifyType(String num) {
        double firstNum;

        if (num.matches(".*[fF]$")) {
            firstNum = Float.valueOf(num);
            return firstNum;

        } else if (num.matches(".*[lL]$")) {
            firstNum = Long.parseLong(num.substring(0,num.length() -1)); //Удаляем в конце lL
            return firstNum;
        } else {
            firstNum = Double.valueOf(num);
            return firstNum;
        }
    }

}
