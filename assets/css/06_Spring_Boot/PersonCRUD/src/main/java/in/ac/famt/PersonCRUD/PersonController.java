package in.ac.famt.PersonCRUD;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder; 

@RestController
public class PersonController {
	
	@Autowired
	PersonDAO service;
	
	@GetMapping("/person/display")
	public List<Person> displayAllPerson() {
		return service.displayAll();
	}
	
	@GetMapping("/person/search/{pid}")
	public Person displayAPersonInfo(@PathVariable int pid) {
		Person per = service.findPerson(pid);
		if(per == null)
			throw new PersonNotFoundException("PersonId = " + pid);
		return per;
	}
	
	/*@PostMapping("/persons")
	public ResponseEntity<Object> createPerson(@RequestBody Person per) {
		Person newPerson = service.savePerson(per);
		
		URI currentId = ServletUriComponentsBuilder
						.fromCurrentRequest()	//-> current resource created
						.path("/{pid}") 		//->/persons/{pid} id of created person
						.buildAndExpand(newPerson.getId())	//get the id of new person
						.toUri();
		return ResponseEntity.created(currentId).build();
	}*/
	
	@PostMapping("/person/add")
	public String createPerson(@RequestBody Person per) {
		Person newPerson = service.savePerson(per);
		
		return "Data saved for " + newPerson.getName();
		//return newPerson;
	}
	
	@PatchMapping("/person/update")
	public String updatePerson(@RequestBody Person per) {
		Person newPerson = service.updatePerson(per);
		if(newPerson == null)
			throw new PersonNotFoundException("PersonId = " + per.getId());
		return "Data updated for " + newPerson.getName();
		
		//return service.updatePerson(per);
		//return newPerson;
	}
	
	@DeleteMapping("/person/delete/{pid}")
	public Person deletePerson(@PathVariable int pid) {
		Person per = service.deletePersonById(pid);
		if(per == null)
			throw new PersonNotFoundException("PersonId = " + pid);
		return per;
	}
}