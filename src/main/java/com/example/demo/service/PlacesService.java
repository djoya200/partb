package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.Places;
import com.example.demo.repository.PlacesRepository;

@Service
public class PlacesService {
	@Autowired
	PlacesRepository placesrepository;

//	get all items
	public Iterable<Places> getItems(){
		return placesrepository.findAll();
	}
	
//	get items by id
	public Places getItemById(Long id) {
		return placesrepository.findById(id).get();
	}
//	post/create
	public Places createItem(Places item) {
		return placesrepository.save(item);
	}
	
//	update items 
	public Places updateItems(Places item) {
		return placesrepository.save(item);
	}
	
//	delete items
	public HttpStatus deleteItem(Long id) {
		placesrepository.deleteById(id);
		return HttpStatus.OK;
	}

}
