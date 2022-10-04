import java.util.*;
import java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    final String keywords[] = { "abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "extends", "false",
                "final", "finally", "float", "for", "goto", "if", "implements",
                "import", "instanceof", "int", "interface", "long", "native",
                "new", "null", "package", "private", "protected", "public",
                "return", "short", "static", "strictfp", "super", "switch",
                "synchronized", "this", "throw", "throws", "transient", "true",
                "try", "void", "volatile", "while" };//words

    String random_word = keywords[(int) (Math.random() * keywords.length)];   
    // System.out.println(random_word);

    String display_word = "";

    List<Character> guessList = new ArrayList<Character>();

    int chancesLeft = 5;

    Scanner sc = new Scanner(System.in);
    char guess;

    while (chancesLeft > 0){
        boolean win = true;
        display_word = "";
        for(int i = 0; i < random_word.length(); i++){
            if (guessList.contains(random_word.charAt(i))){
                display_word += random_word.charAt(i) + " ";
            } else {
                display_word += "_ ";
                win = false;
            }
        }

        

        // if (display_word.replaceAll("\\s", "") == random_word){
        //     System.out.println("YOU WIN");
        //     break;
        // }

        System.out.println(display_word);
        if (win){
            System.out.println("YOU WIN 😁");
            break;
        }
        System.out.println(String.format("Chances Left : %d",chancesLeft));
        System.out.print("What's your guess : ");
        guess = sc.next().charAt(0);
        guessList.add(guess);

        if (!random_word.contains(String.valueOf(guess))){
            chancesLeft --;
        }

    }
    if (chancesLeft == 0){
        System.out.println("You lost 😑");
        System.out.println(String.format("You had to guess '%s'",random_word));
    }

  }
}


// random_word = "dog"
// display_word
// chances
// array_list

