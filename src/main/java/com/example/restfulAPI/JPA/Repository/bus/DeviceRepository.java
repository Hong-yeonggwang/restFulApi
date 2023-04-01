package com.example.restfulAPI.JPA.Repository.bus;

import com.example.restfulAPI.JPA.Entity.bus.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Long, Device> {

}
