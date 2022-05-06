package com.example.ParsingProject.repository;

import com.example.ParsingProject.dto.CourseDtoOnce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseEntityRepository extends JpaRepository<CourseDtoOnce, Long> {
}
