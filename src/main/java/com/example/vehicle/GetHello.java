package com.example.vehicle;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController


public class GetHello {
	RestTemplate rest=new RestTemplate();
	@GetMapping(value="/getHiviaHello")
	public String setHi() {
		String url="http://localhost:8080/Hi";
		
		ResponseEntity<String>res=rest.exchange(url,HttpMethod.GET,null,String.class);
		String empName=res.getBody();
		return empName;
	}
}
