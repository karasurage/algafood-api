package com.algaworks.algafoodapi.core.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.validation.BindingResult;

@AllArgsConstructor
@Getter
public class ValidacaoException extends RuntimeException {

    private static final long serialVersionUID = -1398247489725750184L;

    private BindingResult bindingResult;

}
