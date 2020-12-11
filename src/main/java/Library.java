import com.drzinks.fancylibrary.model.Book;

public interface Library {

    long addBook(String title, int year, String author); //TODO: exceptions
    void removeBook(long id); //TODO: exceptions
    


}
