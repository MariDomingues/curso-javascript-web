package com.nutricao.mapper;

import com.nutricao.model.entity.PacienteEntity;
import com.nutricao.model.request.PacienteRequest;
import com.nutricao.model.response.PacienteResponse;
import org.mapstruct.Mapper;

import static org.mapstruct.ReportingPolicy.IGNORE;

@Mapper(componentModel = "spring", unmappedTargetPolicy = IGNORE)
public interface PacienteMapper {

    PacienteEntity requestToEntity(PacienteRequest pPaciente);

     PacienteResponse entityToResponse(PacienteEntity pPaciente);
}
