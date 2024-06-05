package com.riwi.learning.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnrollmentResponse {
    private Long id;
    private LocalDate enrollmentDate;
    private UserResponse userId;
    private CourseResponse courseId;
}
