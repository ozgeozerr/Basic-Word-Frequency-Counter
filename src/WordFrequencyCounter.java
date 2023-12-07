import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

 public class WordFrequencyCounter {
     public static void main(String[]args){

         Scanner scanner = new Scanner(System.in);

         System.out.println("Welcome to Word Frequency Counter. Please enter a sentence: ");

         String sentence = scanner.nextLine();

         //now, I will create a Hashmap to store the word frequencies

         Map<String,Integer> wordfreqmap = new HashMap<>();

         //now to seperate the words, I will use the split method

         String[] words = sentence.split("\\s+");

         //counting part for the frequency

         for(String word : words){

             String lowercaseWord = word.toLowerCase();

             //is it already in the map?
             if (wordfreqmap.containsKey(lowercaseWord)) {

                 //yes
                 wordfreqmap.put(lowercaseWord, wordfreqmap.get(lowercaseWord) + 1);
             } else {
                 //no
                 wordfreqmap.put(lowercaseWord,1);

             }


         }

         //now let's print the frequencies

         System.out.println("Word Frequences: ");

         System.out.println(wordfreqmap.entrySet());

         System.out.println("I used HashMap.");













}





















    }




