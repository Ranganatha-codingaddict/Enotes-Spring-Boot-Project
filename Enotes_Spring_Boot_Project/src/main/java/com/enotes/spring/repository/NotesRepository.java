package com.enotes.spring.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.enotes.spring.entity.Notes;
import com.enotes.spring.entity.User;

public interface NotesRepository extends JpaRepository<Notes, Integer>{

	
	public Page<Notes> findByUser(User user, Pageable pageable);
	
}
