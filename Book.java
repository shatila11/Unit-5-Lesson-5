public class Book
 
{
  //Fields or instance data
  //the data we keep track of
  private String title;
  private String author;
  private int year;
  private int numPages;
  private boolean hardcover;
  //we are not intializing the variables at all, just telling java what we will keep track of
  //will populate through constructor
 
  //Constructor
  public Book(String t, String a, int y, int n, boolean h) //not default, has parameters
  //same number of parameters as instance data
  {
    //instance data getting populated/assgined value _ (y) when we create object
    setTitle(t);
    setAuthor(a);
    setYear(y);
    setNumPages(n);
    setHardcover(h);
  }




//Overloading the constructor
public Book()
{
  this("none","unknown",1900,1,false);
}

 //Accesor Methods
 public String getTitle()
 {
   return title;
 }
 public String getAuthor()
 {
   return author;
 }
 public int getYear()
 {
   return year;
 }
 public int getNumPages()
 {
   return numPages;
 }
 public boolean getHardcover()
 {
   return hardcover;
 }
 //Mutator Methods
 public void setTitle(String s)
 {
title=s;
 }
  public void setAuthor(String u)
 {
author=u;
 }
  public void setNumPages(int q)
 {
numPages=q;
 }
  public void setYear(int e)
 {
year=e;
 }
  public void setHardcover(boolean b)
 {
hardcover=b;
 }


 //Other Methods
public boolean equals(Book b)
{
  if (this.getTitle().equals(b.getTitle()))
  {
return true;
  }
  else
  {
    return false;
  }
}




  //what prints for our object
  public String toString()
  {
    String str = "";
    str = "Title: " + title + " \nAuthor: " + author + "\nYear Published: " + year;
    str = str + "\nNumber of Pages: " + numPages + "\nIs it hardcover? " + hardcover;
    return str; //need to return a String
  }
}