/*
        IBookScvSerialImp.java ~ The implementation of the IbookSvc interface.
        
        @author Adam King
        @version 1
*/
package Service;
import domain.*;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//make the text fields visible.
/**
 *
 * @author root
 */
public class BookSvcSerialImp implements IBookSvc, Serializable
{

    @Override
    public Book create(Book book) {
    //Create the book
        book = new Book();
        return book;
    }

    @Override
    public Book add(Book b) {
    
        //Write object to stream.
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("thisFile"));
            output.writeObject(b);
            output.flush();
            output.close();
            
        } catch (IOException ex) {
            Logger.getLogger(BookSvcSerialImp.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
    return b;
    }

    @Override
    public Book update(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Book delete(Book b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
