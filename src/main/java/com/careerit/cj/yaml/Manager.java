package com.careerit.cj.yaml;

import lombok.extern.slf4j.Slf4j;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class Manager {
  private static Map<String, TenantConfiguration> map = null;

  public static void main(String[] args) {

        TenantConfiguration obj = getTenantDetails("NCET");
        log.info("{}",obj);
  }

  private static TenantConfiguration getTenantDetails(String tenantName) {

    loadTenantDetails();
    TenantConfiguration tenantConfiguration = map.get(tenantName);
    if (tenantConfiguration == null) {
      throw new IllegalArgumentException("Invalid tenant name " + tenantName);
    }
    return tenantConfiguration;
  }

  private static void loadTenantDetails() {
    if (map == null) {
      map = new HashMap<>();
      Yaml yaml = new Yaml(new Constructor(TenantConfiguration.class));
      InputStream inputStream = Manager.class
          .getResourceAsStream("/tenant-db-configuration.yaml");

      for (Object object : yaml.loadAll(inputStream)) {

        if (object instanceof TenantConfiguration) {
          TenantConfiguration obj = (TenantConfiguration) object;
           map.put(obj.getTenantName(), obj);
        }
      }
    }
  }
}
