import java.util.Scanner;

class stack3 {
    char A[];
    int ctr;
    int n;

    public stack3(int n) {
        A = new char[n];
        this.n = n;
        ctr = 0;
    }

    void push(char ch) {
        A[++ctr] = ch;
    }

    char pop() {
        return A[ctr--];
    }

    public int size() {
        return ctr;
    }
}

public class q3 {

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            stack3 stck = new stack3(1000);
            String word;
            int num = 0;
            boolean sameWord = true;

            word = scan.nextLine();
            for(int i = 0; i < word.length(); i++) {
                stck.push(new Character(word.charAt(num)));
                num++;
            }
            num = 0;

            while(sameWord&&(num < stck.size())) {
                if(word.charAt(num) == ((Character)stck.pop()).charValue()) {
                    num++;
                    continue;
                }
                else{
                    sameWord = false;
                    break;
                }
            }
            if(sameWord == true)
                System.out.print("palindrome");
            else
                System.out.print("not palindrome");
        }
    }
