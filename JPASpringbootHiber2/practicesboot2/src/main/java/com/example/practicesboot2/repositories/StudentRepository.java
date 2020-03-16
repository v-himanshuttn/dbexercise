package com.example.practicesboot2.repositories;

import com.example.practicesboot2.entities.Student;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Integer> {

    @Query("from Student")
    List<Student> getStudents(Pageable pageable);

    @Query("from Student where firstName=:firstName")
    List<Student> getByFirstName(@Param("firstName") String firstName);

    @Query(value = "select * from student where fname=:firstName",nativeQuery = true)
    List<Student> getStudentNQ(@Param("firstName") String firstName);



}
