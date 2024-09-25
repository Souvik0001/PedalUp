package com.pedalup.hackathon.pedalupApp.repositories;

import com.pedalup.hackathon.pedalupApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepository extends JpaRepository<RideRequest, Long> {
}