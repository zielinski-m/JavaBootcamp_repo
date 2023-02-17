import java.util.*;
import java.lang.*;
import java.time.*;
import java.io.*;


class Book {
    String title;
    String author;
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String UnkYear() {
        return String.valueOf(year);
    }

    @Override
    public String toString() {
        return "Title: \"" + title + "Author: " + author +  " (" + year + ")";
    }
}

class LendTo {

    Book book;
    String fullName;
    int libraryCardNum;

    public LendTo(Book book, String fullName, int libraryCardNum) {
        this.book = book;
        this.fullName = fullName;
        this.libraryCardNum = libraryCardNum;
    }

    public Book getBook() {
        return book;
    }

    public String getFullName() {
        return fullName;
    }

    public int getLibraryCardNum() {
        return libraryCardNum;
    }

    @Override
    public String toString() {
        return book + " - lent to: " + fullName + "(" + libraryCardNum + ")";
    }
}

class LibraryLendApp {
    public static void main(String[] args) {

        Book theBook1 = new Book("The Sound of the Mountain", "Yasunari Kawabata", 1954);
        Book theBook2 = new Book("Wuthering Heights", "Emily Brontë", 1847);
        Book theBook3 = new Book("Molloy, Malone Dies, The Unnamable, the trilogy",
                               "Samuel Beckett", 1951);
        Book theBook4 = new Book("The Old Man and the Sea", "Ernest Hemingway", 1952);
        Book theBook5 = new Book("Stories", "Anton Chekhov", 1888);

        LendTo lendNum1 = new LendTo(theBook1,"Austin Warren", 14662);
        LendTo lendNum2 = new LendTo(theBook2, "Brodie Holder", 14738);
        LendTo lendNum3 = new LendTo(theBook4, "Byron Wall", 68023);
        LendTo lendNum4 = new LendTo(theBook3, "Jovanni Hood", 17563);
        LendTo lendNum5 = new LendTo(theBook5, "Kamryn Moody", 92704);
        LendTo lendNum6 = new LendTo(theBook1, "Zyaire Herring", 84003);
        LendTo lendNum7 = new LendTo(theBook3, "Lochlan Hoover", 28119);


        Deque<LendTo> lentBooks = new ArrayDeque<>();

        lentBooks.offer(lendNum1);
        lentBooks.offer(lendNum2);
        lentBooks.offer(lendNum3);
        lentBooks.offer(lendNum4);
        lentBooks.offer(lendNum5);
        lentBooks.offer(lendNum6);
        lentBooks.offer(lendNum7);


        System.out.println("Queue size is: " + lentBooks.size() + "\n");


        LendTo tempVar = null;


        while(lentBooks.size() > 0) {
            LendTo var = lentBooks.poll();
            tempVar = var;
        }

        System.out.println("Checking queue, It's size is: " + lentBooks.size());
        System.out.println(" Last item taken from the queue was: " + tempVar);
    }
}