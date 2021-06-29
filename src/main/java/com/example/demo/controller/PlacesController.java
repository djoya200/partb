package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Places;
import com.example.demo.service.PlacesService;

@CrossOrigin
@RestController
@RequestMapping("/places")
public class PlacesController {

	@Autowired
	PlacesService placesservice;

//	get all items
	@GetMapping
	public Iterable<Places> getItems(){
		return placesservice.getItems();
	}
	
//	create item
	@PostMapping
	public Places createItem(@RequestBody Places item) {
		return placesservice.createItem(item);
	}
//	 get item by id
	@GetMapping("/{id}")
	public Places getItemById(@PathVariable Long id) {
		return placesservice.getItemById(id);
	}
	
// update items
	@PutMapping
	public Places updateItem(@RequestBody Places item) {
		return placesservice.updateItems(item);
	}
// delete items 
	@DeleteMapping("/{id}")
	public HttpStatus deleteItem(@PathVariable Long id) {
		return placesservice.deleteItem(id);
	}
}
