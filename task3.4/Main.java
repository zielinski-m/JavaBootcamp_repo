import java.lang.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        CharacterGenerator generate = new CharacterGenerator("a");
        Deque<String> letterQueue = new ArrayDeque<>();

        for (int i = 0; i < 50; i++) {
            String stringOfLetterA = generate.aLetter.repeat(generate.randGenerator.nextInt( 1,50));
            letterQueue.offer(stringOfLetterA);
        }

        ArrayList<String> arrayTempQueue = new ArrayList<>(letterQueue);

        LetterManager queueManager = new LetterManager();
        queueManager.setEvenLetters(arrayTempQueue);
        System.out.println(queueManager.evenLetters.size());
        System.out.println(queueManager.oddLetters.size());
    }
}