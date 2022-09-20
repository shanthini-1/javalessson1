package com.chainsys.classandmethods;

public class Movies {
	private final int movieNo;
	private String name;
	private String language ;
	private int budget;
	private String releaseDate;
	
	
	//Constructor
	public Movies(int movieNum)
	{
		this. movieNo=movieNum;
		
	}

	public int getMovieNo() {
		return movieNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	
}
