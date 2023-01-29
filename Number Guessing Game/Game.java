import java.util.Scanner;

public class Game {
    public static void main(String[] args) {



        welcome();



        int round = 1;

        double[] point = new double[12];

        Scanner sc = new Scanner(System.in);

        while(round <= 12) {                            // I used while loop for a 12 round //

            boolean[] cardOpenStatus = {false, false, false, false, false, false};
            int[] arr = new int[6];

            int card1 = getRandomNumber();                 // In this random number area, card 1 is common number//
            int card2 = getRandomNumber();                 // Card2 is  rare number//
            int card3 = getRandomNumber2();                // Card3 is determine where the rare number will be//




            arr[card3-1] = card2;
            //I used a loop to keep the numbers in the array//
            for (int i = 0; i < 6; i++){
                if (arr[i] == 0)
                    arr[i] = card1;


            }



            short guesslimit = 7;
            short guess = 0;

            if(round == 1) {
                point = new double[13];
            }

            for(int guesscount = 0; guesscount < guesslimit; guesscount++) {

                if(guess > 6) {
                    System.out.println("You have to guess number between 1 - 6");

                }



                // 	I used to  for loop If the user knows the wrong card, then continue until her 6th guess.
                // In order to cross the limit and roll the other round

                if(guesscount == 0) {
                    System.out.println("ROUND "+round+" ");
                    System.out.println("Card1");
                    card(0,false);
                    empty();
                    System.out.println("Card2");
                    card(0,false);
                    empty();
                    System.out.println("Card3");
                    card(0,false);
                    empty();
                    System.out.println("Card4");
                    card(0,false);
                    empty();
                    System.out.println("Card5");
                    card(0,false);
                    empty();
                    System.out.println("Card6");
                    card(0,false);
                    empty();

                } else if (guesscount < 7 && guess == 1) {
                    cardOpenStatus[0] = true;

                    System.out.println("Card1");
                    card(arr[0],cardOpenStatus[0]);
                    empty();
                    System.out.println("Card2");
                    card(arr[1],cardOpenStatus[1]);
                    empty();
                    System.out.println("Card3");
                    card(arr[2],cardOpenStatus[2]);
                    empty();
                    System.out.println("Card4");
                    card(arr[3],cardOpenStatus[3]);
                    empty();
                    System.out.println("Card5");
                    card(arr[4],cardOpenStatus[4]);
                    empty();
                    System.out.println("Card6");
                    card(arr[5],cardOpenStatus[5]);
                    empty();

                    if (card2 == arr[0]){
                        System.out.println("Congratulations, you find the different card.");
                        System.out.println("You got "+(6-guesscount)+" points earned");
                        point[round] = 6 - guesscount;
                        break;
                    }else{
                        System.out.println(" Sorry, card 1 does not have different number");
                    }

                }else if (guesscount < 7 && guess == 2) {
                    cardOpenStatus[1] = true;
                    System.out.println("Card1");
                    card(arr[0],cardOpenStatus[0]);
                    empty();
                    System.out.println("Card2");
                    card(arr[1],cardOpenStatus[1]);
                    empty();
                    System.out.println("Card3");
                    card(arr[2],cardOpenStatus[2]);
                    empty();
                    System.out.println("Card4");
                    card(arr[3],cardOpenStatus[3]);
                    empty();
                    System.out.println("Card5");
                    card(arr[4],cardOpenStatus[4]);
                    empty();
                    System.out.println("Card6");
                    card(arr[5],cardOpenStatus[5]);
                    empty();
                    if (card2 == arr[1]){
                        System.out.println("Congratulations, you find the different card.");
                        System.out.println("You got "+(6-guesscount)+" points earned");
                        point[round] = 6 - guesscount;
                        break;
                    }else{
                        System.out.println(" Sorry, card 2 does not have different number");
                    }

                }else if (guesscount < 7 && guess == 3) {
                    cardOpenStatus[2] = true;
                    System.out.println("Card1");
                    card(arr[0], cardOpenStatus[0]);
                    empty();
                    System.out.println("Card2");
                    card(arr[1],cardOpenStatus[1]);
                    empty();
                    System.out.println("Card3");
                    card(arr[2],cardOpenStatus[2]);
                    empty();
                    System.out.println("Card4");
                    card(arr[3],cardOpenStatus[3]);
                    empty();
                    System.out.println("Card5");
                    card(arr[4],cardOpenStatus[4]);
                    empty();
                    System.out.println("Card6");
                    card(arr[5],cardOpenStatus[5]);
                    empty();

                    if (card2 == arr[2]){
                        System.out.println("Congratulations, you find the different card.");
                        System.out.println("You got "+(6-guesscount)+" points earned");
                        point[round] = 6 - guesscount;
                        break;
                    }else{
                        System.out.println(" Sorry, card 3 does not have different number");
                    }

                }else if (guesscount < 7 && guess == 4) {
                    cardOpenStatus[3] = true;
                    System.out.println("Card1");
                    card(arr[0],cardOpenStatus[0]);
                    empty();
                    System.out.println("Card2");
                    card(arr[1],cardOpenStatus[1]);
                    empty();
                    System.out.println("Card3");
                    card(arr[2],cardOpenStatus[2]);
                    empty();
                    System.out.println("Card4");
                    card(arr[3],cardOpenStatus[3]);
                    empty();
                    System.out.println("Card5");
                    card(arr[4],cardOpenStatus[4]);
                    empty();
                    System.out.println("Card6");
                    card(arr[5],cardOpenStatus[5]);
                    empty();

                    if (card2 == arr[3]){
                        System.out.println("Congratulations, you find the different card.");
                        System.out.println("You got "+(6-guesscount)+" points earned");
                        point[round] = 6 - guesscount;
                        break;
                    }else{
                        System.out.println(" Sorry, card 4 does not have different number");
                    }
                }else if (guesscount < 7 && guess == 5) {
                    cardOpenStatus[4] = true;
                    System.out.println("Card1");
                    card(arr[0],cardOpenStatus[0]);
                    empty();
                    System.out.println("Card2");
                    card(arr[1],cardOpenStatus[1]);
                    empty();
                    System.out.println("Card3");
                    card(arr[2],cardOpenStatus[2]);
                    empty();
                    System.out.println("Card4");
                    card(arr[3],cardOpenStatus[3]);
                    empty();
                    System.out.println("Card5");
                    card(arr[4],cardOpenStatus[4]);
                    empty();
                    System.out.println("Card6");
                    card(arr[5],cardOpenStatus[5]);
                    empty();

                    if (card2 == arr[4]){
                        System.out.println("Congratulations, you find the different card.");
                        System.out.println("You got "+(6-guesscount)+" points earned");
                        point[round] = 6 - guesscount;
                        break;
                    }else{
                        System.out.println(" Sorry, card 5 does not have different number");
                    }

                }else if (guesscount < 7 && guess == 6) {
                    cardOpenStatus[5] = true;
                    System.out.println("Card1");
                    card(arr[0],cardOpenStatus[0]);
                    empty();
                    System.out.println("Card2");
                    card(arr[1],cardOpenStatus[1]);
                    empty();
                    System.out.println("Card3");
                    card(arr[2],cardOpenStatus[2]);
                    empty();
                    System.out.println("Card4");
                    card(arr[3],cardOpenStatus[3]);
                    empty();
                    System.out.println("Card5");
                    card(arr[4],cardOpenStatus[4]);
                    empty();
                    System.out.println("Card6");
                    card(arr[5],cardOpenStatus[5]);
                    empty();

                    if (card2 == arr[5]){
                        System.out.println("Congratulations, you find the different card.");
                        System.out.println("You got "+(6-guesscount)+" points earned");
                        point[round] = 6 - guesscount;
                        break;
                    }else{
                        System.out.println(" Sorry, card 6 does not have different number");
                    }
                }

                System.out.print("Which card has different number:");
                guess = sc.nextShort();

            }

            round++;


        }



        sc.close();
        double sum = point[0] + point[1] + point[2] + point[3] + point[4] +point[5] + point[6] + point[7] + point[8] + point[9] + point[10] + point[11] + point[12];
        System.out.println("Game is finished.");
        System.out.println(" Total Point "+sum+" ");
        System.out.println("  ROUND#      SCORE");
        System.out.println("  ------      -----");

        String[] names = { "1.Round", "2.Round", "3.Round", "4.Round", "5.Round", "6.Round", "7.Round", "8.Round", "9.Round", "10.Round", "11.Round", "12.Round", "13.Round"};

        System.out.println(" "+names[0]+"     "+point[1]+" ");

        System.out.println(" "+names[1]+"     "+point[2]+" ");

        System.out.println(" "+names[2]+"     "+point[3]+" ");

        System.out.println(" "+names[3]+"     "+point[4]+" ");

        System.out.println(" "+names[4]+"     "+point[5]+" ");

        System.out.println(" "+names[5]+"     "+point[6]+" ");

        System.out.println(" "+names[6]+"     "+point[7]+" ");

        System.out.println(" "+names[7]+"     "+point[8]+" ");

        System.out.println(" "+names[8]+"     "+point[9]+" ");

        System.out.println(" "+names[9]+"     "+point[10]+" ");

        System.out.println(" "+names[10]+"     "+point[11]+" ");

        System.out.println(" "+names[11]+"     "+point[12]+" ");





    }
















