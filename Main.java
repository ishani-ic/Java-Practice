//************************** Just to practice Java and Git
package demo;

import java.util.Scanner;

abstract class Book
{
	String titleOfBook;
	abstract void setTitle(String T);
	String getTitle()
	{
		return titleOfBook;
	}
}
class MyBook extends Book
{
	String Title1;
	void setTitle(String title)
	{
		this.Title1=title;
	}
	String getTitle()
	{
		return Title1;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Book title");
		String bookTitle=sc.nextLine();
		
		MyBook mb=new MyBook();
		mb.setTitle(bookTitle);
		System.out.println(mb.getTitle());
	}
}
