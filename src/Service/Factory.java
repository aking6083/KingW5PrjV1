/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import java.io.*;


/**
 *
 * @author root
 */
public class Factory {
    public BookSvcSerialImp getBookSvc() {
        
        return new BookSvcSerialImp();
    }
    
}
