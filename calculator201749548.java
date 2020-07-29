public class calculator201749548 {

    //Simple Calculator 
    public static void main(String[] args) {
        
        double num1 = 8.0; 
        double num2 = 4.0;
        
    //out of the integars insert into variables
    Addition(num1, num2);
    Substratcion(num1, num2);
    Multiplication(num1, num2);
    Division(num1, num2);

  }

    static double Addition( double num1, double num2) {
        System.out.println("Addition = " + (num1 + num2));
        
        return num1 + num2;
    }


    static double Substratcion( double num1, double num2 ) {
        System.out.println("Substratcion = " + (num1 - num2));
        
        return num1 - num2;
    }


    static double Multiplication( double num1, double num2 ) {
        System.out.println("Multiplication = " + (num1 * num2));
        
        return num1 * num2;
    }

   static double Division( double num1, double num2 ) {
        System.out.println("Divsion = " + (num1 / num2));
       
       return num1 / num2;
    }
                 
                 
}