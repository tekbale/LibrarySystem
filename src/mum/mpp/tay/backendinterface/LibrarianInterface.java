/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mum.mpp.tay.backendinterface;

import java.util.List;
import mum.mpp.tay.entity.Book;
import mum.mpp.tay.entity.CheckoutRecord;
import mum.mpp.tay.entity.Member;
import mum.mpp.tay.entity.Staff;

/**
 *
 * @author 984761
 */
public interface LibrarianInterface {

    Staff getThisStaffObject();

    CheckoutRecord checkout(String bookISBN, long memberId) throws ServiceException;

    boolean isBookAvailable(String ISBN) throws ServiceException;

    List<Book> getAllBooks() throws ServiceException;

    List<Book> getBookByName(String name) throws ServiceException;

    Member getMemberById(long id) throws ServiceException;

    List<CheckoutRecord> getMemberRecord(long memberId) throws ServiceException;

    CheckoutRecord checkIn(long recordId) throws ServiceException;

}