    public static int getRandomNumber() {
        //this two area  generate random number
        int number = (int) ( 10*Math.random()) + 1;

        return number;

    }

    public static int getRandomNumber2() {

        int number = (int) ( 6*Math.random()) + 1;

        return number;

    }






    private static void welcome() {
        System.out.println("****Welcome to Number Guess Name****");
        System.out.println("We generate 6 cards. 5 cards have same number. But only one card different number.");
        System.out.println("Your task is finding the card that differs in the least attempts");
        System.out.println("Let's start game.");
    }





    private static void number1(){
        System.out.println("*");
        System.out.println("*");                               //this methods for number's patterns
        System.out.println("*");
        System.out.println("*");  //
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
    }
    private static void number2(){
        System.out.println("*******");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("*******");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*******");
    }

    private static void number3(){
        System.out.println("*******");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("*******");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("*******");
    }


    private static void number4(){
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
    }

    private static void number5(){
        System.out.println("*******");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*******");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("*******");
    }

    private static void number6(){
        System.out.println("*******");
        System.out.println("*      ");
        System.out.println("*      ");
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
    }
    private static void number7(){
        System.out.println("*******");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("      *");
    }
    private static void number8(){
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
    }
    private static void number9(){
        System.out.println("*******");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*******");
        System.out.println("      *");
        System.out.println("      *");
        System.out.println("*******");
    }
    private static void number10(){
        System.out.println("*  *******");
        System.out.println("*  *     *");
        System.out.println("*  *     *");
        System.out.println("*  *     *");
        System.out.println("*  *     *");
        System.out.println("*  *     *");
        System.out.println("*  *******");
    }
    private static void number0(){
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
        System.out.println("*******");
    }


    private static void empty(){
        System.out.println(" ");

    }
    private static void card(int number, boolean open){
        if (!open){
            number0();
        }else{
            if(number == 1){
                number1();
            }else if (number == 2){
                number2();

            }else if (number == 3){
                number3();
            }else if (number == 4){
                number4();                           //In this method, , it converts a random number to a stars.
            }else if (number == 5){
                number5();
            }else if (number == 6){
                number6();
            }else if (number == 7){
                number7();
            }else if (number == 8){                            //
                number8();
            }else if (number == 9){
                number9();
            }else if (number == 10){
                number10();
            }
        }
    }
}