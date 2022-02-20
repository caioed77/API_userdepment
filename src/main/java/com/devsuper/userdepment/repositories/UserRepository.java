package com.devsuper.userdepment.repositories;


import com.devsuper.userdepment.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user, Long> {
	
}

