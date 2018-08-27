package com.mc.app.Repository;

import com.mc.app.Model.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public class studentRepository extends MongoRepository<Student, String> {



}
