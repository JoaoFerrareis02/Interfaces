package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import model.entities.Employee;

public class Program5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Employee> list = new ArrayList<>();
		String path = "C:\\Programacao\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fileds = employeeCsv.split(",");
				list.add(new Employee(fileds[0], Double.parseDouble(fileds[1])));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee s : list) {
				System.out.println(s);
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
