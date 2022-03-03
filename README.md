# HangMan Projet - This project was a in class project done at Christopher Newport University 


For your third programming assignment, you will modify your Hangman
 program to read words from a file, use an ArrayList instead of an
 array to store the words, and use an enum to draw the Stick Figure.

 You should have the following classes:
 * Hang.java: This is similar to Hang.java from Program 2, but asks
 the user for a file name and no longer asks for the maximum number of
 turns (because that is determined by the `enum Parts`. I have
 provided this file. Do not change it.
 * Parts.java This file defines the enum that you will use to draw
 your stick figure. It has both the values associated with each missed
 letter as well as methods to move down the list as the user enters
 incorrect letters. I have provided this file. Do not change it.
 * StickDraw.java This file is completely new. It should have have one
   private instance variable that is the figure to be drawn of type
   `Parts`. You must use the values in this instance variable to determine how many body parts to draw in your stick figure. The javadoc for this class is here: [StickDraw
   API](https://www.pcs.cnu.edu/~lambert/Hang/StickDraw.html)
 * HangWord.java: This file should have mostly the same
     functionality as HangWord with the following differences:
	 * You should read in words from a file.
	 * You should have an ArrayList of words, not an array
	 * You should draw a figure as demonstrated in class whenever the
       user misses a letter. The figure is also what determines when
       the player loses (if the whole figure is drawn, then the player has lost. Otherwise, they have not lost).

## Details about the code
**No method in HangWord.java should be static, and all
constructors and methods in all classes
 should be  15 lines long or fewer** (this
includes "{"s on separate lines). That means that you may need to
write some additional methods that are called from the methods
necessitated by `Hang.java` to ensure that each method is short and coherent.

I have provided my un-javadoc-ed HangWordForProject2.java. You can use
this as a basis if you would like it.

As you write each method, write javadoc with @param and @return tags
as appropriate. *In addition, write in the javadoc how you tested each
method.*

## Partners

You may choose to have a programming partner or not.
If you do, I recommend that you choose one repo as the working repository.

Do your pushes to that repository only.

If you and partner agree to work together, then one of you Email me your partners name
 and be sure to cc your partner on the email.

Each time you work on the program,
*git pull* it from that repository, then *git push* your changes when you
are done.  Your partner should then *git pull*, edit, *git push*, and the cycle repeats.
You must work together and coordinate your pushes and pulls.

Partners should show a comparable amount of git commits with meaningful comments.

One partner should maintain the repo and should add the other
partner as a "developer" under this project (*not the group*)!

## Suggestions
Carefully workout the logic design first.

As you write each method, use the debugger or System.out.println
statements to make sure that your code is working as
you want it to be. Do NOT try to write the entire class at once.
Test your methods individually as you would if you had junit tests.
Document how you tested each method in your javadoc, and write
in your commit messages which methods you have tested.
**Push your changes at the end of every session.**

## Progress

You should make significant progress on the project early on.
10 points of the program will be consistent, significant pushes.

**Do not change the code that is given.**


## Sample Run
This version of Hangman is slightly different. It asks the user to
play again at the end of each game. The rest of the play should be the
same as P1.
Here is a link to sample game output to get an idea of how your
program should behave:
[Sample Game](https://www.pcs.cnu.edu/~lambert/Hang/P3SampleRun.txt)

You may include the answer as part of your testing output or not.
Your output does not have to match mine, but should be descriptive.

## Alternative Assignment
You may, if you prefer, create a Graphical User Interface for this
program. I did this using JOptionPanes. It is more complicated than
the text-only version. For this version, I created screenshots of the
StickDraw figures, and did not use that class. I also modified
Hang.java and HangWord.java, adding, deleting and modifying the text
version methods. I recommend that if you want to do this, you write
the text version first, and do this if there is time.

## Due Date

All code is due on gitlab by Thursday *November 11 at 11:59pm*.

All submissions are to GitLab.

I will clone your repository and manually grade your program.

## Rubric  (100 points total)

 * Correct output (50 points) Except possible changes in prompts, your
   output matches the sample run. Programs that do not compile will
   receive 0 points for this portion.
 * Javadoc        ( 15 points ) Each method has a description of what
   it does, appropriate tags and descriptions (@param and @return),
   and a description of what you did to test the program
 * Code Quality ( 25 points instructor review) No method has more than
   15 lines; the methods call other methods to avoid repetition. The
   code uses good Java style and good programming practices (e.g., no
   magic numbers). The program correctly uses ArrayLists, files and enums.
 * Git usage    ( 10 points - reasonable git log, with both partners committing)
