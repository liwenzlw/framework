package com.liwen.go.demo.ehcache;

import java.util.ArrayList;
import java.util.List;

import javax.cache.annotation.CacheKey;
import javax.cache.annotation.CacheResult;

import org.springframework.stereotype.Component;

@Component
public class DemoEhcache {

	public static List<BookEhcache> books = new ArrayList<>();
	static {
		books.add(new BookEhcache(1,"数学"));
		books.add(new BookEhcache(2,"语文"));
		books.add(new BookEhcache(3,"英语"));
	}
	//@Cacheable(value="myCache",key="#id")
	@CacheResult(cacheName="myCache")
	public BookEhcache findBook(@CacheKey Integer id) {
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
