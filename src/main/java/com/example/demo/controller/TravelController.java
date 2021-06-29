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

import com.example.demo.model.Travel;
import com.example.demo.service.TravelService;


@CrossOrigin
@RestController
@RequestMapping("/travel")
public class TravelController {
	
	@Autowired
	TravelService travelservice;
	
//	get all items
	@GetMapping
	public Iterable<Travel> getItems(){
		return travelservice.getItems();
	}
	
	
//	create item
	@PostMapping
	public Travel createItem(@RequestBody Travel item) {
		return travelservice.createItem(item);
	}
//	 get item by id
	@GetMapping("/{id}")
	public Travel getItemById(@PathVariable Long id) {
		return travelservice.getItemById(id);
	}
	
// update items
	@PutMapping
	public Travel updateItem(@RequestBody Travel item) {
		return travelservice.updateItems(item);
	}
// delete items 
	@DeleteMapping("/{id}")
	public HttpStatus deleteItem(@PathVariable Long id) {
		return travelservice.deleteItem(id);
	}
	
}

