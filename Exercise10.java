import java.util.PriorityQueue;

public class Exercise10 {
    public static void main(String[] args) {
        int[] array1 = numberGame(new int[]{5,4,2,3});
        for(int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println(" ");
        int[] array2 = numberGame(new int[]{2,5});
        for(int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
    public static int[] numberGame(int[] nums) {
        int[] arr = new int[nums.length];
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i = 0; i < nums.length; i++) {
            minHeap.add(nums[i]);
        }    
        int index = 0;
        while(index < arr.length && !minHeap.isEmpty()) {
            int tmp = minHeap.peek();
            minHeap.remove();
            int tmp2 = minHeap.peek();
            minHeap.remove();
            arr[index] = tmp2;
            index++;
            arr[index] = tmp;
            index++;
        }
        return arr;
}
}
