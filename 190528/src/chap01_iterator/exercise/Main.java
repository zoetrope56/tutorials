package chap01_iterator.exercise;

public class Main {
	public static void main(String[] args)	{
		BookShelf bookShelf = new BookShelf(4);
		
		bookShelf.appendBook(new Book("JAVA���� ���� ������ ���� �Թ�"));
		bookShelf.appendBook(new Book("����"));
		bookShelf.appendBook(new Book("����� �ڶ�� ��"));
		bookShelf.appendBook(new Book("��ö�� ���ݼ���"));
		
		Iterator it = bookShelf.iterator();
		
		while(it.hasNext())	{
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
		
		
	}

}
