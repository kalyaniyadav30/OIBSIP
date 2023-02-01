
        import java.util.*;
        public class Main
        {
            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("WELCOME TO NUMBER GUESSING GAME");
                System.out.println("For guessing the number correctly you will get 10 chances");
                System.out.println("Go through some rules and instructions mentioned below");
                System.out.println("Rule 1: Select any number of your choice between 1 to 100");
                System.out.println("Rule 2: Now system will select any number");
                System.out.println("Rule 3: If the number that you have selected matches with the system number then you will continue the game with 2 bonus points!!");
                System.out.println("Rule 4: And if your number does not match with the system number then you won’t secure any point");
                System.out.println("Rule 5: If the number that you have guessed is greater than the system number then the computer will inform you about it");
                System.out.println("Rule 6: If the number that you have guessed is smaller than the system number then the computer will inform you about it");
                System.out.println("Go ahead and try your luck!!!Good luck!!!");
                char c;
                do
                {
                    game();
                    System.out.println("Do you wish to start the game? y/n");
                    c=sc.next().charAt(0);
                }
                while(c=='y');
                System.out.println("See you again");
            }
            public static void game()
            {
                Scanner sc=new Scanner(System.in);
                Random r=new Random();
                int count=0;
                while(count<11)
                {
                    System.out.println("\nEnter your number: ");
                    int playerNum=sc.nextInt();
                    int systemNum=r.nextInt(99);
                    System.out.println();
                    count++ ;
                    int point =0;
                    if (count==10)
                    {
                        System.out.println("Unfortunately you couldn’t guess the number in 10 guesses.");
                        break;
                    }
                    if (systemNum==playerNum)
                    {
                        System.out.println("CONGRATS!!!You guessed the correct number.");
                        System.out.println("Total number of chances used to guessed the correct answer: "+count);
                        System.out.println("Score: "+(point+(2*count)));
                        break;
                    }
                    if (playerNum<systemNum)
                    {
                        System.out.println("The number that you have guessed is smaller than the system number.");
                        System.out.println("Score: "+point);
                        System.out.println("Give one more try.");
                    }
                    else if (playerNum>systemNum)
                    {
                        System.out.println("The number that you have guessed is greater than the system number.");
                        System.out.println("Score: "+point);
                        System.out.println("“Give one more try");
                    }
                }
            }
        }

    