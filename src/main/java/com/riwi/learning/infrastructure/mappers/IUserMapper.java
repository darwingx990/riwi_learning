package com.riwi.learning.infrastructure.mappers;

import com.riwi.learning.api.dto.request.UserRequest;
import com.riwi.learning.api.dto.response.UserResponse;
import com.riwi.learning.domain.entities.User;

public interface IUserMapper
        extends BaseMapper<UserRequest, User, UserResponse> {

}