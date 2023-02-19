package in.ac.famt.PersonCRUD;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {
	private static List<Person> person = new ArrayList<>();
	//private static int cnt = 4;
	
	static {
		person.add(new Person(1, "Amey", 25));
		person.add(new Person(2, "Sachin", 28));
		person.add(new Person(3, "Nilesh", 22));
		person.add(new Person(4, "Swami", 27));
	}
	
	public List<Person> displayAll() {
		return person;
	}
	
	public Person savePerson(Person personParam) {
		/*if(personParam.getId()==0) 
			personParam.setId(++cnt);*/
		person.add(personParam);
		return personParam;
	}
	
	public Person updatePerson(Person personParam)
	{ 
		Person p1 = findPerson(personParam.getId());
		int pIndex = person.indexOf(p1);
		//int pIndex = person.indexOf(personParam);
		Person per = person.set(pIndex, personParam);
		return per;
	}
	
	public Person findPerson(int pid) {
		for(Person per:person) {
			if(per.getId() == pid)
				return per;
		}
		return null;
	}
	
	public Person deletePersonById(int pid) {
		Iterator<Person> perIterator = person.iterator();
		while(perIterator.hasNext()) {
			Person per = perIterator.next();
			if(per.getId() == pid) {
				perIterator.remove();
				return per;
			}
		}
		return null;
	}
}