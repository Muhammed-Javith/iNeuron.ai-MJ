package mjavith.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import mjavith.ineuron.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
