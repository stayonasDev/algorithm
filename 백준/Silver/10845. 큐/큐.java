import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        queue1 queue;
        String order;
        int num = Integer.parseInt(br.readLine());
        queue = new queue1(num);

        for(int i =0; i < num; i++){
             st = new StringTokenizer(br.readLine());
            order = st.nextToken();

            switch(order) {
                case("push") :
                    int item = Integer.parseInt(st.nextToken());
                    queue.push(item);
                    break;
                case("pop") :
                    System.out.println(queue.pop());
                    break;
                case("size"):
                    System.out.println(queue.size());
                    break;
                case("empty"):
                    System.out.println(queue.empty());
                    break;
                case("front"):
                    System.out.println(queue.front());
                    break;
                case("back"):
                    System.out.println(queue.back());
                    break;
            }
        }
    }
}

class queue1{
    int[] array;
    int capacity;
    int size;
    int front;
    int back;

    public queue1(int capacity){
        array = new int[capacity];
        this.capacity = capacity;
        size = front = back = 0;
    }

    public void push(int item){
        if(back >= capacity -1) {
            back = 0;
        }
        array[back++] = item;
        size++;
    }

    public int pop(){
        if(0 >=size){
            return -1;
        }else if(front >= capacity-1){
            front = 0;
        }
        int temp = array[front];
        array[front++] = -1;
        size --;
        return temp;
    }

    public int size(){
        return size;
    }

    public int empty(){
        return 0 >= size ? 1 : 0;
    }

    public int front(){
        if(0 >= size){
            return -1;
        }
        return array[front];
    }

    public int back(){
        if(0 >= size){
            return -1;
        }
        return array[back-1];
    }
}
