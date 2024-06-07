package com.microservice.organization_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrganizationDTO {

    private long id;
    private String orgName;
    private String orgDesc;
    private String orgCode;
    private LocalDateTime createdDate;
}
