package com.test01;

import java.io.*;
import java.nio.file.*;

public class MTest02 {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Test\\javaTest.txt");
		System.out.printf("Root\t:%s\n", path.getRoot());
		System.out.printf("Root\t:%s\n", path.getParent());

		for (int i = 0; i < path.getNameCount(); i++) {
			System.out.printf("getNameCount %d : %s \n", i, path.getName(i));
		}

		System.out.printf("subpath : %s \n", path.subpath(0, path.getNameCount()));
		System.out.println();

		try {
			Path real_path = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
			System.out.println(real_path);

			File path_to_file = path.toFile();
			Path file_to_path = path_to_file.toPath();
			System.out.printf("Path to file name : %s \n", path_to_file.getName());
			System.out.printf("File to path\t:%s \n", file_to_path.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
