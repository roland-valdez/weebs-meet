package com.example.geeksmeet.dao;

import com.example.geeksmeet.Models.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Long>{
}
