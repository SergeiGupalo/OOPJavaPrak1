public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(5, 0.01f, 0.002f, 0.3f);
        calc.set(14.26f, -1.22f, 0.035f);
        calc.calculate();
        calc.print();
    }
}