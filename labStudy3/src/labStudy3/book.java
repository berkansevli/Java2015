package labStudy3;

public class book {
	private String title, author, toc;
	private int nextPage=1;
	
	public book() {
		title="Not Specified";
		author="Not Specified";
		toc="";
	}
	
	public book (String givenTitle,String givenAuthor) {
		title=givenTitle;
		author=givenAuthor;
		toc="";
		
	}
	
	public void addChapter(String chapterName,int numofPages) {
		toc =toc + chapterName + "\t....................\t" + nextPage +"\n";
		nextPage+=numofPages;
	}
	
	public int getTotalPages() {
		return nextPage;
	}
	
	public String getTableOfContents() {
		return toc;
	}
	
	public String toString() {
		return "Title: " + title + "\nAuthor"+ author;
	}
	

}
