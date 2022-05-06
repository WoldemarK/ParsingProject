package com.example.ParsingProject.service;

import com.example.ParsingProject.dto.CourseDto;
import com.example.ParsingProject.dto.CourseDtoOnce;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class CourseClient {

    public static final String URL = "https://cbr.ru/scripts/XML_daily.asp?date_req=06/05/2022.xml";

    final RestTemplate restTemplate = new RestTemplate();

    public List<CourseDtoOnce> getCourses() {
        CourseDto response = restTemplate.getForObject(URL, CourseDto.class);

        if (response != null) {
            response
                    .getValute()
                    .forEach(x -> {
                        x.setValue(Double.parseDouble(x.get_Value().replace(",", ".")));
                        System.out.println(x);
                    });

            return response.getValute();
        }

        return null;
    }
}
