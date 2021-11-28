
import java.util.Scanner;
class stack4{
    char A[];
    int n;
    int ctr;

    public stack4(int n) {
        A=new char[n];
        this.n = n;
        ctr=0;
    }
    void push(char ch){
        if(ctr!=n)
            A[++ctr]=ch;
    }
    int size(){
        return ctr;
    }
    char peek(){
        if(ctr!=0)
            return (A[ctr]);
        return 0;
    }
    char pop(){
        if(ctr!=0)
            return (A[ctr--]);
        return 0;
    }
    boolean isEmpty(){
        return ctr==0;
    }

}
public class q4{

    public static String InfixToPostfix(String input) {
        String postfix = "";
        stack4 stck4=new stack4(1000);
        char[] infix = input.toCharArray();
        for (int i = 0; i < infix.length; i++) {
            char ch = infix[i];
            switch (ch) {
                case '(':
                    stck4.push(ch);
                    break;
                case ')':
                    while (stck4.peek() != '(') {
                        postfix +=stck4.pop();
                    }
                    stck4.pop();
                    break;
                case '-':
                case '+':
                    while (stck4.peek() == '+' || stck4.peek() == '^' || stck4.peek() == '-' || stck4.peek() == '/' || stck4.peek() == '*') {
                        postfix+=stck4.pop();
                    }
                    stck4.push(ch);
                    break;
                case '*':
                case '/':
                    while (stck4.peek() == '*' || stck4.peek() == '^' || stck4.peek() == '/') {
                        postfix+=(stck4.pop());
                    }
                    stck4.push(ch);
                    break;
                case '^':
                    while (stck4.peek() == '^') {
                        postfix +=stck4.pop();
                    }
                    stck4.push(ch);
                    break;

                default:
                    postfix+=Character.toString(ch);
            }
        }
        int len = stck4.size();
        for ( int j = 0; j < len; j++ ) {
            postfix+= stck4.pop();
        }
        return postfix;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String infix=sc.nextLine();
        System.out.println(InfixToPostfix(infix));
    }
}
