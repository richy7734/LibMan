package com.uritsolutions.libman.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.uritsolutions.libman.UI.Controller;
import com.uritsolutions.libman.dao.impl.BookDaoImpl;

@Configuration
public class SpringBeansInitializer{

	@Bean(name = "bookDao", autowire = Autowire.BY_NAME)
	public BookDaoImpl initBookDao() {
		return new BookDaoImpl();
	}

	@Bean(name = "controller")
	public Controller initController() {
		return new Controller();
	}
}
