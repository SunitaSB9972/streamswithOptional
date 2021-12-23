package com.xworkz.prgm.stream;

import java.util.stream.Collectors;
import java.util.Optional;
import java.util.stream.Stream;


public class CompanyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		CompanyDto c1= new CompanyDto(1, "Infosys" , "SudhamurtyAndNarayanMurti", 123345624643.45d);
		CompanyDto c2= new CompanyDto(2, "Wipro" , "Premji", 283345624643.45d);
		CompanyDto c3= new CompanyDto(3, "TataGroup" , "Ratan tata", 5033456246436.15d);
		CompanyDto c4= new CompanyDto(4, "HCL" , "C vijaykumar", 153345624643.45d);
		CompanyDto c5= new CompanyDto(5, "Infosys" , "SudhamurtyAndNarayanMurti", 123345624643.45d);
		CompanyDto c6= new CompanyDto(6, "tcs" , "RajeshGopinathan", 456002464363.45d);
		
			Stream<CompanyDto> c = Stream.of(c1,c2,c3,c4,c5,c6 );
			
			
			
			boolean b = c5.equals(c6);
			System.out.println(b);
		
			Optional<CompanyDto> optional = c.filter((w)->w.getTurnOver()>456002464363.45d).findFirst();
			
			System.out.println(optional);
			
			
	}

}
