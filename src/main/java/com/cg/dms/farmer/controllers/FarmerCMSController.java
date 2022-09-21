package com.cg.dms.farmer.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.cg.dms.beans.Farmer;

@RestController
public class FarmerCMSController {
	String companyEndPoint="http://localhost:8085";
	@Autowired 
	RestTemplate restTemplate;
	@GetMapping("/companyNameByFamerId/{farmerId}")
	public String companyName(int farmerId) {
		List<Farmer> f=Arrays.asList(restTemplate.getForObject(companyEndPoint+"/farmers",Farmer[].class));
		for(Farmer f1:f) {
			if(f1.getFarmerId()==farmerId) {
				return "Farmer with id numbner " +farmerId+ " belongs to company " +f1.getCompanyName() +"Eamil ID: " + f1.getEmail()+ "Mobile Number: " + f1.getMobileNumber();
			}
		
		}		
			return "farmer with id number " + farmerId + " not found";
	}
		
		
}
