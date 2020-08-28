package org.learnwithllew.duplicationkata;

public class Lesson1Straight extends Song
{
  public void singCatSong()
  {
    chorus("We gave the cat to a little kid");
    chorus("We sent the cat out on a boat");
  }

  private void chorus(String s) {
    sing(s);
    sing("But the cat came back");
    sing("The very next day");
    sing("Oh the cat came back");
    sing("We thought he was a goner");
    sing("But the cat came back, he just wouldn't go away");
  }
}
