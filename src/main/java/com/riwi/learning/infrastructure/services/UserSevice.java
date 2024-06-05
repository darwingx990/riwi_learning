package com.riwi.learning.infrastructure.services;

import com.riwi.learning.api.dto.request.UserRequest;
import com.riwi.learning.api.dto.response.UserResponse;
import com.riwi.learning.infrastructure.abstractServices.IUserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserSevice implements IUserService {
    @Override
    public UserResponse getById(Long aLong) {
        return null;
    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public UserResponse create(UserRequest userRequest) {
        return null;
    }

    @Override
    public UserResponse update(Long aLong, UserRequest userRequest) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
