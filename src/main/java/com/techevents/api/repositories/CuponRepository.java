package com.techevents.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techevents.api.domain.coupon.Coupon;

public interface CuponRepository extends JpaRepository<Coupon, UUID>{

}
