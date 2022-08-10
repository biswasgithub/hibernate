package com.hibernate.onetomany.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hibernate.onetomany.entities.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

}
