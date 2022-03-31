package com.example.slutprojekt.model;

import org.springframework.core.io.ClassPathResource;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVService {

    public String readFile(String fileName ) throws FileNotFoundException, IOException {

		ArrayList<OrderBean> orderbeans = new ArrayList();

		var csvFile = new ClassPathResource(fileName);
	
		try (Scanner myScanner = new Scanner(csvFile.getFile())) {
			boolean firstLine = true;
			while(myScanner.hasNextLine()) {
				
				//Skip the first line
				if(firstLine) {
					myScanner.nextLine();
					firstLine= false;
				} else {

					OrderBean ob = createBean(myScanner.nextLine());
					orderbeans.add(ob);
				}			
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String returnJSON =  "{\"Orders\": [";

		for (int i = 0; i<orderbeans.size(); i ++ ) {
			//String.format("Hello! My name is %s, I'm %s.", name, age); 
			String beanAsJSON = String.format("{\"OrderDate\" : \"%s\",\"Region\" : \"%s\",\"Rep1\" : \"%s\",\"Rep2\" : \"%s\",\"Item\" : \"%s\",\"Units\" : \"%s\",\"UnitCost\" : \"%s\",\"Total\" : \"%s\"}",
			orderbeans.get(i).getOrderDate(),
			orderbeans.get(i).getRegion(),
			orderbeans.get(i).getRep1(),
			orderbeans.get(i).getRep2(),
			orderbeans.get(i).getItem(),
			orderbeans.get(i).getUnits(),
			orderbeans.get(i).getUnitCost(),
			orderbeans.get(i).getTotal());
			System.out.println(beanAsJSON);
			
			//If last bean, dont add the ","
			if(i!=orderbeans.size()-1) {
				returnJSON += beanAsJSON + ","; 
			} else {
				returnJSON += beanAsJSON;
			}
		}
		returnJSON += "]}";
		return returnJSON;
	}
	
	
	public OrderBean createBean (String line) {
		OrderBean ob = new OrderBean();
		String [] columns = line.split(",");
		
		ob.setOrderDate(columns[0]);
		ob.setRegion(columns[1]);
		ob.setRep1(columns[2]);
		ob.setRep2(columns[3]);
		ob.setItem(columns[4]);
		ob.setUnits(columns[5]);
		ob.setUnitCost(columns[6]);
		ob.setTotal(columns[7]);
		return ob;
		
	}
}
