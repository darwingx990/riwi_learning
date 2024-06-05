//package com.riwi.learning.infrastructure.helpers;
//
//import com.riwi.learning.api.dto.request.UserRequest;
//import com.riwi.learning.api.dto.response.UserResponse;
//import com.riwi.learning.domain.entities.User;
//import com.riwi.learning.domain.repositories.UserRepository;
//import com.riwi.learning.infrastructure.mappers.IUserMapper;
//import com.riwi.learning.utils.enums.UserRole;
//import com.riwi.learning.utils.exceptions.BadRequestException;
//import lombok.AllArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//@AllArgsConstructor
//public class EmailHelper implements IUserMapper {
//
//    @Autowired
//    private final UserRepository userRepository;
//
//    @Override
//    public User requestToEntity(UserRequest request) {
//
//        User email = this.userRepository.findByEmail(request.getEmail());
//        User username = this.userRepository.findByUsername(request.getUsername());
//
//        if (email != null && !email.getEmail().equalsIgnoreCase(request.getEmail())) {
//            throw new BadRequestException("E-mail is already registered" + email.getEmail());
//        }
//        ;
//
//        if (username != null && !username.getUserName().equals(request.getUsername())) {
//            throw new BadRequestException("Username is already registered");
//        }
//        ;
//
//        return User.builder()
//                .userName(request.getUsername())
//                .password(request.getPassword())
//                .email(request.getEmail())
//                .fullName(request.getFullName())
//                .role(UserRole.valueOf(String.valueOf(request.getRole())))
//                .build();
//    }
//
//    @Override
//    public UserResponse entityToResponse(User entity) {
//        return UserResponse.builder()
//                .id(entity.getId())
//                .fullName(entity.getFullName())
//                .role(entity.getRole())
//                .email(entity.getEmail())
//                .build();
//    }
//
//}
