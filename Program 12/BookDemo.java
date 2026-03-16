class Publisher{
     String publisherName;
     
     Publisher(String publisherName){
     this.publisherName=publisherName;
     }
    }
class Book extends Publisher {
    String bookName;
    String author;
    int price;
    
    Book(String publisherName,String bookName, String author,int price) {
    super(publisherName);
    this.bookName = bookName;
    this.author = author;
    this.price = price;
    }
    
    void displayBook() {
        System.out.println("Publisher: " + publisherName);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        }
}

class Literature extends Book {
     Literature(String publisherName,String bookName, String author,int price) {
         super(publisherName,bookName,author,price);
         }
         
         void showLiterature() {
             System.out.println("\n Literature Book Details");
             displayBook();
             }
}

class Fiction extends Book {
     Fiction(String publisherName,String bookName, String author,int price) {
          super(publisherName,bookName,author,price);
         }
         
         void showFiction() {
             System.out.println("\nFiction Book Details");
             displayBook();
             }
}

public class BookDemo {
      public static void main(String[] args) {
      Literature l1 = new Literature(
              "Penguin",
              "Wings of Fire",
              "A.P.J Abdul Kalam",
              350);
      Fiction f1 = new Fiction(
             "Harper Collins",
             "Harry Potter",
             "J K Rowling",
             500);
      l1.showLiterature();
      f1.showFiction();
      }
}
      
