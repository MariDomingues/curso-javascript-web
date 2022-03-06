package com.nutricao.mapper;

import com.nutricao.model.entity.PacienteEntity;
import com.nutricao.model.request.PacienteRequest;
import com.nutricao.model.response.PacienteResponse;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-06T12:15:41-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.12 (Oracle Corporation)"
)
@Component
public class PacienteMapperImpl implements PacienteMapper {

    @Override
    public PacienteEntity requestToEntity(PacienteRequest pPaciente) {
        if ( pPaciente == null ) {
            return null;
        }

        PacienteEntity pacienteEntity = new PacienteEntity();

        pacienteEntity.setNome( pPaciente.getNome() );
        pacienteEntity.setPeso( pPaciente.getPeso() );
        pacienteEntity.setAltura( pPaciente.getAltura() );
        pacienteEntity.setGorduraCorporal( pPaciente.getGorduraCorporal() );

        return pacienteEntity;
    }

    @Override
    public PacienteResponse entityToResponse(PacienteEntity pPaciente) {
        if ( pPaciente == null ) {
            return null;
        }

        PacienteResponse pacienteResponse = new PacienteResponse();

        pacienteResponse.setId( pPaciente.getId() );
        pacienteResponse.setNome( pPaciente.getNome() );
        pacienteResponse.setPeso( pPaciente.getPeso() );
        pacienteResponse.setAltura( pPaciente.getAltura() );
        pacienteResponse.setGorduraCorporal( pPaciente.getGorduraCorporal() );

        return pacienteResponse;
    }
}
