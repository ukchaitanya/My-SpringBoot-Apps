package com.example.springboot.basicspringBootapp;

public class Book {
	
	Long id;
	String name;
	String author;
	
	public Book(Long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	
	
	
	
}
