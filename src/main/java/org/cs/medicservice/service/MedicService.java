package org.cs.medicservice.service;

import org.cs.medicservice.api.dto.MedicDTO;
import org.cs.medicservice.mapper.MedicMapper;
import org.cs.medicservice.repository.MedicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicService {

    @Autowired
    private MedicRepository medicRepository;

    @Autowired
    private MedicMapper mapper;

    public void save(MedicDTO medicDTO) {
        medicRepository.save(mapper.map(medicDTO));
    }

    public List<MedicDTO> findAll() {
        return mapper.mapResponse(medicRepository.findAll());
    }

    public void delete(Long id) {
        medicRepository.deleteById(id);
    }

}
