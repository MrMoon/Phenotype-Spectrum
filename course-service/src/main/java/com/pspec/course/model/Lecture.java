package com.pspec.course.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.HashSet;

@Data
public class Lecture {

    @Id
    private Long lectureId;
    private String lectureName , lectureDateOfCreation , lectureOwnerId;
    private HashSet<String> lectureResources = new HashSet<>();
}
