package arrays;

import exceptions.InsufficientSizeArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayUtil {
    /**
     * fill
     * Дан массив целых чисел.
     * Заполнить данный массив с клавиатуры. Scanner подать как аргумент метода
     */
    public static void fill(int[] arr, Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }

    /**
     * toString
     * Дан массив целых чисел.
     * Преобразовать данный массив в строковое значение в формате JSON
     * Пример:
     * [10, 2, 6, 4]
     */
    public static String toString(int[] arr) {
        String s = "";
        boolean has = false;
        for (int value : arr) {
            if (has)
                s += ", ";
            s += value;
            has = true;
        }
        return "[" + s + "]";
    }

    /**
     * evenData
     * Дан массив целых чисел. Выведите все четные элементы массива.
     * Указание:
     * Для проверки четности элемента массива реализовать отдельный метод isEven,
     * который будет проверять, является ли переданный ей элемент четным.
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     */
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String evenData(int[] arr) {
        String s = "";
        boolean has = false;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                if (has) {
                    s += ", ";
                }
                s += arr[i];
                has = true;
            }
        }
        return "[" + s + "]";
    }


    /**
     * Дан массив целых чисел. Заполнить данный массив числами в диапазоне от a до b
     * Указание:
     * Для генерации случайного числа в диапазоне от a до b реализовать отдельный метод getRandomNumber
     */

    public static int getRandomNumber(int a, int b) {
        return (int) (Math.random() * (b - a) + a);
    }

    public static void fillRandom(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getRandomNumber(a, b);
        }
    }


    /**
     * Дан массив целых чисел. Выведите все элементы массива с четными индексами.
     * В программе запрещено использовать условную инструкцию для проверки четности индексов.
     * (Цикл по четным индексам)
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     */
    public static String evenIndexes(int[] arr) {
        String s = "";
        boolean has = false;
        for (int i = 0; i < arr.length; i += 2) {
            if (has) {
                s += ", ";
            }
            s += arr[i];
            has = true;
        }
        return "[" + s + "]";


    }

    /**
     * Дан массив целых чисел.
     * Определить количество положительных элементов в данном массиве.
     */

    public static int countPositive(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }

        }
        return count;
    }


    /**
     * Дан массив целых чисел. Выведите все элементы массива,
     * которые больше предыдущего элемента.
     * Решение оформить 2 способами:
     * -возвращать строковое представление массива в формате JSON
     * -используя ArrayList для накопления элементов, удовлетворяющих условию задачи
     */

    public static String greatPrev(int[] arr) {
        String s = "";
        boolean has = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                if (has) {
                    s += ", ";
                }
                s += arr[i + 1];
                has = true;
            }
        }
        return "[" + s + "]";
    }

    /**
     * Дан массив целых чисел.
     * Выведите значение наибольшего элемента в массиве
     **/

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];

        }
        return max;
    }

    public static int[] sameNeighbours(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > 0 && arr[i + 1] > 0 || arr[i] < 0 && arr[i + 1] < 0) {
                return new int[]{arr[i], arr[i + 1]};
            }
        }
        return new int[0];
    }


    /**
     * greaterNeighbours
     * Дан массив целых чисел. Определите, сколько в этом массиве элементов,
     * которые больше двух своих соседей и выведите количество таких элементов.
     */
    public static int greaterNeighbours(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                count++;
            }
        }
        return count;
    }

    /**
     * minPositive
     * Дан массив целых чисел.
     * Выведите значение наименьшего из всех положительных элементов в массиве. Известно, что в массиве есть хотя бы один положительный элемент.
     */
    public static int minPositive(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * minOdd
     * Дан массив целых чисел. Выведите значение наименьшего нечетного элемента массива,
     * а если в массиве нет нечетных элементов см. способы реализации.
     * Указание:
     * Для проверки нечетности элемента использовать заранее написанную функцию из п.5
     * Решение оформить 2 способами:
     * -Вернуть значение 0 при отсутствии элементов, удовлетворяющих условию задачи
     * -Вернуть значение null, указав тип возвращаемого значения объектную оболочку типа int – Integer.
     */

    public static int minOdd(int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (!isEven(arr[i]) && min > arr[i]) {
                min = arr[i];
                bool = true;
            }
        }
        /*if (bool) {
            return min;
        } else
            return 0;*/
        return bool ? min : 0;
    }

    public static Integer minOddInteger(int[] arr) {
        int min = Integer.MAX_VALUE;
        boolean bool = false;
        for (int i = 0; i < arr.length; i++) {
            if (!isEven(arr[i]) && min > arr[i]) {
                min = arr[i];
                bool = true;
            }
        }
        return bool ? min : null;
    }


    /**
     * nearest
     * Дан массив целых чисел и число x. Найдите в данном массиве элемент,
     * ближайший к x(элемент с минимальной абсолютной разницей с х).
     * Если таких чисел несколько, выведите см. способы реализации.
     * Решение оформить 3 способами:
     * -Вернуть последний элемент, удовлетворяющий условиям задачи
     */

    public static int nearest(int[] arr, int x) {
        int index = 0;
        int num = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int abs = Math.abs(x - arr[i]);
            if (abs <= num) {
                num = abs;
                index = arr[i];
            }
        }
        return index;

    }

    /**
     * indexInsertion
     * Дана невозрастающая последовательность целых чисел в виде массива и число x.
     * Вывести номер этой последовательности, куда можно было бы вставить данных элемент х,
     * чтобы правило не возрастания сохранилось, учитывая, что нумерация элементов в последовательности начинается с 1.
     * Если в последовательности уже есть элементы,
     * равные х, то считается, что данный элемент вставляется после них.
     */
    public static int indexInsertion(int[] arr, int x) {

        for (int i = 0; i < arr.length; i++) {
            if (x > arr[i]) return i + 1;
        }
        return arr.length + 1;

    }

    /**
     * countDifferent
     * Дан массив целых чисел, УПОРЯДОЧЕННЫЙ по неубыванию элементов в нем.
     * Определите, сколько в нем различных элементов.Решение в один цикл.
     * Пример:
     * 1 1 2 3 ->3
     * 1 2 3 ->3
     * 1 1 1 ->1
     */

    public static int countDifferent(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                count++;
            }

        }
        return count + 1;
    }

    public static int different(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]) count++;

        }
        return count;
    }

    /**
     * reverse(метод должен быть void, не использовать вспомогательный массив)
     * Дан массив целых чисел. Переставьте элементы данного массива в обратном порядке.
     * Метод должен производить разворот исходного массива, ничего не возвращая.
     */

    public static void reverse(int[] arr) {
        int num;
        for (int i = 0; i < arr.length / 2; i++) {
            num = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = num;
        }
    }

    /**
     * reverseNeighbours
     * Дан массив целых чисел.
     * Переставьте соседние элементы массива.
     * Если элементов нечетное число,
     * то последний элемент остается на своем месте.
     */

    public static void reverseNeighbours(int[] arr) {
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }
    }


    /**
     * countEqualPairs
     * Дан массив целых чисел.
     * Посчитайте, сколько в нем пар элементов,
     * равных друг другу. Считается, что любые два элемента,
     * равные друг другу образуют одну пару, которую необходимо посчитать.
     */

    public static int countEqualPairs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }


    /**
     * shift
     * Дан массив целых чисел и параметр k.
     * Если данный параметр истинный, то выполнить циклический сдвиг массива на одну позицию вправо,
     * если ложный, то влево.
     * Метод должен производить операции над массивом, ничего не возвращая.
     */

    public static void shift(int[] arr, boolean k) {
        if (k) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;

        } else {
            int temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;


        }
    }

    /**
     * shift(делать вызов метода из задачи 21)
     * Дан массив целых чисел и число k.
     * Выполнить циклический сдвиг массива на |k| позиций вправо, если k>0 или влево, если k<0.
     * Метод должен производить операции над массивом, ничего не возвращая.
     */
    public static void shiftCount(int[] arr, int k) {
        for (int i = 0; i < Math.abs(k); i++) {
            shift(arr, k > 0);
        }
    }

    /**
     * countDifferent
     * Дан массив целых чисел.
     * Посчитайте,сколько в нем различных элементов, не изменяя самого массива.
     */
    public static void countDifferent24(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                count++;
        }
    }


    /**
     * unique
     * Дан массив целых чисел. Выведите те его элементы, которые встречаются в массиве только один раз.
     * Элементы нужно выводить в том порядке, в котором они встречаются в массиве.
     * Решение оформить 2 способами:
     * -использовать вспомогательный массив для хранения элементов
     * -использовать ArrayList для накопления элементов, удовлетворяющих условию задачи
     */
    public static int uniqueCount(int[] arr) {
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                size++;
            }
        }
        return size;
    }

    public static int[] unique(int[] arr) {
        int length = uniqueCount(arr);
        int size = 0;
        int[] array = new int[length];
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                array[size] = arr[i];
                size++;
            }
        }
        return array;
    }


    public static Integer[] uniqueArrayList(int[] arr) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                integerArrayList.add(arr[i]);
            }
        }
        return integerArrayList.toArray(new Integer[0]);
    }


    /**
     * frequent
     * Дан массив целых чисел. Не изменяя массива определить, какое число в этом массиве встречается чаще всего.
     * Если таких чисел несколько, выведите см. способы реализации.
     * Решение оформить 3 способами:
     * -Вернуть первый элемент, удовлетворяющий условиям задачи+
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя дополнительный массив
     * -Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
     */

    public static int frequentFistElement(int[] arr) {
        int maxFrequent = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequent = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequent++;
                }
            }
            if (frequent > maxFrequent) {
                maxFrequent = frequent;
                num = arr[i];
            }
        }
        return num;
    }

    /**
     * Вернуть все элементы, удовлетворяющие условиям задачи, используя ArrayList
     */
    public static Integer[] frequentArrayList(int[] arr) {
        int maxFrequent = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequent = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequent++;
                }
            }
            if (frequent > maxFrequent) {
                maxFrequent = frequent;
            }
        }

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            int frequentCount = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequentCount++;
                }
            }
            if (frequentCount == maxFrequent) {
                integerArrayList.add(arr[i]);
            }
        }
        return integerArrayList.toArray(new Integer[0]);
    }


    /**
     * Вернуть все элементы, удовлетворяющие условиям задачи, используя дополнительный массив
     */
    public static int[] frequentArr(int[] arr) {
        int maxFrequent = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequent = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequent++;
                }
            }
            if (frequent > maxFrequent) {
                maxFrequent = frequent;
            }
        }

        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequentCount = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequentCount++;
                }
            }
            if (frequentCount == maxFrequent) {
                length++;
            }
        }
        int[] arrFrequent = new int[length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            int frequentCount = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequentCount++;
                }
            }
            if (frequentCount == maxFrequent) {
                arrFrequent[size++] = arr[i];
            }
        }
        return arrFrequent;
    }


    /**
     * search
     * Дан массив целых чисел и число key.
     * Методом линейного поиска при помощи цикла for найти индекс вхождения числа key в массиве
     * 29.1 search
     * Модернизировать программу таким образом,  чтобы она вернула индексы всех вхождений числа key в массиве.
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов
     * -использовать ArrayList для накопления элементов
     */

    public static int[] search(int key, int[] arr) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                length++;
            }
        }
        int[] array = new int[length];
        for (int i = 0, size = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                array[size++] = i;
            }
        }
        return array;
    }

    public static ArrayList<Integer> searchArrayList(int[] arr, int key) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                integerArrayList.add(i);
            }

        }
        return integerArrayList;
    }

    public static int searchFirstElement(int key, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (key == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    /**
     * Написать метод который принимает на вход два двумерных массива и возвращает их сумму.
     */
    public static int[][] sumArr(int[][] arrFist, int[][] arrSecond) throws InsufficientSizeArray {
        if (arrFist.length != arrSecond.length || arrFist[0].length != arrSecond[0].length) {
            throw new InsufficientSizeArray("Длины массивов не совпадают");
        }
        int[][] arr = new int[arrFist.length][arrFist[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arrFist[i][j] + arrSecond[i][j];
            }
        }
        return arr;
    }


    /**
     * Написать метод который принимает на вход двумерный массив и возвращает произведение его диагональных элементов.
     */
    public static int multipleArrDiag(int[][] arr) {
        int multiple = 1;
        for (int i = 0; i < arr.length; i++) {
            multiple *= arr[i][i];
        }
        return multiple;
    }

    //1 2 3 4
    //1 2 3
    public static boolean equalsIgnoreCase(int[] arrFirst, int[] arrSecond) {
        boolean equalsArr = true;
        for (int i = 0; i < arrFirst.length; i++) {
            equalsArr = false;
            for (int j = 0; j < arrSecond.length; j++) {
                if (arrFirst[i] == arrSecond[j]) {
                    equalsArr = true;
                }
            }
            if (!equalsArr) {
                return false;
            }
        }
        for (int i = 0; i < arrSecond.length; i++) {
            equalsArr = false;
            for (int j = 0; j < arrFirst.length; j++) {
                if (arrSecond[i] == arrFirst[j]) {
                    equalsArr = true;
                }
            }
            if (!equalsArr) {
                return false;
            }
        }
        return true;
    }


    /**
     * equals
     * Даны два массива целых чисел. Сравнить их на равенство.
     * Указание:
     * Под равенством двух массивов понимать их тождественное равенство,
     * то есть два массива с одинаковыми длинами, одинаковыми элементами,
     * но разным порядком этих элементов считаются разными
     */

    public static boolean equals(int[] arrFirst, int[] arrSecond) {
        if (arrFirst.length != arrSecond.length)
            return false;
        for (int i = 0; i < arrFirst.length; i++) {
            if (arrFirst[i] != arrSecond[i])
                return false;
        }
        return true;
    }

    /**
     * copyOf
     * Дан массив, сделать его копию
     * Указание:
     * Метод должен принимать на вход 2 параметра: исходный массив, который надо скопировать и длину нового массива.
     * Если длина исходного массива больше длины нового массива, то копируется только часть исходного массива,
     * если длина исходного массива меньше длины нового массива, то в новый массив исходный массив копируется полностью,
     * а оставшаяся незаполненная часть записывается нулями,
     * если же размер нового массива совпадает с размером исходного, то в новый массив копируется полностью исходный.
     */

    public static int[] copyOf(int[] arr, int length) {
        int[] copyArr = new int[length];
        int min = Math.min(copyArr.length, arr.length);
        for (int i = 0; i < min; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }


    /**
     * copyOfRange
     * Дан массив и два целых числа b и e, сделать копию исходного массива начиная с индекса а и заканчивая b
     * Указание:
     * Метод должен принимать на вход 3 параметра: исходный массив,
     * который надо скопировать и границы копирования. Если длина исходного массива меньше числа a,
     * то вернуть null.
     * Если длина исходного массива меньше  числа b, то в новый массив исходный массив копируется полностью,
     * а оставшаяся незаполненная часть записывается нулями.
     */

    public static int[] copyOfRange(int[] arr, int a, int b) {
        if (a > arr.length) {
            return null;
        }
        int length = b - a;
        if (length <= 0) {
            throw new NegativeArraySizeException("Длина массива не может быть отрицательной или равной нулю");
        }
        int[] copyArr = new int[length + 1];
        if (copyArr.length < arr.length) {
            for (int i = 0, j = a; i < copyArr.length; i++, j++) {
                copyArr[i] = arr[j];
            }
        } else {
            for (int i = 0, j = a; i < arr.length - a; i++, j++) {
                copyArr[i] = arr[j];
            }
        }
        return copyArr;

    }

    /**
     * Sort
     * Дан массив целых чисел. Выполнить сортировку массива пузырьком и сортировкой отбором (линейная сортировка).
     * Решение оформить 2 способами:
     * -Выполнить данные сортировки
     * -Выполнить данные сортировки, принимая в качестве аргумента Comparator для сравнения элементов
     * 32.1 isOrder
     * Дан массив целых чисел. Определить, является ли он упорядоченным
     * 32.2 TesterClass
     * В класс Tester в пакете tests, определить в нем метод,
     * который тестирует метод Протестировать методы sort на случайно сгенерированных 1000 массивах,
     * применяя метод isOrder для проверки, является ли массив упорядоченным после выполнения сортировки,
     * при верности теста выводить sout в формате: ---------test номер_теста is successful,
     * при неверности выводить serr в формате: ---------test номер_теста is invalid.
     */


    /**
     * Сортировка пузырьком
     */

    public static void bubbleSort(int[] arr, Comparator<Integer> comparator) {
        boolean flag = false;
        int num;
        while (!flag) {
            flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) { //использовать вместо < метод из обхекта компаратора
                    flag = false;
                    num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                }
            }
        }
    }

    public static void bubbleSortComparator(int[] arr, Comparator<Integer> comparator) {
        boolean flag = false;
        int num;
        while (!flag) {
            flag = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (comparator.compare(arr[i], arr[i + 1]) > 0) { //использовать вместо < метод из обхекта компаратора
                    flag = false;
                    num = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = num;
                }
            }
        }
    }


    /**
     * Линейная сортировка
     */

    public static void selectionSort(int[] arr, Comparator<Integer> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    index = j;
                }
            }
            if (i != index) {
                int num = arr[i];
                arr[i] = arr[index];
                arr[index] = num;
            }

        }
    }

    public static void selectionSortComparator(int[] arr, Comparator<Integer> comparator) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (comparator.compare(min, arr[j]) > 0) {
                    index = j;
                }
            }
            if (i != index) {
                int num = arr[i];
                arr[i] = arr[index];
                arr[index] = num;
            }

        }
    }

    /**
     * isOrder
     * Дан массив целых чисел. Определить, является ли он упорядоченным
     */

    public static boolean isOrder(int[] arr) {
        return isOrderAscending(arr) || isOrderDescending(arr);
    }

    private static boolean isOrderAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isOrderDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return false;
            }
        }
        return true;
    }


    /**
     * towards
     * Дан массив вещественных чисел. Сформировать его строковое представление в формате JSON следующем порядке:
     * первое число, последнее, второе, предпоследнее и так далее все числа (см. пример).
     * Пример:
     * Входные данные:  1 2 3 4 5
     * Выходные данные:  [1, 5, 2, 4, 3]
     */

    public static String towards(int[] arr) {
        String str = "";
        boolean flag = false;
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            if (flag)
                str += ", ";
            str += "" + arr[i] + ", " + arr[j];
            flag = true;
        }

        if (arr.length % 2 != 0) {
            str += ", " + arr[arr.length / 2];
        }
        return "[" + str + "]";
    }


    /**
     * Задача даны два двумерных массива - матрицы ,
     * выполнить произведение этих матриц алгебраически .
     * См произведение матриц
     */

    public static int[][] multipleMatrix(int[][] arr, int[][] arr2) {
        int arr1ColCount = arr[0].length;//количество столбцов в первой матрице
        int arr2RowCount = arr2.length;//количество строк во второй матрице
        if (arr1ColCount != arr2RowCount) {
            return null;
        }

        int arr1RowCount = arr.length;//количество строк в первой матрице
        int arr2ColCount = arr2[0].length;//количество столбцов во второй матрице


        int[][] arr3 = new int[arr1RowCount][arr2ColCount];

        for (int i = 0; i < arr1RowCount; i++) {
            for (int j = 0; j < arr2ColCount; j++) {
                for (int k = 0; k < arr1ColCount; k++) {
                    arr3[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        return arr3;
    }

    /**
     * equalItems
     * Дан массив. Найдите элементы, равные друг другу.
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов(для определения количества равных использовать метод из задачи  23)
     * -использовать ArrayList для накопления элементов
     */

    //int[]arr={0,0,1,1,2,2,3,3,4,4};
    public static int[] equalItems(int[] arr) {
        int[] equalItemsArr = new int[countEqualPairs(arr)];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    equalItemsArr[size] = arr[i];
                    size++;
                }
            }
        }
        return equalItemsArr;
    }

    public static ArrayList<Integer> equalItemsArrayList(int[] arr) {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    integerArrayList.add(arr[i]);
                }
            }
        }
        return integerArrayList;
    }

    /**
     * group
     * Дан массив строковых данных. Сформировать на основании данного массива новый массив,
     * элементами которого будут новые строки, скрепленные между собой по принципу их равности.
     * То есть необходимо реализовать алгоритм группировки строк по их равенству.
     * Пример:
     * Входные данные: [“aa”, “b”, “a”, “bb”, “aa”, “bb”]
     * Выходные данные: [“aa aa”, “b”, “a”, “bb bb”]
     * Указание:
     * Для сравнения строк использовать механизм str1.equals(str2). Оператор == для строк использовать нельзя
     * Решение оформить 2 способами:
     * -использовать массив для хранения элементов
     * -использовать ArrayList для накопления элементов
     */
