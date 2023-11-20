public class APCSA_8B {
}
class CharMatrix {
    char[][] Arr;

    public CharMatrix(int rows, int cols) {
        Arr = new char[rows][cols];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] = ' ';
            }
        }
    }

    public CharMatrix(int rows, int cols, char fill) {
        Arr = new char[rows][cols];
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                Arr[i][j] = fill;
            }
        }
    }

    public int numRows() {

        return Arr.length;
    }

    public int numCols() {

        return Arr[0].length;
    }

    public char charAt(int row, int col) {

        return Arr[row][col];
    }

    public void setCharAt(int row, int col, char ch) {

        Arr[row][col] = ch;
    }

    public boolean isEmpty(int row, int col) {

        return Arr[row][col] == ' ';
    }

    public void display() {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                System.out.print(Arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill) {
        for (int i = row0; i <= row1; i++) {
            for (int j = col0; j <= col1; j++) {
                Arr[i][j] = fill;
            }
        }
    }

    public void cleanRect(int row0, int col0, int row1, int col1, char fill) {
        for (int i = row0; i <= row1; i++) {
            for (int j = col0; j <= col1; j++) {
                Arr[i][j] = ' ';
            }
        }
    }

    public int countInRow(int row) {
        int count = 0;
        for (int j = 0; j < Arr[row].length; j++) {
            if (Arr[row][j] != ' ') {
                count++;
            }
        }
        return count;
    }

    public int countInCol(int col) {
        int count = 0;
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i][col] != ' ') {
                count++;
            }
        }
        return count;
    }


}