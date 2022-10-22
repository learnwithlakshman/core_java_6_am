package com.careerit.cj.yaml;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TenantConfiguration {

    private String tenantName;
    private String email;
    private String location;

}
