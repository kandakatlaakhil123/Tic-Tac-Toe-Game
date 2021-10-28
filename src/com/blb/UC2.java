package com.blb;

public class UC2
{
    public static void main (String[] args)

    {
       Scanner userInput = new Scanner(System.in);
       char userletter = chooseUserLetter(userInput);
       char computerleter = (userLetter == 'x') ? '0' : 'x';

        private static char chooseUserLetter(Scanner userInput){
           System.out.println("choose your Letter: ");
           return userInput.next().toUpperCase().charAt(0);
    }
        }
    }
