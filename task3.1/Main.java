import java.util.*;
public class Main {
    public static void main(String[] args) {
        Books firstBook = new Books("First Book ", "First Author", 1890);
        Books secondBook = new Books("Second Book", "Second Author", 2010);
        Books thirdBook = new Books("Third Book", "Third Author", 2012);
        Books fourthBook = new Books("Fourth Book", "Fourth Author", 2010);
        Books fifthBook = new Books("Fifth Book", "Fifth Author", 2009);
        Books sixthBook = new Books("Sixth Book", "Sixth Author", 1998);

        Set<Books> booksSet = new HashSet<>();
        booksSet.add(firstBook);
        booksSet.add(secondBook);
        booksSet.add(thirdBook);
        booksSet.add(fourthBook);
        booksSet.add(fifthBook);
        booksSet.add(sixthBook);

        for (Books book: booksSet) {
            if(book.pubDate < 2010) {
                System.out.println(book.title);
            }
        }
    }
}

