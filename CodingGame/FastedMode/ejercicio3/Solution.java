package FastedMode.ejercicio3;

import java.util.*;

public class Solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] square = new int[5][5];
        int magicSum = 0;
        int missingRow = -1, missingCol = -1;

        // Leer el cuadrado y localizar el `-1`
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                square[i][j] = in.nextInt();
                if (square[i][j] == -1) {
                    missingRow = i;
                    missingCol = j;
                }
            }
        }

        // Calcular la suma mágica (usamos una fila completa como referencia)
        for (int i = 0; i < 5; i++) {
            boolean hasMissing = false;
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                if (square[i][j] == -1) {
                    hasMissing = true;
                    break;
                }
                sum += square[i][j];
            }
            if (!hasMissing) {
                magicSum = sum;
                break;
            }
        }

        // Calcular la suma de la fila que contiene el `-1`
        int currentSum = 0;
        for (int j = 0; j < 5; j++) {
            if (j != missingCol) {
                currentSum += square[missingRow][j];
            }
        }

        // Determinar el número que falta
        int missingValue = magicSum - currentSum;
        System.out.println(missingValue);
    }
}