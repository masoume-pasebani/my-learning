import java.util.Scanner;
import java.util.*;
public class hw6_q5 {

    public static int Preorder(int start, int end, int[] post_order, int index, Map<Integer, Integer> hashmap, Deque<Integer> s) {
        if (start > end) {
            return index;
        }

        int value = post_order[index--];
        int index1 = hashmap.get(value);
        index = Preorder(index1 + 1, end, post_order, index, hashmap, s);
        index = Preorder(start, index1 - 1, post_order, index, hashmap, s);
        s.push(value);

        return index;
    }

    public static void finding_Preorder(int[] in_order, int[] post_order) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i <in_order.length; i++) {
            hashMap.put(in_order[i], i);
        }

        int lastIndex =in_order.length - 1;
        Deque<Integer> s = new ArrayDeque<>();
        Preorder(0, lastIndex, post_order, lastIndex, hashMap, s);
        while (!s.isEmpty()) {
            System.out.print(s.poll() + " ");
        }
    }

    public static void main(String[] args) {

       Scanner scanner=new Scanner(System.in);
       String number_of_nodes=scanner.nextLine();
       String inorder_str =scanner.nextLine();
       String postorder_str = scanner.nextLine();

       int number_nodes=Integer.parseInt(number_of_nodes);

       int[] inorder=new int[number_nodes];
       String[] in=inorder_str.trim().split("\\s+");
       int[] postorder=new int[number_nodes];
       String[] post=postorder_str.trim().split("\\s+");

        for (int i = 0; i < number_nodes; i++) {
            inorder[i]= Integer.parseInt(in[i]);
            postorder[i]=Integer.parseInt(post[i]);
        }

        finding_Preorder(inorder,postorder);
    }
}