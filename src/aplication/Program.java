package aplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Program {

	public static void main(String[] args) {
		
		
		List<String>list = new ArrayList<>();

		String path = "c:\\temp\\in.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String name = br.readLine();
			while(name != null) {
				list.add(name);
				name = br.readLine();	
			}
			
			Collections.sort(list);
			for(String s: list) {
				System.out.println(s);
			}
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
