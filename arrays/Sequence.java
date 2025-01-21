package arrays;


public class Sequence {
    
    public static double calculateProduct(double... numbers) {
        float product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }
        System.out.println(product);
        return product;
    }    



    public static void main(String[] args) {
        Sequence.calculateProduct(); 
    }
    
}


