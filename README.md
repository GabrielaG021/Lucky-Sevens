# Lucky Sevens Game

## Problem Statement
Write a program that plays this game, which will also demonstrate the futility of playing Lucky Sevens.
Rules of the Game:
1. Each round, the program rolls a virtual pair of dice for the user.
2. If the sum of the two dice is equal to 7, the player wins $4; otherwise, the player loses $1.

## Requirements
Program must include the following features:
  1. This program will be a Java Console Application called `LuckySevens`.
  2. The program first asks the user how many dollars they have to bet.
  3. The program then rolls the dice repeatedly until all the money is gone.
     * **Hint**: Use a loop construct to keep playing until the money is gone.
  4. The program keeps track of how many rolls were taken before the money ran out.
  5. The program keeps track of the maximum amount of money held by the player.
  6. The program keeps track of how many rolls were taken at the point when the user held the most money.
     * **Hint**: For steps 4, 5, and 6, declare some variables.

## Sample Output:
`How many dollars do you have? 100`

`You are broke after 543 rolls.`

`You should have quit after 47 rolls when you had $113.`
