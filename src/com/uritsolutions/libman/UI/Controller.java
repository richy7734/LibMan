package com.uritsolutions.libman.UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import com.uritsolutions.libman.config.HibernateConfig;
import com.uritsolutions.libman.config.SpringBeansInitializer;
import com.uritsolutions.libman.dao.BookDao;
import com.uritsolutions.libman.pojos.Book;

@Component
public class Controller {

	@Autowired
	BookDao bookDao;

	public static void main(String[] args) {
		System.out.println("------------- Initializing Application context -------------");

		ApplicationContext context = new AnnotationConfigApplicationContext("com.uritsolutions.libman");
		context.getBean(HibernateConfig.class);
		context.getBean(SpringBeansInitializer.class);
		context.getBean(Controller.class).appInit();

		System.out.println("------------- Application Context initialized --------------");

	}

	public void appInit() {

		Book book_ = new Book();
		Scanner scanner = new Scanner(System.in);

		MyFrame test = new MyFrame();
		test.setVisible(true);
		LoginFrame loginFrame = new LoginFrame();
		
		
		/*if (true) {
			List<Book> books = new ArrayList<>();
			System.out.println("Recieving books");
			try {
				books = bookDao.getAllBooks();
				ShowBooksFrame showBooksFrame = new ShowBooksFrame(books);
			} catch (Exception e) {
				e.printStackTrace();
			}

			if (books.isEmpty()) {
				System.out.println("No books in database.");
				System.out.println("Enter books : ");
				System.out.println("Title : ");
				book_.setTitle(scanner.nextLine());
				System.out.println("Auther : ");
				book_.setAuther(scanner.nextLine());

				bookDao.addBook(book_);
				books = bookDao.getAllBooks();
				for (Book book : books) {
					int i = 0;
					System.out.println("---------------- Books ----------------");
					System.out.println(i + " " + book.getTitle() + " " + book.getAuther());
					i++;
				}
			} else {
				for (Book book : books) {
					int i = 0;
					System.out.println("---------------- Books ----------------");
					System.out.println(i + " " + book.getTitle() + " " + book.getAuther());
					i++;
				}
			}

		} else {
			System.out.println("Please check the username and password.");
		}
*/
	}

}
