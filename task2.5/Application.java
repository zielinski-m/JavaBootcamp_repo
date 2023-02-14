import java.util.*;

public class Application {

    public static void main(String[] args) {

        LinkedList<Books> theList = new LinkedList<>();

        theList.add(new Books("Quo Vadis", 1895));
        theList.add(new Books("Kabalista", 2023));
        theList.add(new Books("Dziewiec", 1999));
        theList.add(new Books("Opowiadania uliczne", 2001));

        for (Books book: theList) {
            if(book.year > 2000) {
                System.out.println(book.name + " " +  book.year);
            }
        }
    }
}
