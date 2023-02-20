import java.util.*;
class LetterManager {
    List<String> evenLetters;
    List<String> oddLetters;

    public LetterManager() {
        evenLetters = new ArrayList<>();
        oddLetters = new ArrayList<>();
    }
    public void setEvenLetters(ArrayList<String> tempQueue) {
        int tempValue = 0;
        for (int i = 0; i < tempQueue.size(); i++) {

            tempValue = tempQueue.get(i).length();

            if (tempValue % 2 == 0) {
                evenLetters.add(tempQueue.get(i));
            } else {
                oddLetters.add(tempQueue.get(i));
            }
        }
    }
}

