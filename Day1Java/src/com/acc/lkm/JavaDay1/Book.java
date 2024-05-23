package com.acc.lkm.JavaDay1;

public class Book {
	private String author_name, yearOfPublication, book_title;
	Book(String author_name, String yearOfPublication, String book_title) {
//		super();
		this.author_name = author_name;
		this.yearOfPublication = yearOfPublication;
		this.book_title = book_title;
	}
	
	@Override
	public String toString() {
		return "Book : author_name = " + author_name + ", yearOfPublication = " + yearOfPublication + ", book_title = "
				+ book_title;
	}

	public static void main(String[] args) {
		System.out.println(new Book("Amish Tripathy", "19/10/2021", "Shiva Trilogy Part 1"));
	}
}
