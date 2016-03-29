package com.libsupport.repository;


import com.libsupport.entity.BookReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "bookReservations", collectionResourceRel = "bookReservations")
public interface BookReservationRepository extends JpaRepository<BookReservation, Integer> {
}
