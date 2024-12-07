import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        try{
            String result = calc(input);
            System.out.println("Ответ: " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static String calc(String input) throws Exception{
        String[] words = input.split(" ");
        if (words.length != 3)
            throw new Exception("Неверный формат ввода");
        int firstNum, secondNum;
        try {
            firstNum = Integer.parseInt(words[0]);
            secondNum = Integer.parseInt(words[2]);
        }
        catch (NumberFormatException e) {
            throw new Exception("Неверный формат чисел");
        }

        if(firstNum < 1 || firstNum > 10 || secondNum < 1 || secondNum > 10)
            throw new Exception("Числа должны быть от 1 до 10 включительно");

        String operator = words[1];
        int result = 0;

        switch (operator) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;

            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
            default:
                throw new Exception("Символ указан неверно");
        }

        return Integer.toString(result);
    }
}