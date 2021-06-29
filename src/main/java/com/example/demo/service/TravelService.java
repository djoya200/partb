package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.model.Travel;
import com.example.demo.repository.TravelRepository;


@Service
public class TravelService {
		@Autowired
		TravelRepository travelrepository;

//		get all items
		public Iterable<Travel> getItems(){
			return travelrepository.findAll();
		}
		
//		get items by id
		public Travel getItemById(Long id) {
			return travelrepository.findById(id).get();
		}
//		post/create
		public Travel createItem(Travel item) {
			return travelrepository.save(item);
		}
		
//		update items 
		public Travel updateItems(Travel item) {
			return travelrepository.save(item);
		}
		
//		delete items
		public HttpStatus deleteItem(Long id) {
			travelrepository.deleteById(id);
			return HttpStatus.OK;
		}

	}

