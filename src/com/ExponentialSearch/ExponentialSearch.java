package com.ExponentialSearch;

public class ExponentialSearch {
    public int ExponentialSearch(int[] array,int number){
        var bound = 1;
        if(array.length == 0)
            return -1;
        while(bound < array.length && array[bound] < number){
            bound *= 2;
            }

        if(bound >= array.length) {
            bound = array.length - 1;
        }
        for(var i = bound/2;i <= bound ; i++){
            if(array[i] == number)
                return i;
        }
        return -1;
    }
}
