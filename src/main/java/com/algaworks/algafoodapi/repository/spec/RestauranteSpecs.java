package com.algaworks.algafoodapi.repository.spec;

import com.algaworks.algafoodapi.domain.model.Restaurante;
import java.math.BigDecimal;
import org.springframework.data.jpa.domain.Specification;


public class RestauranteSpecs {

	public static Specification<Restaurante> comFreteGratis() {
		return (root, query, builder) -> 
			builder.equal(root.get("taxaFrete"), BigDecimal.ZERO);
	}
	
	public static Specification<Restaurante> comNomeSemelhante(String nome) {
		return (root, query, builder) ->
			builder.like(root.get("nome"), "%" + nome + "%");
	}
	
}
