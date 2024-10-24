package com.springJPAImplementation.jpaimplementation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class StudentEntity {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )

    // need to add Generated value and sequence generator to avoid the error mentioned error below.
//    https://stackoverflow.com/questions/10997494/hibernate-error-ids-for-this-class-must-be-manually-assigned-before-calling-sav
    private Long studentId;
    private String firstName;
    private String lastName;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public void setGuardianEmail(String guardianEmail) {
        this.guardianEmail = guardianEmail;
    }

    public String getGetGuardianMobile() {
        return getGuardianMobile;
    }

    public void setGetGuardianMobile(String getGuardianMobile) {
        this.getGuardianMobile = getGuardianMobile;
    }

    @Column(
            name = "Email_id",
            nullable = false
    )
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String getGuardianMobile;

}
