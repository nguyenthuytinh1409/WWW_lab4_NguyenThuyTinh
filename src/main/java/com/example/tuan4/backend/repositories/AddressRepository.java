package com.example.tuan4.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.tuan4.backend.models.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
