
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class qu3 {

    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        ArrayList<Integer> output = new ArrayList<>();
        int maxSize = Integer.MIN_VALUE;
        for (ArrayList<Integer> list : input) {
            if (maxSize < list.size()) {
                maxSize = list.size();
            }
        }
        int i = 0, j = 0;
        while (i != maxSize) {
            j = 0;
            for (; j < input.size(); j++) {
                if (i >= input.get(j).size()) {
                    continue;
                } else {
                    pQueue.add(input.get(j).get(i));
                }
            }
            i++;
        }
        while (!pQueue.isEmpty()) {
            output.add(pQueue.remove());
        }
        return output;
    }

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter an integer k: ");
        int k = Integer.parseInt(scanner.nextLine());
        String  []arr=new String[k];
        for (int i = 0; i < k; i++) {
            arr[i] = String.valueOf(scanner.nextLine().trim().split("\\s+"));
            int size =Integer.parseInt(arr[0]);
            arr[0]="0";
            int[] arr2 = new int[size];
            for (int j = 0; j < size; j++) {
                if (Integer.parseInt(arr[i])!=0)
                    arr2[j]=Integer.parseInt(arr[j]);
            }
            ArrayList<Integer> tempList = new ArrayList<>();
            for (int j : arr2) {
                tempList.add(j);
            }
            list.add(tempList);
        }
        ArrayList<Integer> list2 = mergeKSortedArrays(list);
        for (Integer element : list2) {
            System.out.print(element + " ");
        }
    }
}