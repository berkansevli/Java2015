package labStudy3;

import java.util.Scanner;

public class TesterMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book book1=new book("Lord of the Rings"," J. R. R. Tolkien");
		book1.addChapter("A Long-expected Party", 50);
		book1.addChapter("The Shadow of the Past", 30);
		System.out.println(book1);
		System.out.println("Total Pages:"+book1.getTotalPages());
		System.out.println(book1.getTableOfContents());
	 	
		Scanner klavye=new Scanner(System.in);
		System.out.print("Please enter the TITLE of second book ");
		String title=klavye.nextLine();
		
		System.out.print("Please enter the AUTHOR of second book ");
		String author=klavye.nextLine();
		
		book book2=new book(title, author);
		
		System.out.print("Please enter the name of FIRST chapter  ");
		String chapterName=klavye.nextLine();
		
		System.out.print(" ...and the total number of pages for FIRST chapter ");
		int chapterPage=klavye.nextInt();
		book2.addChapter(chapterName, chapterPage);
		
		klavye.nextLine();
		System.out.print("Please enter the name of SECOND chapter ");
		chapterName=klavye.nextLine();
		
		System.out.print(" ...and the total number of pages for SECOND chapter ");
		chapterPage=klavye.nextInt();
		book2.addChapter(chapterName, chapterPage);
		
		System.out.println("\n----------Second Book Details---------");
		
		System.out.println(book2);
		System.out.println("Total Pages:"+book2.getTotalPages());
		System.out.println(book2.getTableOfContents());
	 	
		
		
	}

}
