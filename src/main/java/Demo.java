/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maha
 */
public class Demo {

    public static double division(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("You can't devide by zero");
        }
        return x / y;
    }

    public static int[] multiplesOf(int x) {
        int[] result = {x * 2, x * 3, x * 4, x * 5};
        return result;
    }

    public static boolean isEven(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }

    public static String getCourseName() {
        return "CPIT455";
    }

}
