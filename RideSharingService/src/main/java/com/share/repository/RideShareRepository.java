package com.share.repository;

import com.share.model.RideShare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideShareRepository extends JpaRepository<RideShare,Integer> {
}
