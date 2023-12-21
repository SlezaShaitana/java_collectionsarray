package practice.twoDimensionalArray;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        char[][] arrayX = new char[size][];
        for (int i = 0; i < arrayX.length; i ++) {
            arrayX[i] = new char[size];
            for (int j = 0; j < arrayX[i].length; j++){
                arrayX[i][j] = (i == j || j == arrayX.length -1 - i) ? SYMBOL : ' ';
            }
        }

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        return arrayX;
    }
}
