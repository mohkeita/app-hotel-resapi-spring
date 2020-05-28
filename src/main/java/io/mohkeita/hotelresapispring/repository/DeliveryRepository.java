package io.mohkeita.hotelresapispring.repository;

import io.mohkeita.hotelresapispring.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
}
