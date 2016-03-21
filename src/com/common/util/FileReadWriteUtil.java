package com.common.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteUtil {

	public static String execute(String srcPath, String dstPath) {

		String lines = null;
		FileReader reader = null;
		FileWriter writer = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		if (srcPath != null && dstPath != null) {
			try {
				reader = new FileReader(srcPath);
				writer = new FileWriter(new File(dstPath) , true);
				bufferedReader = new BufferedReader(reader);
				bufferedWriter = new BufferedWriter(writer);
				while ((lines = bufferedReader.readLine()) != null) {
					bufferedWriter.write(lines);
					bufferedWriter.newLine();
				}
			} catch (FileNotFoundException e) {
				System.out.println("�ļ�δ�ҵ���");
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("�ļ���ȡ���ִ���");
				e.printStackTrace();
			} finally {
				try {
					bufferedWriter.flush();
					bufferedReader.close();
					bufferedWriter.close();
				} catch (IOException e) {
					System.out.println("�ļ���д�����Դ�رճ��ִ���");
					e.printStackTrace();

				}
			}
			return "��д�����ɹ�ִ����ϣ�";
		}
		return "��д����ִ�г��ִ���";
	}

}
