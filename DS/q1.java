import java.util.Scanner;

class stack{
    int A[];
    int ctr;
    int n;

    public stack(int n) {
        ctr=0;
        this.n = n;
        A=new int[n];

    }

    void push(int number){
        if(ctr<n)
            A[++ctr]=number;

    }
    int pop(){
        if(ctr!=0)
            return A[ctr--];
        return 0;
    }
    void peek(){
        if(ctr==0){
            System.out.println("null");

        }
        else
            System.out.println(A[ctr]);
    }
    void empty(){
        if (ctr==0)
            System.out.println("true");
        else
            System.out.println("false");
    }
    void print_stack(){
        String result="[";
        if(0<ctr){
           for(int i=1;i<ctr;i++){
              result+=A[i];
              result+=", ";
           }
           result+=A[ctr]+"]";
            System.out.println(result);
        }else
            System.out.println("[]");
    }
}
class queue{
    int A[];
    int f,r;
    int n;
    int size;

    public queue(int n) {
        A=new int[n];
        this.n = n;
        f=0;
        r=-1;
        size=0;
    }

    void add(int number){
        if(r<n)

            r=(r+1)%n;
            A[r]=number;
            size++;
    }


    void remove() {
        if(!empty()) {
            f = (f + 1) % n;
            size--;
        }
    }

     int size() {
         return size;
    }
    boolean empty(){
        return (size()==0);
    }

    void peek() {
        if(empty())
            System.out.println("null");
        else
            System.out.println(A[f]);
    }

    void print_queue() {
        String result="[";
        if(empty())
            System.out.println("[]");
        else{
            for(int i=f;i<r;i++){
                result+=A[i];
                result+=", ";
            }
            result+=A[r]+"]";
            System.out.println(result);
        }
    }
}
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack stck = new stack(10000);
        queue qu = new queue(10000);
        while(true){
            String str=sc.nextLine();
            String[] arr=str.trim().split("\\s+");
            if(arr[0].equals("stack")){
                if(arr[1].equals("push"))
                    stck.push(Integer.parseInt(arr[2]));
                if(arr[1].equals("pop"))
                    stck.pop();
                if(arr[1].equals("peek"))
                    stck.peek();
                if(arr[1].equals("empty"))
                        stck.empty();

                }
                else if(arr[0].equals("queue")){
                    if(arr[1].equals("add"))
                        qu.add(Integer.parseInt(arr[2]));
                    if(arr[1].equals("remove"))
                        qu.remove();
                    if(arr[1].equals("peek"))
                        qu.peek();
                    if(arr[1].equals("size"))
                        System.out.println(qu.size());
                }
                else if(arr[0].equals("break"))
                    break;
            }
        stck.print_stack();
        qu.print_queue();
        }
}


