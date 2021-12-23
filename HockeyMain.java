package com.xworkz.prgm.stream;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

 
public class HockeyMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		HockyDto  h1 = new HockyDto("Indianteam" , 150, 6 , "India");
		HockyDto  h2 = new HockyDto("AustrelianTeam" ,50, 26 , "Austrelia");
		HockyDto  h3 = new HockyDto("AmericanTeam" , 100, 10 , "America");
		HockyDto  h4 = new HockyDto("Tokiya" , 	80, 14 , "China");
		HockyDto  h5 = new HockyDto("KinyaTeam" , 90, 22 , "Kinya");
		HockyDto  h6 = new HockyDto("Indianteam" , 150, 6 , "India");
		
	Set<HockyDto> dtos = new LinkedHashSet<HockyDto>();
		dtos.add(h5);
		dtos.add(h1);
		dtos.add(h2);
		dtos.add(h3);
		dtos.add(h6);
		dtos.add(h4);
		
		boolean b = h1.equals(h2);
			System.out.println(b);
		
			Optional<HockyDto> optional =  dtos.stream().filter((e)->e.getNoOfWins()>30).sorted((e1,e2)->e2.getTeamName().compareTo(e1.getTeamName())).findFirst();
		System.out.println(dtos.size());
		System.out.println(optional);
		
	}
}
