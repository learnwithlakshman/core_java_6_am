package com.carrerit.iplstats.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Component;

@Component
public final class IplstatUtil {

        private IplstatUtil(){}

        public static <T> T toDto(Object domain,Class<T> cls){
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.registerModule(new JavaTimeModule());
                return objectMapper.convertValue(domain, cls);
        }
        public static <T> T toDomain(Object dto,Class<T> cls){
                ObjectMapper objectMapper = new ObjectMapper();
                objectMapper.registerModule(new JavaTimeModule());
                return objectMapper.convertValue(dto, cls);
        }
}
