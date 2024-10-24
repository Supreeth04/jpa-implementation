package com.springJPAImplementation.jpaimplementation.repository;

import com.springJPAImplementation.jpaimplementation.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import java.util.List;
@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {

//        List<StudentEntity> findByTitleContainingOrContentContaining(String text, String textAgain);
        }
