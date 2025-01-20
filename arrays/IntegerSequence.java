package arrays;


public class IntegerSequence {
    
    public static float calculateProduct(int... numbers) {
        float product = 1;
        for (int i = 0; i < numbers.length; i++) {
            product *= numbers[i];
        }
        return product;
    }    
}
