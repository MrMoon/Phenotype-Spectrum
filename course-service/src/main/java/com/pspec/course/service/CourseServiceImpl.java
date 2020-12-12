package com.pspec.course.service;

import com.pspec.course.model.Course;
import com.pspec.course.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    public Mono<Course> createCourse(Course course) {
        return this.courseRepository.save(course);
    }

    @Override
    public Mono<Course> getCourseById(Long courseId) {
        return this.courseRepository.findById(courseId);
    }

    @Override
    public Mono<Course> updateCourse(Course course) {
        return this.courseRepository.save(course);
    }

    @Override
    public Mono<Void> deleteCourseById(Long courseId) {
        return this.courseRepository.deleteById(courseId);
    }
}
