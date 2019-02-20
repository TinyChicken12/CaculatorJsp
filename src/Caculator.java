public class Caculator {
     public static float caculate(float firstOperator, float secondOperator, char operator){
        switch(operator){
            case '+':
                return firstOperator + secondOperator;
            case '-':
                return firstOperator - secondOperator;
            case '*':
                return  firstOperator * secondOperator;
            case '/':
                if (secondOperator ==0){
                    throw new RuntimeException("Can not divide by zero");
                }
                else
                    return firstOperator / secondOperator;
                default:
                    throw new RuntimeException("Invalid Operator");
        }
    }
}