// a a a a a
    public static int countEqualPairsString(String[] arr) {
        int count = 0;
        boolean[] booleans = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (booleans[i] == true) {
                continue;
            }
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && i != j) {
                    booleans[j] = true;
                    count++;
                }
            }
        }
        return count;
    }

    //[“aa”, “b”, “a”, “bb”, “aa”, “bb”]
    //[“aa aa”, “b”, “a”, “bb bb”]
    public static String[] group(String[] arr) {
        String[] groupArr = new String[arr.length - countEqualPairsString(arr)];
        boolean[] booleans = new boolean[arr.length];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (booleans[i]) {
                continue;
            }
            String s = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    booleans[j] = true;
                    s += " " + arr[j];
                }
            }
            groupArr[size++] = s;
        }
        return groupArr;
    }

    /**
     * temperatureMinimum
     * Метеорологи ведут многолетние наблюдения за тем, в каком году была минимальная температура в данный день года.
     * Например, абсолютный минимум температуры в Москве 8 марта был -32 градуса (1890).
     * В течение k лет метеорологи вели наблюдения за n днями года.
     * Для каждого из этих n дней укажите минимальную температуру, которая была в этот день за k лет наблюдений.
     * Данные подаются в виде двумерного массива из k строк и n столбцов. Далее идет k строк, i-я строка содержит n чисел:
     * значения температур для n дней наблюдений i-го года.
     * Программа должна сформировать массив из n чисел: минимальное значение температуры для каждого из дней наблюдений.
     */

    public static int[] temperatureMinimum(int[][] arr) {
        int[] temperatureMinimumArr = new int[arr[0].length];
        for (int i = 0; i < arr[i].length; i++) {
            int min = arr[0][i];
            for (int j = 1; j < arr.length; j++) {
                if (arr[j][i] < min) {
                    min = arr[j][i];
                }
            }
            temperatureMinimumArr[i] = min;

        }
        return temperatureMinimumArr;
    }

    public static double setDiam(int[][] arr) {
        int x;
        int y;
        double max = Double.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            x = arr[i][0];
            y = arr[i][1];
            for (int j = i + 1; j < arr.length; j++) {
                if (dist(x, y, arr[j][0], arr[j][1]) > max) {
                    max = dist(x, y, arr[j][0], arr[j][1]);
                }
            }

        }
        return max;
    }

    private static double dist(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    //        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 100}};
//        int[] arr2 = {-103, 103, 0, -6, 6, 0, -9, 9};

    private static int[] debts(int[][] arr, int n) {
        int[] balance = new int[n];
        for (int i = 0; i < arr.length; i++) {
            int index1 = arr[i][0] - 1;
            int index2 = arr[i][1] - 1;
            int sum = arr[i][2];
            balance[index1] -= sum;
            balance[index2] += sum;
        }
        return balance;
    }


}
