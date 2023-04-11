package org.cs.medicservice.mapper;

import org.cs.medicservice.api.dto.MedicDTO;
import org.cs.medicservice.domain.Medic;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MedicMapper {

    public Medic map(MedicDTO from) {
        return parse(from);
    }

    public List<Medic> map(List<MedicDTO> from) {
        return from.stream().map(cur -> parse(cur)
        ).collect(Collectors.toList());
    }

    public List<MedicDTO> mapResponse(List<Medic> from) {
        return from.stream().map(cur -> MedicDTO.builder()
                .id(cur.getId())
                .name(cur.getName())
                .surname(cur.getSurname())
                .email(cur.getEmail())
                .address(cur.getAddress())
                .phone(cur.getPhone())
                .birthdate(cur.getBirthdate())
                .build()
        ).collect(Collectors.toList());
    }

    private Medic parse(MedicDTO dto) {
        return Medic.builder()
                .id(dto.getId())
                .name(dto.getName())
                .surname(dto.getSurname())
                .email(dto.getEmail())
                .address(dto.getAddress())
                .phone(dto.getPhone())
                .birthdate(dto.getBirthdate())
                .build();
    }

}
