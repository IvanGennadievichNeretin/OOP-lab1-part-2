import java.io.PrintStream;

/**
 * Программа "Палиндром" принимает на вход строковые значения через пробел и проверяет каждое из них -
 * является ли оно палиндромом или нет.
 * @author Иван
 * @version 1.0
 * @since 24.03.2020
 * **/

public class Palindrome {
    //входная точка программы
    public static void main(String[] args) {
        setConsoleEncoding("Cp866"); //устанавливаем кодировку консоли, чтобы выводить русские символы
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            if (isPalindrome(s)){
                System.out.println("Слово " + s + " является палиндромом.");
            }
            else {
                System.out.println("Слово " + s + " не является палиндромом.");
            }
        }
    }

    //метод принимает на вход строку и инвертирует ее
    public static String reverseString(String s){
        if (s == null) return "";
        String result = "";
        for (int i = s.length()-1; i >= 0; i--){
            result += s.charAt(i);
        }
        return result;
    }

    //метод проверяет, является ли строка палиндромом или нет
    public static boolean isPalindrome(String s){
        String reversedStr = reverseString(s);
        if (reversedStr.equals(s)){
            return true;
        }
        return false;
    }

    //установка кодировки Cp866 для консоли. Необходима компиляция с кодировкой UTF-8
    public static void setConsoleEncoding(String encoding){
        try{
            System.setOut(new PrintStream(System.out, true, encoding));
        }
        catch(java.io.UnsupportedEncodingException e){
            System.err.println("Unsupported encoding set for console: " + encoding);
        }
    }
}