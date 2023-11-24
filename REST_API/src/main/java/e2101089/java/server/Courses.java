package e2101089.java.server;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class Courses {

    @GetMapping("/{id}")
    public String getCourseById(@PathVariable Long id) {
        // Implement logic to retrieve course by ID
        return "Course Details for ID: " + id;
    }

    // Other endpoints for managing courses
}