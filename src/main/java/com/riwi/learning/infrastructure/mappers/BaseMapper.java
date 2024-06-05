package com.riwi.learning.infrastructure.mappers;

public interface BaseMapper <RequestDTO, Entity ,ResponseDTO>{

    Entity requestToEntity(RequestDTO request);

    ResponseDTO entityToResponse(Entity entity);
}