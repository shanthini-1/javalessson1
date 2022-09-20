package com.chainsys.unittest;

import com.chainsys.classandmethods.Movies;

public class MoviesTester {
	public static void testMovieNo() {
		Movies firstMovie = new Movies(2345);
		firstMovie.setName("HeySinamika");
		System.out.println(firstMovie.getMovieNo());
		System.out.println(firstMovie.getName());
	}
	public static void testLanguage() {
		Movies firstMovie = new Movies(2345);
		firstMovie.setLanguage("Tamil");
		System.out.println(firstMovie.getLanguage());
	}
	public static void testBudget() {
		Movies firstMovie = new Movies(2345);
		firstMovie.setBudget(5000000);
		System.out.println(firstMovie.getBudget());
	}
	public static void testReleaseDate() {
		Movies firstMovie = new Movies(2345);
		firstMovie.setReleaseDate("25 Mar 2022");
		System.out.println(firstMovie.getReleaseDate());
	}
}
