/*
        IBookScv.java ~ Intergace the Book service.
        
        @author Adam King
        @version 1
*/
package Service;
import domain.*;

/**
 *
 * @author Adam King
 */
public interface IBookSvc {
    public Book create(Book b);
    public Book add(Book b);
    public Book update(Book b);
    public Book delete(Book b);
    
}
