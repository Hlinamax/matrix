import java.util.Scanner;
//Пример многомерного массива
public class Main {
    private static int[] sums;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int sum = 0;
        System.out.println("Введите размерность квадратной матрицы:");
        a = in.nextInt();
        int[][] matrix = new int[a][a];
        System.out.println("Заполните матрицу целочисленными значениями:");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("Введите а[" + i + "][" + j + "] = ");
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println();
        for (int[] is : matrix) {          //вывод матрицы
          for (int i : is) {
              System.out.print(i + "  ");
          }
            System.out.println();
        }

        sums = new int[matrix.length + matrix[0].length - 1];
        calc(matrix);
        System.out.println();
        int it = 1;
        for (int i: sums) {
            System.out.println("Сумма " + it + "-ой диагонали = " + i);
            it++;
        }
    }

    public static void calc(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sums[i+j] += matrix[matrix.length - i -1][matrix[0].length - j - 1];
            }
        }
    }
}