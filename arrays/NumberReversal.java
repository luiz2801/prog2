package arrays;

import java.util.Scanner;

public class NumberReversal {

    public static void reverseNumber(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite um número (inteiro): ");
            int inputNumber = scanner.nextInt();
            
            String numberString = Integer.toString(inputNumber);
            StringBuilder reversedNumber = new StringBuilder();

            for (int i = numberString.length() - 1; i >= 0; i--) {
                reversedNumber.append(numberString.charAt(i));
            }

            System.out.println("Inversão: " + reversedNumber.toString());
        }
    }

    public static void main(String[] args) {
        reverseNumber(); 
       }
}
