package com.microservice.organization_service.controller;

import com.microservice.organization_service.dto.OrganizationDTO;
import com.microservice.organization_service.service.OrganizationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/organizations")
@AllArgsConstructor
public class OrganizationController {

    private OrganizationService organizationService;

    @PostMapping
    public ResponseEntity<OrganizationDTO> saveOrganization(@RequestBody OrganizationDTO organizationDTO){
        OrganizationDTO savedOrganizationDTO= organizationService.saveOrganization(organizationDTO);
        return new ResponseEntity<>(savedOrganizationDTO, HttpStatus.CREATED);

    }

    @PostMapping
    public ResponseEntity<OrganizationDTO> getOrganization(@PathVariable("code") String organizationCode){
        OrganizationDTO savedOrganizationDTO= organizationService.getOrganizationByCode(organizationCode);
        return ResponseEntity.ok(savedOrganizationDTO);

    }
}
