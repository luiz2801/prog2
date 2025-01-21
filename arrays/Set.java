package arrays;

public class Set {

    public static boolean findRepeated(int[] vector, int n) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static int[] vectorize(int[] v1) {
        int[] aux = new int[v1.length]; 
        int count = 0; 

        for (int i = 0; i < v1.length; i++) {
            if (!findRepeated(aux, v1[i])) { 
                aux[count] = v1[i]; 
                count++; 
                       }
        }

        int[] v3 = new int[count];
        for (int i = 0; i < count; i++) {
            v3[i] = aux[i];
        }
        return v3;
    }

    public static int[] FinalVector(int[] v1, int[] v2) {
        int[] v3 = new int[v1.length + v2.length];
        int index = 0;

        for (int i = 0; i < v1.length; i++) {
            v3[index++] = v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            v3[index++] = v2[i];
        }

        return v3;
    }

    public static void main(String[] args) {
        int[] va = {1, 2, 3, 4}; // Vetor 1
        int[] vb = {4, 5, 6, 7}; // Vetor 2

        int[] vc = FinalVector(va, vb);

        int[] vd = vectorize(vc);

        for (int i = 0; i < vd.length; i++) {
            System.out.println(vd[i]);
        }
    }
}
