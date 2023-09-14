
public class stacks {
    static int a[];
    static int top;
    static int capacity;

    public stacks(int capacity){
        this.capacity= capacity;
        top=-1;
        a= new int[capacity];
    }

    void push(int data){
        if(top==capacity-1){
            System.out.println("Array is full");
        }
        a[top] = data;
        top++;
    }
    static int pop(){
        if(top==-1){
            System.out.println("Array is empty");
        }
        int res = a[top];
            top--;
        return res;
    }
    int peek(){
        if (top==-1){
            System.out.println("Array is empty");
        }
        return a[top];
    }
    static boolean isEmpty(){
        return top==-1;
    }
    public static void main(String[] args) {
       isEmpty();
       pop();
       
    }
}

