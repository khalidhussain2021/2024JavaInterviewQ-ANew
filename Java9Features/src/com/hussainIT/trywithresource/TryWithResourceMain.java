package com.hussainIT.trywithresource;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TryWithResourceMain {
	public static void main(String[] args) throws IOException {
		FileInputStream fileInputStream=null;
		ObjectInputStream inputStream;
		try {
	    fileInputStream=new FileInputStream(new File("E:\\pixUpgitMergeInfo\\pixupgammingAppServerMergeInfo.txt"));
		inputStream=new ObjectInputStream(fileInputStream);
		while(true) {
			System.err.println(inputStream.readObject());
		}
		}catch(Throwable e) {
			e.printStackTrace();
		}finally {
			if(fileInputStream !=null) {
				fileInputStream.close();
			}
			if(fileInputStream !=null ) {
				fileInputStream.close();
			}
		}
		
		//try with ressoure
		
//		try(FileInputStream fi=new FileInputStream(new File("C:\\Users\\DELL\\Downloads\\SOF"));
//		ObjectInputStream obj=	new ObjectInputStream(fi);
//				) {
//			Object object = obj.readObject();
//			System.out.println(object.toString());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}
}
