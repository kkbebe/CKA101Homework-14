package HW1;

public class HW106 {
    public static void main(String[] args) {
        System.out.println(5 + 5); 
        // integer 5 plus 5,the result is 10 in decimal.

        System.out.println(5 + '5'); 
        // '5' is a char, when a char does operations with numerical, 
        // it will be type promote into 53 in integer, due to ascii encoding,
        // 53 + 5 = 58 in decimal.

        System.out.println(5 + "5");
        // "5" is 5 in string, when a string does operations with numerical,
        // it will be connect as "string", 5 + "5" = "55" in string.

        System.out.println('5' + "5");
    }
}
