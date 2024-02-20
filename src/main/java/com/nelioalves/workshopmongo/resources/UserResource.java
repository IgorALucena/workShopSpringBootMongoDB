package com.nelioalves.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nelioalves.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		User user = new User("1", "Maria", "naotem@naotem.com");
		User use2 = new User("2", "Igor", "naotem@naotem.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(user,use2));
		return ResponseEntity.ok().body(list);
		
	}

}
