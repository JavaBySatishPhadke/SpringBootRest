package com.sp.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sp.model.Faculty;
import com.sp.model.Farmer;
import com.sp.model.Land;

@RestController
@RequestMapping("/faculty-api")
public class FacultyOperationController {

	@GetMapping("/report")
	public ResponseEntity<Faculty> showReport() {

		Faculty faculty = new Faculty();
		faculty.setFid(1);
		faculty.setFname("Shaurya");
		faculty.setQlfy("MS -  DataScience");
		faculty.setAddrs("pune");
		faculty.setSubject("English");

		return new ResponseEntity<Faculty>(faculty, HttpStatus.OK);

	}

	
	  @GetMapping("/report2") 
	  public ResponseEntity<Farmer> showReport2() {
	  
	  Land land = new Land(99260, "10", "Kunjirwadi", "Wet"); 
	  Farmer farmer = new Farmer(2001, "Satish", "pune", new String[] { "red", "blue" }, true, "kunda",
	  List.of("shaurya", "shiv"), Set.of(22334L, 56677L), Map.of("addrs", 2344,
	  "voters", 123), land);
	  
	  // return response entity object 
	  return new ResponseEntity<Farmer>(farmer, HttpStatus.OK); }
	 
	
	// reponse entitiy removing but returning the class.
	/*
	 * @GetMapping("/report2") public Farmer showReport2() {
	 * 
	 * Land land = new Land(99260, "10", "Kunjirwadi", "Wet"); Farmer farmer = new
	 * Farmer(2001, "Satish", "pune", new String[] { "red", "blue" }, true, "kunda",
	 * List.of("shaurya", "shiv"), Set.of(22334L, 56677L), Map.of("addrs", 2344,
	 * "voters", 123), land);
	 * 
	 * // return response entity object //return new ResponseEntity<Farmer>(farmer,
	 * HttpStatus.OK);
	 * 
	 * return farmer; }
	 */


}
