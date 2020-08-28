package org.learnwithllew.duplicationkata;

public class Lesson2Variable extends Song {

    public void singBottlesOfBeer() {
        singBottles(100);
        singBottles(99);
    }

    private void singBottles(int number) {
        sing(number + " bottles of beer on the wall");
        sing(number + " bottles of beer");
        sing("Take one down, pass it around");
        sing((number - 1) + " bottles of beer on the wall");
    }
}
