package com.example.ParsingProject.controller;

import com.example.ParsingProject.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CourseParsingController {

    private final CourseService courseService;

    @GetMapping(value = "/getCourse")
    public String getListInformation() {
        return courseService.findCourseInfo().toString();
    }
}
