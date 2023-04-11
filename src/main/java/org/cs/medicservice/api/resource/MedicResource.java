package org.cs.medicservice.api.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cs.medicservice.api.dto.MedicDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value = "Medics API")
@RequestMapping(value = "/api/medics")
public interface MedicResource {

    @ApiOperation(value = "Persist a Medic", notes = "This method will receive an instance of MedicDTO and will update it if already exists, or create it otherwise.")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity saveMedic(@RequestBody MedicDTO medicDTO);

    @ApiOperation(value = "Get a list of Medics", notes = "This method returns a list containing all medics currently in the database.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<MedicDTO> getMedics();

    @ApiOperation(value = "Delete a Medic", notes = "This method will delete a medic by its ID if exists.")
    @DeleteMapping
    ResponseEntity deleteMedic(@RequestParam Long id);

}
