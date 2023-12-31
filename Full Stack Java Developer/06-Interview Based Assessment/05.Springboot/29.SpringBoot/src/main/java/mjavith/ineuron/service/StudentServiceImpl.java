package mjavith.ineuron.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import mjavith.ineuron.model.Student;
import mjavith.ineuron.repo.StudentRepo;
@Service
public class StudentServiceImpl implements StudentService {
 @Autowired
 private StudentRepo repo;
	@Override
	public Iterable<Student> getStudents(Integer pageNo,Integer size) {
		Pageable pageable = PageRequest.of(pageNo, size);
		   Page<Student> all = repo.findAll(pageable);
		return all.getContent();
	}
	
	

}
