import java.util.Scanner;
import java.util.Random;
public class Magarin_Cameron_Ass_02_Craps {

    public static void main(String[] args) throws Exception {
        int firstDie = 0;// stores value for first dice roll
        int secondDie = 0; // stores value for second dice roll
        int dieTotal = 0; // stores value of both die
        int thirdDie = 0;// stores value of third dice roll
        int fourthDie = 0;//stores value of fourth dice roll
        int secondTotal = 0;//stores value of third and fourth die
        String gameAnswer = "";//stores value for user input
        boolean done = false;

        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Would you like to play a game of Craps? Y/N");
            gameAnswer = in.nextLine();
        do{//code runs as long as user says Yy
            if(gameAnswer.equalsIgnoreCase("Y")){//
                firstDie = rnd.nextInt(6) + 1;//generates a random number between 1 -6
                secondDie = rnd.nextInt(6) + 1;//generates a random number between 1-6
                dieTotal = firstDie + secondDie;//combines both values and stores them in a single place
                    if(dieTotal == 7 || dieTotal == 11){ //runs if player gets a natural
                        System.out.println("You win with a " +dieTotal);
                        System.out.println("Would you like to play again?");
                        gameAnswer = in.nextLine();
                            if(gameAnswer.equalsIgnoreCase("N")){//tells program to run again if player says Y
                                done = true;
                            }

                    }
                    else if(dieTotal == 2 || dieTotal == 3 || dieTotal == 12){ //runs if player craps out
                        System.out.println("You lose with a " +dieTotal);
                        System.out.println("Would you like to play again?");
                        gameAnswer = in.nextLine();
                            if(gameAnswer.equalsIgnoreCase("N")){//tells program to run again if player says Y
                                done = true;
                            }
                    }
                    else{
                        System.out.println("Trying for point!");
                        while(secondTotal != dieTotal && secondTotal != 7){//the code will run until player gets point or if player loses
                        thirdDie = rnd.nextInt(6) +1;//generates a random number between 1 -6
                        fourthDie = rnd.nextInt(6) +1;//generates a random number between 1 -6
                        secondTotal = thirdDie + fourthDie;//combines both values and stores them in a single place
                        }
                        if(secondTotal == dieTotal){//runs if player makes point
                            System.out.println("You made point!");
                            System.out.println("Would you like to play again?");
                            gameAnswer = in.nextLine();
                            if(gameAnswer.equalsIgnoreCase("N")){//tells program to run again if player says Y
                                done = true;
                            }
                        }
                        else if(secondDie == 7){//runs if player die equal to 7
                            System.out.println("Your second die made 7!");
                            System.out.println("Would you like to play again?");
                            gameAnswer = in.nextLine();
                            if(gameAnswer.equalsIgnoreCase("N")){//tells program to run again if player says Y
                                done = true;
                            }
                        }
                    }


            }
        
        else if (gameAnswer.equalsIgnoreCase("N")) {
            System.out.println("Thank you for playing!");
        }
    
    }while(!done);

    }

}
