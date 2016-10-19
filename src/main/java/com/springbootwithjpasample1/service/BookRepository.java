package com.springbootwithjpasample1.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootwithjpasample1.domain.Book;

public interface BookRepository extends JpaRepository<Book,Long> {

}
