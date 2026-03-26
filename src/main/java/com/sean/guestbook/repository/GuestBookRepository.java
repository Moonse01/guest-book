package com.sean.guestbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sean.guestbook.domain.GuestBook;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer>{

}
