package com.springJPAImplementation.jpaimplementation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Course {
    @Id
    @SequenceGenerator(
            name = "course_sequence",
    sequenceName = "course_sequence",
    allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
    generator = "course_sequence"
    )
    private Long courseid;
    private String title;
    private Integer credit;


}
