package com.microservice.organization_service.mapper;

import com.microservice.organization_service.dto.OrganizationDTO;
import com.microservice.organization_service.entity.Organization;

public class OrganizationMapper {
    public static OrganizationDTO mapToOrganizationDTO(Organization organization){
        OrganizationDTO organizationDTO = new OrganizationDTO(
                organization.getId(),
                organization.getOrgName(),
                organization.getOrgDesc(),
                organization.getOrgCode(),
                organization.getCreatedDate()
        );
        return organizationDTO;
    }

    public static Organization mapToOrganization(OrganizationDTO organizationDTO){
        Organization organization=new Organization(
                organizationDTO.getId(),
                organizationDTO.getOrgName(),
                organizationDTO.getOrgDesc(),
                organizationDTO.getOrgCode(),
                organizationDTO.getCreatedDate()
        );
        return organization;
    }
}
