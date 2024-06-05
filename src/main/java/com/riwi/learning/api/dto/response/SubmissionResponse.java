package com.riwi.learning.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubmissionResponse {
    private Long id;
    private String content;
    private LocalDateTime date;
    private BigDecimal grade;
    private UserResponse user;
    private AssignmentResponse assignment;
}
