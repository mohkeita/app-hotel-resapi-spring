package io.mohkeita.hotelresapispring.repository;

import io.mohkeita.hotelresapispring.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {
}
