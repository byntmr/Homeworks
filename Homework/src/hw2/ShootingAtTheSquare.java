package hw2;

import java.util.Scanner;
import java.util.Random;

public class ShootingAtTheSquare
{
    public static void matrixMaker(char[][] matrix)
    {
        for (int i = 0; i <= matrix[0].length; i++)
        {
            System.out.printf(" %d |", (i));
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++)
        {
            System.out.printf(" %d |", (i + 1));
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.printf(" %c |", matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static void hyphensMaker(char[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                matrix[i][j] = '-';
            }
        }
    }

    public static void main(String[] args)
    {
        char[][] matrix = new char[5][5];
        Scanner s = new Scanner(System.in);
        hyphensMaker(matrix);
        Random r = new Random();
        int random_row = r.nextInt(4);
        int random_column = r.nextInt(4);
        System.out.println("All set. Get ready to rumble!");
        while (true)
        {
            System.out.print("Guess the row coordinate: ");
            int row = s.nextInt() - 1;
            if (row < 0 || row > matrix.length - 1)
            {
                System.out.println("Out of range. Please enter number from 1 to 5.");
                continue;
            }
            System.out.print("Guess the column coordinate: ");
            int column = s.nextInt() - 1;
            if (column < 0 || column > matrix[0].length - 1)
            {
                System.out.println("Out of range. Please enter number from 1 to 5.");
                continue;
            }
            if (row == random_row && column == random_column)
            {
                System.out.println("You have won!");
                matrix[row][column] = '*';
                matrixMaker(matrix);
                break;
            }
            matrix[row][column] = 'x';
            matrixMaker(matrix);
        }
    }
}