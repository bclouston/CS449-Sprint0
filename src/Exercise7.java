import java.util.Random;

public class Exercise7 {

    public int getTotal(int[][] arr) {
        int sum = 0;
        for (int[] row : arr)
            for (int i : row)
                sum += i;
        return sum;
    }

    public double getAverage(int[][] arr) {
        return (double) getTotal(arr) / (arr.length * arr[0].length);
    }

    public int getRowTotal(int[][] arr, int row) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[row][i];
        return sum;
    }

    public int getColumnTotal(int[][] arr, int col) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i][col];
        return sum;
    }

    public int getHighestInRow(int[][] arr, int row) {
        int high = arr[row][0];
        for (int i : arr[row])
            if (high < i)
                high = i;
        return high;
    }

    public int getLowestInRow(int[][] arr, int row) {
        int low = arr[row][0];
        for (int i : arr[row])
            if (low > i)
                low = i;
        return low;
    }

    public int[][] generateArr(int row, int col) {
        int[][] arr = new int[row][col];
        Random rand = new Random();
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                arr[i][j] = rand.nextInt(100);
        return arr;
    }

    public void printArr(int[][] arr) {
        System.out.print("\n");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]);
                if (j < arr[0].length - 1)
                    System.out.print(", ");
                if (j == arr[0].length - 1)
                    System.out.print("\n");
            }
        System.out.print("\n");
    }
}
