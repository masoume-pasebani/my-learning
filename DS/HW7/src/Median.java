import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class MedianFinder {
    static PriorityQueue<Integer> minHeap = null;
    static PriorityQueue<Integer> maxHeap = null;

    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public static void add(int num) {
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());

        if(minHeap.size()<maxHeap.size()){
            minHeap.offer(maxHeap.poll());
        }
    }

    public double find_median() {
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }else {
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }}
    public class Median {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number=sc.nextInt();
            MedianFinder m=new MedianFinder();
            for (int i = 0; i < number; i++) {
                m.add(sc.nextInt());
                System.out.println(m.find_median());
            }
        }
}
