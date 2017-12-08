package com.uritsolutions.libman.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uritsolutions.libman.dao.BookDao;
import com.uritsolutions.libman.pojos.Book;
import com.uritsolutions.libman.pojos.BookDetail;
import com.uritsolutions.libman.pojos.Category;

@Repository("bookDao")
@Transactional
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addBook(Book book) {
		
		try {
			System.out.println("Saving book...");
			sessionFactory.getCurrentSession().save(book);
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean updateBook(Book book) {

		try {
			Session session = sessionFactory.openSession();
			session.saveOrUpdate(book);
			session.close();
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	@Override
	public boolean deleteBook(Book book) {

		try {
			Session session = sessionFactory.openSession();
			session.delete(book);
			session.close();
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	@Override
	public List<Book> getAllBooks() {
		
		List<Book> books = sessionFactory.getCurrentSession().createQuery("FROM Book",Book.class).list();
		return books;
	}

	@Override
	public Book getBookById(int id) {
		Session session = sessionFactory.openSession();
		Book book = session.get(Book.class, id);
		session.close();
		return book;

	}

	@Override
	public boolean addBookDetail(BookDetail bookDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateBookDetail(BookDetail bookDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteBookDetail(BookDetail bookDetail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BookDetail> getAllBookDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BookDetail> getBookDetailByCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookDetail getBookDetailByBookNumber(int bookNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
