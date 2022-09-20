package com.chainsys.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assignment implements Serializable{
	static File myfile = new File("D:\\temp\\sample.txt");
	static File destFileName = new File("D:\\temp\\Firstfile.txt");
	static File curfile = destFileName;

	public static void createfile() {
		try {
			if (myfile.createNewFile())
				System.out.println("file created successfully!!!");
			else
				System.out.println("Already existing!!!");
		} catch (IOException e) {
			System.out.println("Error in create : " + e.getMessage());

		}
	}

	public static void renamefile() {
		try {
			if (myfile.renameTo(destFileName))
				System.out.println("file Renamed successfully!!!");
			else
				System.out.println("Can Not Rename!!!");
		} catch (Exception e) {
			System.out.println("Error in Rename: " + e.getMessage());
		}

	}

	public static void appendDataToFile() {
		try {
			System.out.println("Before Appending");
			readDatafromFile();
			FileWriter fw1 = new FileWriter(curfile, true);
			if (fw1 != null) {
				String textToAppend = "addind data to file hello world";

				/*
				 * System.out.println(" enter text to append:"); java.util.Scanner sc = new
				 * java.util.Scanner(System.in); textToAppend = sc.nextLine(); sc.close();
				 */
				fw1.write(textToAppend);
				fw1.close();
				System.out.println();
				System.out.println("Append successfully");
				System.out.println("after appending");
				readDatafromFile();
			}

		} catch (Exception e) {
			System.out.println("Error in Rename: " + e.getMessage());

		}
	}

	public static void modifyDataInFile() {

		try {
			FileOutputStream fos = new FileOutputStream("D:\\temp\\Firstfile.txt");

			String modify = "modify the data";
			byte[] b = modify.getBytes();
			fos.write(b);
			fos.close();
			System.out.println("Modified Successfully !!!");

			FileInputStream fis = new FileInputStream("D:\\temp\\Firstfile.txt");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("error in modify data :" + e.getMessage());
		}
	}

	public static void readDatafromFile() {
		try {
			FileReader fr = new FileReader(curfile);
			int i;
			while ((i = fr.read()) != -1)
				System.out.print((char) i);
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void deleteFile() {

		File newfile = new File("D:\\temp\\shan.txt");
		try {
			if (newfile.exists()) {
				if (newfile.delete()) {
					System.out.println("File deleted successfully");
				} else {
					System.out.println("Failed to delete the file");
				}
			} else
				System.out.println("file not exist");
		} catch (Exception e) {
			System.out.println("error in delete: " + e.getMessage());
		}
	}

	public static void moveFile() {

		String str = "D:\\temp\\sample1.txt";
		String str1 = "D:\\temp\\sammove.txt";

		try {
			Path p = Files.move(Paths.get(str), Paths.get(str1));
			if (p != null) {
				System.out.println("File moved successfully");
			}
		}

		catch (IOException e) {
			System.out.println("error in move:" + e.getMessage());

		}
		File mf = new File("D:\\temp\\sample1.txt");
		try {
			mf.createNewFile();
		} catch (IOException e) {
			System.out.println(e.getMessage());
			;
		}
	}

	public static void copyFile() {

		try {
			File f = new File("D:\\temp\\samplesource.txt");
			File copyFile = new File("D:\\temp\\sampledestination.txt");
			Files.copy(f.toPath(), copyFile.toPath());
			System.out.println("copied file");
		} catch (Exception e) {
			System.out.println("error in copy: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		// createfile();
		// renamefile();
		// modifyDataInFile();
		// appendDataToFile();
		// deleteFile();
		// readDatafromFile();
		// copyFile();
		moveFile();

	}
}
