import java.util.Date;

public class Program {
    public static void main(String[] args) {

        int size = 10;
        int maxNumber = 99999;
        int[] arr = new int[size];
        Date timeStart, timeFinish = new Date();
        long workTime = 0;
        FillArray fa = new FillArray(size, maxNumber);
        arr = fa.getArray();
        PrintArray pa = new PrintArray();
        System.out.println("Initial array");
        pa.printArray(arr);

        // Пирамидальная сортировка (сортировка кучей)
        timeStart = new Date();
        new HeapSort().sort(arr);
        timeFinish = new Date();
        System.out.println("Sorted array");
        pa.printArray(arr);
        workTime = timeFinish.getTime() - timeStart.getTime();
        System.out.println("Ticks: " + workTime); // 150-160 ticks for 1.000.000 numbers
    }
}