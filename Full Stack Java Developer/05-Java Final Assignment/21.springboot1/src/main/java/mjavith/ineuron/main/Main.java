package mjavith.ineuron.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import mjavith.ineuron.model.Student;
import mjavith.ineuron.service.StudentService;

@Component
public class Main implements CommandLineRunner{
   @Autowired
	private StudentService service;
	@Override
	public void run(String... args) throws Exception {
		Student student=new Student(null,"nitin","rcb",30);
		String save = service.save(student);
		System.out.println(save);
		
		
		
	}
	
	

}
