public class calculator {
    //create methods

    static double display;

    //add method
    public static double add(double input) {
        return display = display += input;
    }


/*  public static int name(int parameter){
        return display += parameter;
    }
 */
    public static double subtract(double input) {
        return display -= input;
    }
    public static double multiply(double input) {
        return display *= input;
    }
    public static double divide(double input) {
        return display /= input;
    }
    public static double square() {
        return display = Math.pow(display, 2);
    }
    public static double squareRoot(double input) {
        return display = Math.sqrt(input);
    }
    public static double exponent(double exponent){
        return display = Math.pow(display, exponent);
    }
    public static double current(){
        return display;
    }
    public static double inverse(){
        return display = 1 / display;
    }
    public static double changeSign(){
        return display *= -1;
    }
    public static double clear(){
        return display = 0;
    }



    public static void main(String[] args) {
        //invoke methods

        //add
        System.out.println("add = " + add(100));

        //subtract
        System.out.println("subtract = " + subtract(5));

        //multiply
        System.out.println("multiply = " + multiply(100));

        //divide
        System.out.println("divide = " + divide(100));

        //square
        System.out.println("square = " + square());

        //square root
        System.out.println("square root = " + squareRoot(100));

        //exponent
        System.out.println("exponent = " + exponent(3));

        //current
        System.out.println("current = " + current());

        //inverse
        System.out.println("inverse = " + inverse());

        //changeSign
        System.out.println("change sign = " + changeSign());

        System.out.println("change sign back = " + changeSign());

        //clear
        System.out.println("clear = " + clear());
    }//End of main - Do not write below this line
}
