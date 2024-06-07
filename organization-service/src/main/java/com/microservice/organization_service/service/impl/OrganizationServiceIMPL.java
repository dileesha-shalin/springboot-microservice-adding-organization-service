package com.microservice.organization_service.service.impl;

import com.microservice.organization_service.dto.OrganizationDTO;
import com.microservice.organization_service.entity.Organization;
import com.microservice.organization_service.mapper.OrganizationMapper;
import com.microservice.organization_service.repository.OrganizationRepository;
import com.microservice.organization_service.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceIMPL implements OrganizationService {

    @Autowired
    private OrganizationRepository organizationRepository;
    @Override
    public OrganizationDTO saveOrganization(OrganizationDTO organizationDTO) {
        Organization organization = OrganizationMapper.mapToOrganization(organizationDTO);

        Organization savedOrganization= organizationRepository.save(organization);
        OrganizationDTO organizationDTO1=OrganizationMapper.mapToOrganizationDTO(savedOrganization);
        return organizationDTO1;

    }

    @Override
    public OrganizationDTO getOrganizationByCode(String organizationCode) {

        Organization organization=organizationRepository.findByOrgCode(organizationCode);
        OrganizationDTO organizationDTO=OrganizationMapper.mapToOrganizationDTO(organization);
        return organizationDTO;
    }
}
