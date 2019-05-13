abstract class Item{

private int UAN;
private String tittle;
private int No_copies;
void checkIN()
{
	System.out.println("YOU R JUST CHECKED IN INTO ITEM");
}
void checkOut()
{
	System.out.println("YOU R JUST CHECKEDOUT FROM ITEM");
}

public void setUAN(int UAN)
{this.UAN=UAN;}

public void setTittle(String tittle)
{this.tittle=tittle;}

public  void setNo_copies(int No_copies)
{this.No_copies=No_copies;}

public int getUAN()
{return this.UAN;}

public String getTittle()
{return this.tittle;}

public int getNo_copies()
{return this.No_copies;}

}

class WrittenItem extends Item{
private String author_name;

public void setAuthor(String author_name)
{this.author_name=author_name;}

public String getAuthor()
{return this.author_name;}

}

class Book extends WrittenItem{

Book(String author_name,int UAN,String tittle,int No_copies)
{
super.setAuthor(author_name);
super.setUAN(UAN);
super.setTittle(tittle);
super.setNo_copies(No_copies);
}
@Override
void checkIN()
{
	System.out.println("YOU R JUST CHECKED IN BOOKS");
}
@Override
void checkOut()
{
	System.out.println("YOU R JUST CHECKEDOUT FROM BOOKS");
}
}
class Journal extends WrittenItem{
private String year_of_publish;

public void setYear(String year_of_publish)
{this.year_of_publish=year_of_publish;}

public String getYear()
{return this.year_of_publish;}

}

class MediaItem extends Item{
private int rn;
}
class Video extends MediaItem{
private String director,genre,year_of_release;

public void setDirector(String director)
{this.director=director;}
public void setYear(String year_of_release)
{this.year_of_release=year_of_release;}
public String getDirector()
{return this.director;}
public String getYear()
{return this.year_of_release;}

}
class Cd extends MediaItem{
private String artist_name,genre;

public void setArtist(String artist_name)
{this.artist_name=artist_name;}
public void setGenre(String genre)
{this.genre=genre;}
public String getArtist()
{return this.artist_name;}
public String getGenre()
{return this.genre;}

}

class Client{
	public static void main(String[] args) {
		
Book b=new Book("shivam",007,"abcd",123);

System.out.println(b.getAuthor());
	}
}