package com.techevents.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techevents.api.domain.address.Address;

public interface AddressRepository extends JpaRepository<Address, UUID>{

}
