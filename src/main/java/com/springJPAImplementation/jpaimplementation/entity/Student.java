package com.springJPAImplementation.jpaimplementation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.webresources.StandardRoot;

import javax.persistence.*;

@Data
@Entity //This is used to create table in the database
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name =
        "tbl_student",
        uniqueConstraints = @UniqueConstraint(
                name = "emailid_unique",
                columnNames = "Email_id"
)
)//Can be used to rename tables
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_generator"
    )

    // need to add Generated value and sequence generator to avoid the error mentioned error below.
//    https://stackoverflow.com/questions/10997494/hibernate-error-ids-for-this-class-must-be-manually-assigned-before-calling-sav
    private Long studentId;
    private String firstName;
    private String lastName;
    @Column(
            name = "Email_id",
            nullable = false
    )
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String getGuardianMobile;

}
