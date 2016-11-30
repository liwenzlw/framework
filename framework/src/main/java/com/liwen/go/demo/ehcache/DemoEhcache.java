package com.liwen.go.demo.ehcache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

@Component
public class DemoEhcache {

	public static List<BookEhcache> books = new ArrayList<>();
	static {
		books.add(new BookEhcache(1,"数学"));
		books.add(new BookEhcache(2,"语文"));
		books.add(new BookEhcache(3,"英语"));
	}
	@Cacheable(value="myCache",key="#id")
	public BookEhcache findBook(Integer id) {
		String a = "00";
		System.out.println("#############查找Book：" + id);
		for (BookEhcache book : books) {
			if (book.getId() == id) {
				return book;
			}
		}
		return null;
	}
}
