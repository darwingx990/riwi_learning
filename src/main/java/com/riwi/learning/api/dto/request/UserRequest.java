package com.riwi.learning.api.dto.request;

import com.riwi.learning.utils.enums.UserRole;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    @NotBlank(message = "Username is required")
    @UniqueElements(message = "Username already exist")
    private String username;
    @NotBlank(message = "Password is required.")
    @Size(min = 8, max = 50, message = "Password must have at least 8 characters and can not be over 50 characters long.")
    private String password;
    @NotBlank(message = "Email is required.")
    private String email;
    @Size(max = 100, message = "FullName can not be over 100 characters long.")
    private String fullName;
    @NotNull(message = "Role is required")
    private UserRole role;

}
