public class Main {
    public static void main(String[] args) throws ArithmeticException {
        Calculator calc = Calculator.instance.get();
        /**
         * было решено сделать поля закрытыми
         * и создать методы рассчета, если деление ошибночно то возвращаем 0
         * (в данном случае использовать countDivide return int)
         * или провести проверку непосредственно в переменной(интерфейсе)
         */
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b);
        /**
         * поскольку переменная b равняется 0 данная операция
         * не может завешиться так как на 0 делить нельзя
         */
        calc.println.accept(c);
    }
}