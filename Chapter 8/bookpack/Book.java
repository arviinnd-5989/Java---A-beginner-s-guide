package bookpack;

public class Book{
protected String title;
protected String author;
protected int pubDate;

public Book(String t, String a, int d){
title = t;
author = a;
pubDate = d;
}

public void show(){
System.out.println(title);
System.out.println(author);
System.out.println(pubDate);
System.out.println();
}
}

/*class BookDemo{
public static void main(String args[]){
Book books[] = new Book[5];

books[0] = new Book("java", "schildt", 2019);
books[1] = new Book("java", "schildt", 2019);
books[2] = new Book("introducing", "schildt", 2015);
books[3] = new Book("Red", "Clancy", 1986);
books[4] = new Book("Road", "Kerouac", 1955);

for(int i=0; i<books.length; i++) books[i].show();
}
}*/



