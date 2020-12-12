package com.pspec.course.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.HashSet;

@Data
public class Course {

    @Id
    private Long courseId;
    private String courseName , enrollmentType , courseDateOfCreation;
    private HashSet<String> courseOwners = new HashSet<>() , courseMembers = new HashSet<>() , courseLectures = new HashSet<>();

}
