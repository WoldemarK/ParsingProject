package com.example.ParsingProject.service;

import com.example.ParsingProject.dto.CourseDtoOnce;
import com.example.ParsingProject.repository.CourseEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseEntityRepository courseEntityRepository;
    private final CourseClient courseClient;

    public List<CourseDtoOnce> findCourseInfo(){
        return courseEntityRepository.saveAll(courseClient.getCourses());
    }
}
