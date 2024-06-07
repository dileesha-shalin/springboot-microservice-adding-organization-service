package com.microservice.organization_service.service;

import com.microservice.organization_service.dto.OrganizationDTO;
import org.springframework.stereotype.Service;

@Service
public interface OrganizationService {
    OrganizationDTO saveOrganization(OrganizationDTO organizationDTO);
    OrganizationDTO getOrganizationByCode(String organizationCode);
}
