package com.example.springbootassessment.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long employeeId;
    @NotNull
    @Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*",message = "Invalid Fist Name")
    private String firstName;
    @NotNull
    @Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*",message = "Invalid Last Name")
    private String lastName;
    @NotNull(message = "Department shouldn't be NULL")
    private String department;
    @NotNull(message = "Designation shouldn't be NULL")
    private String designation;
    @NotNull(message = "Salary shouldn't be NULL")
    @Min(value = 20000,message = "Salary should be greater than 20000")
    private double salary;

}
