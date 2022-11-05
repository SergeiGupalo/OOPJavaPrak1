public class Main {
    public static void main(String[] args){
        int a, b;
        a = (int) (20 + Math.random()*(30-20));
        b = (int) (40 + Math.random()*(50-40));
        System.out.println(a + " " + b);
        System.out.println(myNumbersProcessing(a, b));
    }
    static int myNumbersProcessing(int a, int b){
        System.out.println(a + b);
        return a * b;
    }
}
