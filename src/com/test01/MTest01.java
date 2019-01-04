package com.test01;

import java.nio.file.*;

public class MTest01 {
	public static void main(String[] args) {
		FileSystem fileSystem = FileSystems.getDefault();
		Path path1 = fileSystem.getPath("data/a.txt",args);
		System.out.println(path1);
		
		Path path2 = fileSystem.getPath("data/a", "b", "c", "bar.txt");
		System.out.println(path2);
		
		Path path3 = fileSystem.getPath("data/baz.txt", args);
		System.out.println(path3);
	}
}
