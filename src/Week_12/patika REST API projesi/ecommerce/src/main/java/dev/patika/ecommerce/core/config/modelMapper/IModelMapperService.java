package dev.patika.ecommerce.core.config.modelMapper;

import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;

public interface IModelMapperService {

    ModelMapper forRequest();

    ModelMapper forResponse();

}
