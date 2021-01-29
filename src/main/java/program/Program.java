package program;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int m = scanner.nextInt();
//        int n = scanner.nextInt();
//
//        int m2 = scanner.nextInt();
//        int n2 = scanner.nextInt();
//        int[][] arr = new int[m][n];
//        int[][] arr2 = new int[m2][n2];
//        initArr(scanner, arr);
//        initArr(scanner,arr2);
//
//
//        try {
//            int[][] arrSum = ArrayUtil.sumArr(arr, arr2);
//            System.out.println(Arrays.deepToString(arrSum));
//        } catch (InsufficientSizeArray insufficientSizeArray) {
//            System.out.println(insufficientSizeArray.getMessage());
//        }
//[“aa”, “b”, “a”, “bb”, “aa”, “bb”]
//[“aa aa”, “b”, “a”, “bb bb”]
        //Arrays.toString();
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 2, 100}};
        int[] arr2 = {-103, 103, 0, -6, 6, 0, -9, 9};

        System.out.println(Arrays.toString(arr2));


    }

//    private static void initArr(Scanner scanner, int[][] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//    }
}
