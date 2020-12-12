package com.pspec.course.controller;

import com.pspec.course.model.Course;
import com.pspec.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/{courseId}")
    public Mono<Course> getCourseById(@PathVariable("courseId") String courseId) {
        return this.courseService.getCourseById(Long.parseLong(courseId));
    }

    @PostMapping("/")
    public Mono<Course> createCourse(@RequestBody Course course) {
        return this.courseService.createCourse(course);
    }

    @PutMapping("/")
    public Mono<Course> updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/{courseId}")
    public Mono<Void> deleteCourseById(@PathVariable("courseId") String courseId) {
        return this.courseService.deleteCourseById(Long.parseLong(courseId));
    }

}
