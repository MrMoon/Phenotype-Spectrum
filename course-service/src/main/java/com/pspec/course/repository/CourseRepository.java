package com.pspec.course.repository;

import com.pspec.course.model.Course;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface CourseRepository extends ReactiveCrudRepository<Course , Long> {
}
