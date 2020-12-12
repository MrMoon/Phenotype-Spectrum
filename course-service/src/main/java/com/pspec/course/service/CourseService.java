package com.pspec.course.service;

import com.pspec.course.model.Course;
import reactor.core.publisher.Mono;

public interface CourseService {

    Mono<Course> createCourse(Course course);
    Mono<Course> getCourseById(Long courseId);
    Mono<Course> updateCourse(Course course);
    Mono<Void> deleteCourseById(Long courseId);

}
