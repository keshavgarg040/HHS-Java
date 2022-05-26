package chapter13Programs;

import javax.swing.*;
import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class QuizUsingFile {
    public static void main(String[] args) {
	Path file = Paths.get("C:\\Java\\Chapter.13\\Scores.txt");
	InputStream input = null;
	String s = "0";
	String[] questions = {};

	char[] answers = { 'A', 'B', 'A', 'C', 'A', 'A', 'C', 'A', 'B', 'C' };
	char ans = ' ';
	int x, correct = 0;
	int previousCorrect = 0;
	String entry;
	boolean isGood;
	try {
	    input = Files.newInputStream(file);
	    BufferedReader reader = new BufferedReader(new InputStreamReader(input));
	    s = reader.readLine();
	    System.out.println(s);
	    input.close();
	} catch (IOException e) {
	    System.out.println(e);
	}
	int score = Integer.parseInt(s);
	previousCorrect = score;
	JOptionPane.showMessageDialog(null, "The previous high score is " + score);
	for (x = 0; x < questions.length; ++x) {
	    isGood = false;
	    int firstError = 0;
	    while (!isGood) {
		isGood = true;
		entry = JOptionPane.showInputDialog(null, questions[x]);
		ans = entry.charAt(0);
		if (ans != 'A' && ans != 'B' && ans != 'C') {
		    isGood = false;
		    if (firstError == 0) {
			questions[x] = questions[x] + "\nYour answer must be A, B or C.";
			firstError = 1;
		    }
		}
	    }
	    if (ans == answers[x]) {
		++correct;
		JOptionPane.showMessageDialog(null, "Correct!");
	    } else
		JOptionPane.showMessageDialog(null, "The correct answer is " + answers[x]);
	}
	JOptionPane.showMessageDialog(null,
		"You got " + correct + " right and\n" + (questions.length - correct) + " wrong");
	if (correct > previousCorrect)
	    s = "" + correct;
	else
	    s = "" + previousCorrect;
	byte data[] = s.getBytes();
	OutputStream output = null;
	try {
	    output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
	    output.write(data);
	    output.flush();
	    output.close();
	} catch (Exception e) {
	    System.out.println("Message: " + e);
	}
    }

}