package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
@Test
    public void should_return_Fizz_when_number_is_multiple_of_3(){
    assertEquals(fizzBuzz.getFizzBuzz(3),"Fizz");
}
@Test
    public void should_return_Buzz_when_number_is_multiple_of_5(){
    assertEquals(fizzBuzz.getFizzBuzz(5), "Buzz");
}
@Test
    public void should_return_Whizz_when_number_is_multiple_of_7(){
    assertEquals(fizzBuzz.getFizzBuzz(7), "Whizz");
}
@Test
    public void should_return_FizzBuzz_when_number_is_multiple_of_3_and_5(){
    assertEquals(fizzBuzz.getFizzBuzz(30), "FizzBuzz");
}
@Test
    public void should_return_FizzWhizz_when_number_is_multiple_of_3_and_7(){
    assertEquals(fizzBuzz.getFizzBuzz(42), "FizzWhizz");
}
    @Test
    public void should_return_BuzzWhizz_when_number_is_multiple_of_5_and_7(){
        assertEquals(fizzBuzz.getFizzBuzz(70), "BuzzWhizz");
    }

}
