package com.class29;

public class FileTest {

	public static void main(String[] args) {
		File f = new JavaFile();
		f.close();
		f.edit();
		f.open();
		File f1 = new WordFile();
		f1.close();
		f1.edit();
		f1.open();
		File f2 = new PDFFile();
		f2.close();
		f2.edit();
		f2.open();

	}

}
