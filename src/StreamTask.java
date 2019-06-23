import java.util.stream.IntStream;

public class StreamTask {
    public static void main(String[] args) {
        int[] numbers = {0, 5, 8, 12, -18, 0, 0, 0, -54, 84, -35, 17, 37, 0};

        double average = IntStream.of(numbers)
                .average()
                .getAsDouble();
        System.out.println("Среднее значение элементов массива: " + average);

        int minElement = IntStream.of(numbers)
                .min()
                .getAsInt();
        System.out.println("Минимальный элемент массива: " + minElement);

        int indexMinElement = IntStream.of(numbers)
                .filter(i -> numbers[i]== minElement)
                .findFirst()
                .getAsInt();
        System.out.println("Индекс минимального элемента массива: " + indexMinElement);

        int elemZero = (int) IntStream.of(numbers)
                .filter(i -> i == 0)
                .count();
        System.out.println("Количество элементов равных 0: " + elemZero);

        int positiveElem = (int) IntStream.of(numbers)
                .filter(i -> i > 0)
                .count();
        System.out.println("Количество элементов больше 0: " + positiveElem);
    }
}
