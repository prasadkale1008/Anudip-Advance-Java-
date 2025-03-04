package com.Employee.Management.System.demo.EmployeeController;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Management.System.demo.EmployeeEntity.EmpEntity;


@RestController
@RequestMapping("/empData")
public class EmpController {

			private Map<Long,EmpEntity> employeeEntry=new HashMap<>();
			
			
			//Getting all the data /list of student
			@GetMapping("/ab")
			public List<EmpEntity> getAll(){
				return new ArrayList<>(employeeEntry.values());
			}

			//Data created by using post method or postMapping 
			@PostMapping
			public boolean createEntry(@RequestBody EmpEntity myEntry) {
				employeeEntry.put(myEntry.getId(), myEntry);
				return true;
			}
			
			//Get individual student data by their id
			@GetMapping("id/{myId}")
			public EmpEntity getEmpEntityById(@PathVariable Long myId) {
				return  employeeEntry.get(myId);
			}
			
			
			//delete student individually by their id
			@DeleteMapping("id/{myId}")
			public EmpEntity deleteEmpEntityById(@PathVariable Long myId) {
				return employeeEntry.remove(myId);
			}
			
			//update students by their id
			@PutMapping("/id/{id}")
			public EmpEntity updateEmpEntityById(@PathVariable Long id,@RequestBody EmpEntity myEntry) {
				return employeeEntry.put(id, myEntry);
			}
			
		
			@GetMapping("/abc")
			public String healthCheck() {
				return "Site is working";
			}
	
}
