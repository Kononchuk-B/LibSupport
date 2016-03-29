package com.libsupport.repository;

import com.libsupport.entity.BookCopy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "bookCopies", collectionResourceRel = "bookCopies")
public interface BookCopyRepository extends JpaRepository<BookCopy, Integer> {

}
