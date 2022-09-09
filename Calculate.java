public class Calculate{
    static double sum(String number1, String number2){
        return Double.parseDouble(number1) + Double.parseDouble(number2);
    }
	 
    static double rest(String number1, String number2){
        return Double.parseDouble(number1) - Double.parseDouble(number2);
    }
    static double multiply(String number1, String number2){
        return Double.parseDouble(number1) * Double.parseDouble(number2);
    }
    static double division(String number1, String number2){
        return Double.parseDouble(number1) / Double.parseDouble(number2);
    }    

}