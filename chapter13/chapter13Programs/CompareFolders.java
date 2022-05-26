package chapter13Programs;

import java.nio.file.*;

import javax.swing.JOptionPane;

import java.io.IOException;

public class CompareFolders {
    public static void main(String[] args) {
	Path helloTextFile = Paths.get("C:\\Java\\Chapter13\\hello.txt");
	Path testJavaFile = Paths.get("C:\\Java\\Chapter13\\test.java");
	Path essayFile = Paths.get("C:\\Java\\Chapter13\\essay.docx");
	try {
	    helloTextFile.getFileSystem().provider().checkAccess(helloTextFile);
	    testJavaFile.getFileSystem().provider().checkAccess(testJavaFile);
	    essayFile.getFileSystem().provider().checkAccess(essayFile);
	    JOptionPane.showMessageDialog(null,
		    helloTextFile.toString() + "\nThe flies are located in the same directory");
	} catch (IOException ex) {
	    JOptionPane.showMessageDialog(null,
		    helloTextFile.toString() + "\nNot all files are present in the directory");
	}
    }
}
