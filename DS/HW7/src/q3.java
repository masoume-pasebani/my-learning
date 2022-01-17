import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class q3{

    class Node {
        int row, col;
        int val;
        public Node(int row, int col, int val) {
            this.row = row;
            this.col = col;
            this.val = val;
        }
    }

    public int[] mergeKSortedArrays(int[][] arrays) {
        if (arrays == null || arrays.length == 0) return null;
        int k = arrays.length;
        PriorityQueue<Node> minHeap = new PriorityQueue<>(k, new Comparator<Node>() {
            @Override
            public int compare(Node a, Node b) {
                return a.val - b.val;
            }
        });

        int size = 0;
        for (int i = 0; i < k; i++) {
            if (arrays[i] == null || arrays[i].length == 0) continue;
            minHeap.offer(new Node(i, 0, arrays[i][0]));
            size += arrays[i].length;
        }

        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            Node curr = minHeap.poll();
            res[i] = curr.val;
            if (curr.col != arrays[curr.row].length - 1) {
                minHeap.offer(new Node(curr.row, curr.col + 1, arrays[curr.row][curr.col + 1]));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        q3 result = new q3();
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int A[][]=new int[1000001][];
        for (int i = 0; i < k; i++) {
            int n= sc.nextInt();
            int B[]=new int[n];
            for (int j = 0; j < n; j++) {
                B[j]=sc.nextInt();
            }
            A[i]=B;

        }

        System.out.println(toString(result.mergeKSortedArrays(A)));
    }
    public static String toString(int arr[]) {
        return Arrays.stream(arr).mapToObj(s ->""+ s)
                .collect(Collectors.joining(" "));
    }

}