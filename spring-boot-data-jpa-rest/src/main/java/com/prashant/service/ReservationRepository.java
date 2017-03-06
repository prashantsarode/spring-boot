package com.prashant.service;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.prashant.domain.Reservation;

@RepositoryRestResource
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

	@RestResource(path="by-name")
	Collection<Reservation> findByReservationName(@Param("rn") String rn);
	
}
