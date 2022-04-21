package com.ExponentialSearch;

public class Main {

    public static void main(String[] args) {
       int[] numbers = {1,3,5,7,9};
       var expoSearch = new ExponentialSearch();
       var number = expoSearch.ExponentialSearch(numbers,9);
       System.out.println(number);
    }
}
