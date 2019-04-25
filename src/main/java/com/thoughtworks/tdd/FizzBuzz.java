package com.thoughtworks.tdd;

public class FizzBuzz {
    public String result="";

    public String getFizzBuzz(int i) {
        if (i%3 == 0)
            result += "Fizz";
        if (i%5 == 0)
            result += "Buzz";
        if (i%7 == 0)
            result += "Whizz";
        if (result == "")
            result += i;
        return result;
    }
}
