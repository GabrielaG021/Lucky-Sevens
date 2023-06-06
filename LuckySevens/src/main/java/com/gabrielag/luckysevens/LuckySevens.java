/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gabrielag.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Gabriela Gutierrez
 */
public class LuckySevens {
    // UPDATED ON 5-5-23
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Random rollDice = new Random();
        
        // Declare variables
        int dice1, dice2, sumOfDices;
        int playerMoney, playerMoneyAtHighest = 0, playerMoneyAtHighestTotalRolls = 0;
        int counterOfRolls = 0;
        
        System.out.println("How many dollars do you have?");
        playerMoney = reader.nextInt();
        
        while(playerMoney > 0){
            counterOfRolls++;
            dice1 = rollDice.nextInt(6) + 1;
            dice2 = rollDice.nextInt(6) + 1;
        
            sumOfDices = dice1 + dice2;
            
            if(sumOfDices == 7){
                playerMoney += 4;
            } else {
                playerMoney -= 1;
            }
            
            if(playerMoney > playerMoneyAtHighest){
                playerMoneyAtHighest = playerMoney;
                playerMoneyAtHighestTotalRolls = counterOfRolls;
            }
        }
        
        System.out.println("You are broke after " + counterOfRolls + " rolls.");
        System.out.println("You should have quit after " + playerMoneyAtHighestTotalRolls + " rolls when you had $" + playerMoneyAtHighest + ".");
    }
}
