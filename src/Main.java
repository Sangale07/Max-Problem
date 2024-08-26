public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(maxint(10,25,12));
    }
    static int maxint(int a , int b , int c){
        int max = 0;
        max = Math.max(a , b);
        max = Math.max(max , c);

        return max;
    }
}