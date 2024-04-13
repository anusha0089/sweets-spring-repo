package com.example.Sweets.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Sweets.Entity.Sweets;

public interface SweetsRepo extends JpaRepository<Sweets, Integer>{

}

