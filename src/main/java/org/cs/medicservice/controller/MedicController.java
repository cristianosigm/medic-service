package org.cs.medicservice.controller;

import org.cs.medicservice.api.dto.MedicDTO;
import org.cs.medicservice.api.resource.MedicResource;
import org.cs.medicservice.service.MedicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicController implements MedicResource {

    @Autowired
    private MedicService medicService;

    @Override
    public ResponseEntity saveMedic(MedicDTO medicDTO) {
        medicService.save(medicDTO);
        return ResponseEntity.ok().build();
    }

    @Override
    public List<MedicDTO> getMedics() {
        return medicService.findAll();
    }

    @Override
    public ResponseEntity deleteMedic(Long id) {
        medicService.delete(id);
        return ResponseEntity.ok().build();
    }

}
