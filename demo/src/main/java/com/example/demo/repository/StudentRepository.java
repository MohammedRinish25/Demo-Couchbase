package com.example.demo.repository;




import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends CouchbaseRepository<Student, Integer> {

}
