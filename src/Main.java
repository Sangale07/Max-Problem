import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr =  new int[n];
        for(int  i = 0 ; i< n ; i++){
            arr[0] = sc.nextInt();
        }

        Compare<String> c1 = new Compare<>("Banana" , "Peach" , "Apple");
        Compare<Integer> c = new Compare<>(10, 15, 20);
        Compare<Float>  c2 =  new Compare<>(10.5f,12.5f,9.5f);

        System.out.println(c1.compare(c1.a, c1.b,c1.c));
        System.out.println(c.compare(c.a, c.b, c.c));
        System.out.println(c.compare(c2.a, c2.b, c2.c));
        System.out.println(max(arr , n));
    }
    static int max(int[] arr , int n){
        Arrays.sort(arr);
        return arr[n - 1];

    }
}

class Compare<T>{
    T a;
    T b;
    T c;

    Compare(T a , T b ,T c){
        this.a = a;
        this.b = b;
        this.c  = c;
    }

    public <T extends Comparable<T>> T compare(T a ,T b ,T c){
        T max = a;
        if(b.compareTo(max) >0){
            max = b;
        }
        else if(c.compareTo(max) > 0){
            max = c;
        }

        return max;
    }
}
