import java.util.Arrays;

public class OhjelmoinninTyokalut {


    public static void pyorayta(int[] taulu) {
        int firstElement = taulu[0];
        for(int i=0;i<taulu.length-1;i++) {
            taulu[i] = taulu[i+1];
        }
        taulu[taulu.length-1] = firstElement;


    }


    public static void main(String[] args) {
        int[] taulu = {1, 2, 3, 4};
        pyorayta(taulu);
        System.out.println(Arrays.toString(taulu));
    }
}


