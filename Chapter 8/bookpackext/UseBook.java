package bookpackext;
import bookpack.*;

class UseBook{
public static void main(String args[]){
Book books[] = new Book[5];

books[0] = new Book("java", "schildt", 2019);
books[1] = new Book("java", "schildt", 2019);
books[2] = new Book("introducing", "schildt", 2015);
books[3] = new Book("Red", "Clancy", 1986);
books[4] = new Book("Road", "Kerouac", 1955);

for(int i=0; i<books.length; i++) books[i].show();
}
}



