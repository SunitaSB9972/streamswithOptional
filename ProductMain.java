package com.xworkz.prgm.stream;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductMain {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		
			ProductDto d1= new ProductDto(1,"headphone", "wireless" , 2400 , 1000);
			ProductDto d2= new ProductDto(2, "earpod", "wireless", 1090 , 5000);
			ProductDto d3= new ProductDto(3,"bluetooth" , "wireless", 650, 400);
			ProductDto d4= new ProductDto(4, "earphone", "wired", 399, 3000);
			ProductDto d5= new ProductDto(5, "smartwatch", "wireless", 2000, 8000);
			ProductDto d6= new ProductDto(6, "earphone", "wired", 399, 1000);
			
			Set<ProductDto> d = new LinkedHashSet<ProductDto>();
			d.add(d4);
			d.add(d3);
			d.add(d1);
			d.add(d5);
			d.add(d6);
			d.add(d2);
			
				boolean b = d5.equals(d2);
				
							System.out.println(b);
							
			Optional<ProductDto> optional = d.stream().filter((f)->f.getPrice()>1000)
					.sorted((e1,e2)->e1.getPrice().compareTo(e2.getPrice())) .findFirst();
			System.out.println(d.size());
			System.out.println(optional);
				
		}

	}

