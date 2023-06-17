package com.share.repository;

import com.share.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Cars, Integer> {
    List<Cars> findAllByAvailable(boolean available);



}
