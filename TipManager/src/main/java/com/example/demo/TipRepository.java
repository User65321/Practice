package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipRepository extends JpaRepository<Tip,Long>{
	
	public Optional<Tip> findById(Long id);
}
