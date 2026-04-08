//    Week - 1
---------
=================================
Question no. 1
================================= 
// Display Batch Meaning

1. Write a Java program that reads a batch name from the user 
   and displays the expanded meaning of each character in the batch code.

Rules:

The batch name must contain 3 characters.

The first character must be S.

If it is not S, print "Invalid input" and stop the program.

The second character must be one of B, U, or N.

If any other character appears, print "Invalid char ..." and stop the program.

The third character must be a digit between 1 and 6.

If it is outside this range, print "Invalid digit ..." and stop the program.

Display Meaning:
Character	Meaning
S	SKILL
B	BRIDGE
U	UP
N	NEXT
1–6	Display the number in words (ONE, TWO, THREE, FOUR, FIVE, SIX)
Example Input
Enter batch name :
SB3
Example Output
SKILL BRIDGE THREE
Example Input
Enter batch name :
SA3
Example Output
Invalid char ...
Example Input
Enter batch name :
SN7
Example Output
Invalid digit ...

=========================================
Question no. 2
=========================================
// Student Roll Number Analysis
Write a Java program that reads a 10-digit student roll number and displays the type of admission and the branch name.

Roll Number Format

A student roll number follows this structure:

YYCCXAABBB

Where:

YY → Admission year (first two digits)

CC → College code

XA → Admission type code

AB → Branch code

BB → Student number

Your program should extract the admission type and branch code from the roll number and display their meanings.

Admission Type Codes
Code	Admission Type
1A	Regular B.Tech
5A	Lateral B.Tech
Branch Codes
Code	Branch
01	CIVIL
02	EEE
03	MECH
04	ECE
05	CSE
12	IT
21	AERO
33	CSIT
62	CSE(CS)
66	CSE(AI&ML)
67	CSE(DS)
Example 1

Input

24951A0527

Output

Regular B.Tech CSE
Example 2

Input

24955A0427

Output

Lateral B.Tech ECE
Requirement

Your program should:

Read a roll number from the user.

Extract the admission type code.

Extract the branch code.

Display the admission type followed by the branch name.
========================================================
Question no. 3
========================================================
//Number Guessing Game in Java

A number-guessing game in Java is a simple program where the computer 
randomly selects a number, and the user has to guess it within a limited number of attempts. The program provides feedback on whether the guessed number is too high or too low, guiding the user toward the correct answer.



Rules of the Game:

If the guessed number is bigger than the actual number, the program will respond with the message that the guessed number is higher than the actual number.
If the guessed number is smaller than the actual number, the program will respond with the message that the guessed number is lower than the actual number.
If the guessed number is equal to the actual number or if the K trials are exhausted, the program will end with a suitable message.

Implementation Details

The program generates a random number between a predefined range (e.g., 1 to 100).
The user has limited attempts (K tries) to guess the number.
At each guess, the program provides a hint:
If the guessed number is higher, it tells the user to guess lower.
If the guessed number is lower, it tells the user to guess higher.
If the user guesses correctly, they win.
If all attempts are exhausted, the game reveals the correct number.

Approach:

To implement the game, we need to follow the steps listed below:

Generate a random number using the Math.random() method.
Take user input using Scanner.
Compare the guess with the random number and provide feedback.
Limit the number of attempts using a loop.
Handle edge cases (e.g., invalid inputs).