
import java.util.Random;

public class FillArray {
    
    private int arr[];
    
    public FillArray(int size, int max) {
        this.arr = new int[size];
        for(int i = 0; i < size; i++) {
            this.arr[i] = new Random().nextInt(max + 1);
        }
    }

    public int[] getArray() {
        return this.arr;
    }


}