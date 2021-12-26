import java.util.*;

public class q5 {

    static int post_index;

    void Pre(int[] inorder, int[] postorder, int inorder_start, int inorder_end, Stack<Integer> stack)
    {
        if (inorder_start > inorder_end)
            return;

        int number = postorder[post_index];
        int index = search(inorder, number);
        post_index--;

        Pre(inorder, postorder, index + 1, inorder_end, stack);
        Pre(inorder, postorder, inorder_start, index - 1, stack);

        stack.push(number);
    }

    void find_preorder(int[] in, int[] post) {
        int len = in.length;
        post_index = len - 1;
        Stack<Integer> s = new Stack<Integer>();
        Pre(in, post, 0, len - 1, s);
        while (s.empty() == false)
            System.out.print(s.pop() + " ");
    }

    int search(int[] in, int data)
    {
        int i = 0;
        for (i = 0; i < in.length; i++)
            if (in[i] == data)
                return i;
        return i;
    }
    public static void main(String ars[]) {
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


        q5 tree = new q5();
        tree.find_preorder(inorder, postorder);
    }
}