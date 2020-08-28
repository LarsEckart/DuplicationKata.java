package org.learnwithllew.duplicationkata;

import java.util.function.Function;

public class Lesson3HigherOrderFunctions extends Song {

    public void singCheers() {
        applesauce(2, this::getNext, "Who do we appreciate?");
        applesauce(17, this::getNextPrime, "These are the primes, that we find fine!");
    }

    private void applesauce(int start, Function<Integer, Integer> increment, String end) {
        int number = start;
        for (int i = 0; i < 4; i++) {
            sing(number + "! ");
            number = increment.apply(number);
        }
        sing(end);
    }

    private int getNext(int number) {
        return number + 2;
    }

    private int getNextPrime(int number) {
        switch (number) {
            case 13:
                return 17;
            case 17:
                return 19;
            case 19:
                return 23;
            case 23:
                return 29;
        }
        return 0;
    }
}
