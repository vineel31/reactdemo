package com.example.demo.departmentVineel;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.tags.Tag;


@CrossOrigin
@RequestMapping("/api/v1")
@Tag(name="department")
@RestController
public class departmentController {
	
	@Autowired
	private departmentRepository depRepo;
	
	@GetMapping("/department")
	public List<department> getAlldepartments(){
		return depRepo.findAll();
	}
	
	@GetMapping("/department/{id}")
	public Optional<department> getdepartmentbyid(@PathVariable String id){
		return depRepo.findById(id);
	}
	
	@PutMapping("/department/{id}")
		public department updatedepartment(@RequestBody department departments,@PathVariable String id) {
			department currentdepartment;
			currentdepartment=depRepo.findById(id).get();
			currentdepartment.setDEPARTMENT_ID(departments.getDEPARTMENT_ID());
			currentdepartment.setDEPARTMENT_NAME(departments.getDEPARTMENT_NAME());
			currentdepartment.setMANAGER_ID(departments.getMANAGER_ID());
			currentdepartment.setLOCATION_ID(departments.getLOCATION_ID());
			return depRepo.save(currentdepartment);
		
	}
	
	@DeleteMapping("/department/{id}")
	public void deletedepartmentbyid(@PathVariable String id) {
		depRepo.deleteById(id);
		
	}
	
	@PostMapping("/department")
	public department saveDepartment(@RequestBody department departments) {
		return depRepo.save(departments);
	}
	
}
