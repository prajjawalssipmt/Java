import java.util.Scanner;

class GuessingGame {
    int random;

    GuessingGame(){
        random = (int)Math.ceil(Math.random()*100);
    }

    int guess(int guessNum){
        return guessNum=random;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GuessingGame game=new GuessingGame();
        System.out.println("Welcome to the guessing game");
        int guess,result;
        do {
            System.out.print("Guess the number : ");
            guess = input.nextInt();
            result = game.guess(guess);
            if (result==0){
                System.out.println("Correct guess");
            }else if (result<0){
                System.out.println("guess positive number");
            }else {
                System.out.println("guess lower number");
            }
        }while (result!=0);
    }

}
