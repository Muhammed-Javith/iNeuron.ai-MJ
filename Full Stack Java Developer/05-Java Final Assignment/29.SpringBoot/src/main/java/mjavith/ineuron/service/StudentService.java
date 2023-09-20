package mjavith.ineuron.service;

import mjavith.ineuron.model.Student;

public interface StudentService {

  
 
 public Iterable<Student> getStudents(Integer pageNo, Integer size);
}
