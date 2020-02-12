package com.ing.careconnect.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ing.careconnect.entity.Doctors;
@Repository
public interface DoctorRepository extends JpaRepository<Doctors, Long>{
Doctors	findByUserId(Long userId);

}
