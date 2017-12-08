package com.uritsolutions.libman.dao;

import java.util.List;

import com.uritsolutions.libman.pojos.Book;
import com.uritsolutions.libman.pojos.BookDetail;
import com.uritsolutions.libman.pojos.Category;

public interface BookDao {

	public boolean addBook(Book book);
	public boolean updateBook(Book book);
	public boolean deleteBook(Book book);
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	
	public boolean addBookDetail(BookDetail bookDetail);
	public boolean updateBookDetail(BookDetail bookDetail);
	public boolean deleteBookDetail(BookDetail bookDetail);
	public List<BookDetail> getAllBookDetails();
	public List<BookDetail> getBookDetailByCategory(Category category);
	public BookDetail getBookDetailByBookNumber(int bookNumber);
	
}
