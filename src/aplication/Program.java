package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

class Program {

	public static void main(String[] args) {
		
		
		List<Employee>employee = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String employeeCsv = br.readLine();
			while(employeeCsv != null) {
				String [] fields = employeeCsv.split(",");
				employee.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();	
			}
			
			Collections.sort(employee);
			for(Employee emp: employee) {
				System.out.println(emp.getName()+", "+ emp.getSalary());
			}
			
			
		} catch (IOException e) {
			System.out.println("erro"+ e.getMessage());
			e.printStackTrace();
		}
		
	}

}
