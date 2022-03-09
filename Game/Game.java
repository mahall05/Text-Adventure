import java.util.Scanner;

import javax.lang.model.element.VariableElement;

import BaseClasses.Enemy;
import Enemies.Spider;

public class Game {
    public static double playerLife = 0;
    public static double playerDamage = 0;
    public static int playerLevel = 0;

    public static Enemy currentEnemy;
    private static boolean playing;

    private static int screenLength = 75;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        playing = true;
        while (playing){
            display();
            if(currentEnemy != null && currentEnemy.health > 0){
                displayEnemyDetails();
            }

            in.nextLine();
        }
    }

    private static void spawnSpider(){
        currentEnemy = new Spider(2, "Spider");
    }

    private static void displayEnemyDetails(){
        System.out.print("|");
        for(int i = 0; i < screenLength; i++){
            System.out.print("-");
        }
        System.out.println("|");

    }

    private static void display(){
        fillDisplay("|", '-');

        fillDisplay("| Life: ", playerLife, ' ');

        fillDisplay("| Level: ", playerLevel, ' ');

        fillDisplay("|", '-');
    }

    private static void fillDisplay(String string, double variable, char c){
        StringBuilder builderLine = new StringBuilder(string);
        builderLine.append(variable);
        String line = builderLine.toString();

        System.out.print(line);
        for(int i = 0; i < screenLength - line.length(); i++){
            System.out.print(c);
        }
        System.out.println('|');

        System.out.println(line);
    }

    private static void fillDisplay(String string, int variable, char c){
        StringBuilder builderLine = new StringBuilder(string);
        builderLine.append(variable);
        String line = builderLine.toString();

        for(int i = 0; i < screenLength - line.length() +1; i++){
            System.out.print(c);
        }
        System.out.println('|');
    }

    private static void fillDisplay(String string, char c){
        for(int i = 0; i < screenLength - string.length() +1; i++){
            System.out.print(c);
        }
        System.out.println('|');
    }

    //TODO Implement my random number method
}
