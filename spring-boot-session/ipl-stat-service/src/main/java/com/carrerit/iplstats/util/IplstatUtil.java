package com.carrerit.iplstats.util;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class IplstatUtil {

        private IplstatUtil(){}

        public static <T> T toDto(Object domain,Class<T> cls){
                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.convertValue(domain, cls);
        }
        public static <T> T toDomain(Object dto,Class<T> cls){
                ObjectMapper objectMapper = new ObjectMapper();
                return objectMapper.convertValue(dto, cls);
        }
}
