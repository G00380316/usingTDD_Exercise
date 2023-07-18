package ie.atu;

public class Calculator {
    private int firstNumber,secondNumber,total;
        public Calculator(){firstNumber = 0; secondNumber = 0; total= 0;}

        public int add(int firstNumber, int secondNumber){
            total = firstNumber + secondNumber;
            System.out.println("The total is "+ total);

            return total;
        }
}
