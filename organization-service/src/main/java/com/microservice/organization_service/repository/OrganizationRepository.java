package com.microservice.organization_service.repository;

import com.microservice.organization_service.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization,Long> {
    Organization findByOrgCode(String organizationCode);
}
