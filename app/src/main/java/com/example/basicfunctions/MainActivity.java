package com.example.basicfunctions;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> fillit = new ArrayList<>();
        fillit.add("candy");
        fillit.add("chicken");
        fillit.add("shrimp");
        fillit.add("candy");
        fillit.add("pizza");
        fillit.add("burger");
        fillit.add("pizza");
        fillit.add("onion");
        fillit.add("taco");
        fillit.add("onion");

    }

    class Duplicates {

        void FindDuplicates(List<String> food) {
            for(int i=0; i<(food.size()); i++) {
                for (int c=i+1; c<food.size(); c++) {
                    if(food.get(i)==food.get(c))
                        System.out.println(food.get(i));
                }

            }
        }
    }

//Create function to see if string is a palindrome w/o using string.reverse method

    public boolean checkPalindrome(String word) {


        for (int i = 0; i < word.length(); i++) {

            char start = word.charAt(i);
            char end = word.charAt(word.length() - 1 - i);

            if (start == end) {
                return true;
            }

        }
                return false;
    }
}
//fizzBuzz
class fizzBuzz {
    public static String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        } else if ((number % 3 == 0) && (number % 5 == 0)) {
            return "fizzBuzz";
        }

    return "";
    }


    //Create functions to see if 2 strings are anagrams
    public boolean Anagram(String word1, String word2) {
        char[] charFromWord1 = word1.toCharArray();
        char[] charFromWord2 = word2.toCharArray();
        Arrays.sort(charFromWord1);
        Arrays.sort(charFromWord2);

        return Arrays.equals(charFromWord1, charFromWord2);
    }

    //Print multiplication table from 1 to 10 using multidimensional array
    public class Table {
        public void main(String args[]) {
            System.out.print("table\n");
            for (int i = 1; i <= 10; i++) {
                for (int c = 1; c <= 10; c++) {
                    System.out.print(i * c + "\t");
                }
                System.out.println();

            }
        }
    }
}