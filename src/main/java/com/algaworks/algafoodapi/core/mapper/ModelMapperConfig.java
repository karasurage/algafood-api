package com.algaworks.algafoodapi.core.mapper;

import com.algaworks.algafoodapi.api.model.RestauranteModel;
import com.algaworks.algafoodapi.domain.model.Restaurante;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        var modelMapper = new ModelMapper();

        modelMapper.createTypeMap(Restaurante.class, RestauranteModel.class)
                .addMapping(Restaurante::getTaxaFrete, RestauranteModel::setPrecoFrete);

        return modelMapper;
    }
}