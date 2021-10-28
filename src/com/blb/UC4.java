package com.blb;
import java.util.Scanner;
public class UC4 {
    public static void main(String[] args){
        int userMove = getUsermove(board, userInput);
public int getUserMove(char[] board, Scanner userInput)
{
    Integer [] validCells = {1, 2, 3, 4, 5, 6, 7, 8, 9};
while(true)
{
System.out.println("what is your next move? (3+9): ");
int index = userInput.nextInt);
if (Arrays.asList(ValidCells).contains (index) && isSpaceFree(board, index))
  return index;
}
}
private static boolean isSpaceFree(char[] board; int index)
{
return board[index] == ' ':
}
}
}