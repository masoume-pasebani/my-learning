import java.util.Scanner;

class stack2 {
    int A[];
    int ctr;
    int n;

    public stack2(int n) {
        ctr = 0;
        this.n = n;
        A = new int[n];

    }

    void push(int number) {
        if(ctr==n){
            int B[]=new int[2*n];
            for(int i=0;i<n;i++){
                B[i]=A[i];
            }
            int []temp=A;
            A=B;
        }
        if (ctr != n)
            A[++ctr] = number;

    }

    int pop() {
        if (ctr != 0)
            return A[ctr--];
        return 0;
    }

    int peek() {
        if (ctr != 0)
            return A[ctr];
        return 0;
    }

    boolean empty() {
        return ctr == 0;
    }
    int size(){
        return ctr;
    }
}
class queue2{
    stack2 stck=new stack2(1000);
    stack2 stck2=new stack2(1000);
    int size=0;
    void add(int num){
       stck.push(num);
        size++;

    }

    int remove(){
        if (stck2.empty()){
            while (!stck.empty())
                stck2.push(stck.pop());

        }
        int tmp=0;
        if(!stck2.empty()){
            tmp=stck2.pop();
            size--;
            //System.out.println(size);
        }
        return tmp;
    }
    //public int size() {
        //return Math.max(stck.size(), stck2.size());
    //}
    void print(){
        if(stck2.empty() && stck.empty())
            System.out.println("[]");
        else if(stck.empty()) {
            String result = "[";
            for (int i = size; i > 1; i--) {
                result += stck2.A[i];
                result += ", ";
            }
            result += stck2.A[1];
            System.out.println(result += "]");
        }
        else if(stck2.empty()){
            String result="[";
            for (int i = 1; i <size ; i++) {
                result+=stck.A[i];
                result+=", ";
            }
            result+=stck.A[size];
            System.out.println(result+="]");

        }
        else if(!stck.empty() && !stck2.empty()){
            String result = "[";
            for (int i = stck2.ctr; i >= 1; i--) {
                result += stck2.A[i];
                result += ", ";
            }
                for (int i = 1; i <stck.ctr ; i++) {
                    result+=stck.A[i];
                    result+=", ";
                }
                result+=stck.A[stck.ctr];
            System.out.println(result+="]");
            }


        }
    }

public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue2 qu=new queue2();
        while (true){
            String input=sc.nextLine();
            String[] strings=input.trim().split("\\s+");
            if(strings[0].equals("add"))
                qu.add(Integer.parseInt(strings[1]));
            else if(strings[0].equals("remove"))
                qu.remove();
            else if(strings[0].equals("print")){
                qu.print();
                break;

            }
        }
        System.exit(0);

    }

}


