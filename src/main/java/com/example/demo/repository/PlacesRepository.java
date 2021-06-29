package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Places;

public interface PlacesRepository extends CrudRepository<Places, Long> {

}
