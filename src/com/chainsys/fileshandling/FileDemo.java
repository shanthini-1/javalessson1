package com.chainsys.fileshandling;

import java.io.File;

public class FileDemo{
	String filepath = "D:\\shan\\demoAB.txt";
	try {
	File fileA = new File(filepath);
	}catch(Exception e){
		System.out.println("Not create");
	}
}

