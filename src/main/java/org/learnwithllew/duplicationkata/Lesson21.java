package org.learnwithllew.duplicationkata;

import java.util.function.Predicate;

public class Lesson21 extends Song {

  public void singSong(int style, String... names) {
    switch (style) {
      case 1:
        applesauce(names, n -> n.startsWith("L", 0));
        break;
      case 2:
        applesauce2(names, n -> n.startsWith("am", 1));
        break;
      case 3:
        applesauce3(names, n -> false);
        break;
    }
  }

  private void applesauce3(String[] names, Predicate<String> isSPecial) {
    for (String name : names) {
      if (isSPecial.test(name)) {

      } else {
        sing("Hello " + name + ", it's nice to meet you.");
      }
    }
  }

  private void applesauce2(String[] names, Predicate<String> isSpecial) {
    for (String name : names) {
      applesauce4(isSpecial, name, "Say yeah! Say yo! Say " + name, "Hello " + name + ", it's nice to meet you.");
    }
  }

  private void applesauce(String[] names, Predicate<String> isSpecial) {
    for (String name : names) {
      applesauce4(isSpecial, name, "Hip Hip Horray! For " + name, "Hello " + name + ", it's nice to meet you.");
    }
  }

  private void applesauce4(Predicate<String> isSpecial, String name, String line, String other) {
    if (isSpecial.test(name)) {
      sing(line);
    } else {
      sing(other);
    }
  }
}
