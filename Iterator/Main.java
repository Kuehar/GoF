public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Effective Java"));
        bookShelf.appendBook(new Book("Effective Python"));
        bookShelf.appendBook(new Book("Effective C++"));
        bookShelf.appendBook(new Book("Effective JavaScript"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}