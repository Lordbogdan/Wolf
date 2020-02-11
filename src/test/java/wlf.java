import java.sql.PreparedStatement;
import java.util.Scanner;

public class wlf {
    static Scanner scanner = new Scanner (System.in);

    public static void main (String [] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc (num1,num2,operation);
        System.out.println ("result : " + result);
    }
    private static int getInt() { // убрать все статики кроме маина
        System.out.println ("insert the number :");
        int num;
        if (scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        else {
            System.out.println("error");
            scanner.next();
            num = getInt();
        }
return  num;
    }
    private static char getOperation() {
        System.out.println(" insert the operation : ");
        char operation;
        if (scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }
        else {
            System.out.println("error");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    private int calc(int num1, int num2, char operation) {
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println ("replay");
                result = calc(num1,num2,getOperation());
        }
return result;
    }
}
