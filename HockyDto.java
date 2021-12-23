package com.xworkz.prgm.stream;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;

public class HockyDto implements Serializable{
	
	private String teamName;
	private Integer noOfWins;
	private Integer noOfLoses;
	private String country;
	
		public HockyDto(String teamName, Integer noOfWins,  Integer noOfLoses, String country) {
		super();
		this.teamName=teamName;
		this.noOfWins=noOfWins;
		this.noOfLoses=noOfLoses;
		this.country=country;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(teamName);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj != null) {
				System.out.println("null checked");
				
				if(obj instanceof HockyDto) {
					System.out.println("Instance checked");
					HockyDto dto = (HockyDto) obj;
					
					if(this.getTeamName().equals(dto.getTeamName())) {
						System.out.println("Team name is same "+ getTeamName());
						return true;
					}
					else {
						return false;
					}
				}
			}
			return true;
		}

		public String getTeamName() {
			return teamName;
		}

		public void setTeamName(String teamName) {
			this.teamName = teamName;
		}

		public Integer getNoOfWins() {
			return noOfWins;
		}

		public void setNoOfWins(Integer noOfWins) {
			this.noOfWins = noOfWins;
		}

		public Integer getNoOfLoses() {
			return noOfLoses;
		}

		public void setNoOfLoses(Integer noOfLoses) {
			this.noOfLoses = noOfLoses;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		@Override
		public String toString() {
			return "HockyDto [teamName=" + teamName + ", noOfWins=" + noOfWins + ", noOfLoses=" + noOfLoses
					+ ", country=" + country + "]";
		}

		
	
			

}
