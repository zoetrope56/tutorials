package chap01_iterator.exercise;

public class Main {
	public static void main(String[] args)	{
		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("JAVA언어로 배우는 디자인 패턴 입문"));
		bookShelf.appendBook(new Book("성경"));
		bookShelf.appendBook(new Book("고민이 자라는 밤"));
		bookShelf.appendBook(new Book("강철의 연금술사"));
		
		Iterator it = bookShelf.iterator();
		
		while(it.hasNext())	{
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
		
		
	}

}
