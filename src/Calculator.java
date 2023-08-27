import java.util.function.*;

public class Calculator implements Supplier {
    static Supplier<Calculator> instance = Calculator::new;
    /**
     * Добавляем BinaryOperator переменные для математических операций используем Integer
     *
     * @param x
     * @param y
     */
     BinaryOperator<Integer> plus = ((x, y) -> x + y);
     BinaryOperator<Integer> minus = ((x, y) -> x - y);
     BinaryOperator<Integer> multiply = ((x, y) -> x * y);

//     private BinaryOperator<Integer> divide = (x, y) -> x / y ;
     BinaryOperator<Integer> divide = (x,y) -> ((y == 0) ? 0 : x/y);


    /**
     * Добавляем UnaryOperator для математических операций с одним числом
     *
     * @param x
     */
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    /**
     * обавляем переменную типа Predicate для определения положительное число или нет*
     *
     * @param x
     */
    Predicate<Integer> isPositive = x -> x > 0;

    /**
     * создаем переменную типа Consumer для вывода println на экран
     */
    Consumer<Integer> println = System.out::println;

    /**
     * Данный метод производит тоже самое что и сделано в нутри переменной
     * для использования этого метода можно раскоментировать этот метод
     * и сделать variable divide private и решать задание через данный метод
     * @param a
     * @param b
     * @return divide1
     */
//    public int countDivide(int a, int b) {
//        int divide1 = 0;
//        try{
//            divide1 = divide.apply(a, b);
//        }catch (ArithmeticException e){
//            return 0;
//        }
//        return divide1;
    @Override
    public Object get() {

        return null;
    }


}
