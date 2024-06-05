package com.riwi.learning.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssignmentRequest {
    @NotBlank(message = "Tittle is required.")
    private String tittle;
    private String description;
    private Long lessonId;
}
