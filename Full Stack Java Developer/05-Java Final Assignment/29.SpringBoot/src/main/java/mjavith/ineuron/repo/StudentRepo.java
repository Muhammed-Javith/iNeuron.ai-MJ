package mjavith.ineuron.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import mjavith.ineuron.model.Student;

public interface StudentRepo extends PagingAndSortingRepository<Student, Integer> {

	
}
