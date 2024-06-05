package com.riwi.learning.infrastructure.services;

import com.riwi.learning.api.dto.request.AssignmentRequest;
import com.riwi.learning.api.dto.response.AssignmentResponse;
import com.riwi.learning.infrastructure.abstractServices.IAssignmentService;
import org.springframework.data.domain.Page;

public class SubmissionService implements IAssignmentService {
    @Override
    public AssignmentResponse getById(Long aLong) {
        return null;
    }

    @Override
    public Page<AssignmentResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public AssignmentResponse create(AssignmentRequest assignmentRequest) {
        return null;
    }

    @Override
    public AssignmentResponse update(Long aLong, AssignmentRequest assignmentRequest) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }
}
