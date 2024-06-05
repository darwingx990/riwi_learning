package com.riwi.learning.api.dto.response;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MessageResponse {
    private Long id;
    private String message;
    private UserResponse senderId;
    private UserResponse receiverId;
    private CourseResponse courseId;
    private LocalDateTime date;
}
