package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Problem 1: Count the number of characters in the string
        char charOne = 'h';
        String stringOne = "holla,pohler,shame,pair,cash,heather";
        System.out.println("Expected: 6, My Output: "+ getNumCharsInString(charOne, stringOne));

        char charTwo = 'a';
        String stringTwo = "holla,pohler,shame,pair,cash,heather";
        System.out.println("Expected: 5, My Output: "+ getNumCharsInString(charTwo, stringTwo));

        // Problem 2: Find the Shortest word in a list of words
        ArrayList<String> list = new ArrayList<String>();
        list.add("Heather");
        list.add("Ellie");
        list.add("Dan");
        list.add("Terence");
        list.add("Marsha");
        System.out.println("Expected: Dan, My Output: "+ findShortestWord(list));

        ArrayList<String> listTwo = new ArrayList<String>();
        list.add("Heather");
        list.add("Tom");
        list.add("Ellie");
        list.add("Dan");
        list.add("Terence");
        list.add("Marsha");
        System.out.println("Expected: Tom, My Output: "+ findShortestWord(listTwo));


        // Problem 3/4: Find min/max in an array
        int[] myNumbers = {12, 25, 6, 46, 4, 20};
        System.out.println("Expected: 46, output: "+findMaxNumber(myNumbers));
        System.out.println("Expected: 4, output: "+findMinNumber(myNumbers));

        ArrayList<PageCollection> pageCollections = new ArrayList<PageCollection>();
        pageCollections.add(new Book(1200, "The Stand", "Stephen King"));
        pageCollections.add(new Book(500, "The Art of War", "Sun Tzu"));
        pageCollections.add(new Book(250, "1984", "George Orwell"));
        pageCollections.add(new Article(2, "Who's going to win the Superbowl: 2020", NewsSource.ESPN));
        pageCollections.add(new Article(1, "Best Steak You've ever had", NewsSource.FOOD_NETWORK));

        // Problem 5
        System.out.println("Expected: 3, output: "+ findNumberOfBooks(pageCollections));
        System.out.println("Expected: 2, output: "+ findNumberOfArticles(pageCollections));

        // find all the books in the list
        List<Book> books = findAllBooks(pageCollections);
        String bookTitles = "";
        for (int i = 0; i < books.size(); i++) {
            bookTitles += books.get(i).getTitle()+"|";
        }
        System.out.println("Expected: The Stand|The Art of War|1984|, output: "+bookTitles);

        // find the shortest book (by page length) in the list
        Book shortestBook = findShortestBook(pageCollections);
        System.out.println("Expected: 1984, My Output: " + shortestBook.getTitle());
        System.out.println("Expected: author, My Output: " + shortestBook.getAuthor());

        // find articles by newsSource
        List<Article> espnArticles = findAllArticlesBySource(NewsSource.ESPN, pageCollections);
        System.out.println("--ESPN Article list size-- Expected = 1, output = "+espnArticles.size());

        List<Article> foxNewsArticles = findAllArticlesBySource(NewsSource.FOX, pageCollections);
        System.out.println("--Fox News Article list size-- Expected = 0, output = "+espnArticles.size());

    }

    static int getNumCharsInString(char charToSearchFor, String string) {
        // count the number of characters charToSearchFor in the string string
        int charCount = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == charToSearchFor) {
                charCount++;
            }
        }
        return charCount;
    }

    // should return a non-null string of the shortest word. If you find multiple words that are the same length
    // you should return the first occurence of it
    static String findShortestWord(List<String> listOfWords) {
        String shortestWord = listOfWords.get(0);
        for (int i = 0; i < listOfWords.size(); i++) {
            if (listOfWords.size() >= 0 && listOfWords.get(i).length() < shortestWord.length()) {
                shortestWord = listOfWords.get(i);
            }
        }
        return shortestWord;
    }

    static int findMaxNumber(int[] numbers) {
        return -1;
    }

    static int findMinNumber(int[] numbers) {
        return -1;
    }

    static int findNumberOfBooks(List<PageCollection> collection) {
        return -1;
    }

    static int findNumberOfArticles(List<PageCollection> collection) {
        return -1;
    }

    static List<Book> findAllBooks(List<PageCollection> collection) {
        return new ArrayList<Book>();
    }

    static Book findShortestBook(List<PageCollection> collection) {
        return new Book(0, "Empty", "");
    }

    static List<Article> findAllArticlesBySource(NewsSource source, List<PageCollection> collection) {
        return new ArrayList<Article>();
    }
}
