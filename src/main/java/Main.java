import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 4, 3, 7}; //Объявляем и инициализируем массив
        System.out.println(array); //Вывод массива на экран без метода toString - получаем 16ричное числа ха-ха :)
        System.out.println(Arrays.toString(array)); //важно напечатать Arrays правильно
        Arrays.sort(array, 0,4); // Сортируем массив от 0 до 4 элемента (по возрастанию)
        System.out.println(Arrays.toString(array)); // выводим отсортированный массив на экран
        int key = Arrays.binarySearch(array, 5); // ищем key - число 5 в отсортированнном массиве.
        //метод binarySearch выдаст индекс элемента остортированного массива, в котором "спрятано" искомое число
        System.out.println(key); //распечатаем индекс искомого числа
        System.out.println(Arrays.binarySearch(array, 0)); //а теперь попробуем найти число, которого в массиве нет,
        // и сразу же выведем результат на экран
    }
}
