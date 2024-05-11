package dev.patika.ecommerce.business.concretes;

import dev.patika.ecommerce.business.abstracts.IProductService;
import dev.patika.ecommerce.core.config.modelMapper.IModelMapperService;
import dev.patika.ecommerce.core.exeption.NotFoundException;
import dev.patika.ecommerce.core.result.ResultData;
import dev.patika.ecommerce.core.utilies.Msg;
import dev.patika.ecommerce.core.utilies.ResultHelper;
import dev.patika.ecommerce.dao.ProductRepo;
import dev.patika.ecommerce.dto.request.category.CategorySaveRequest;
import dev.patika.ecommerce.dto.request.product.ProductSaveRequest;
import dev.patika.ecommerce.dto.response.category.CategoryResponse;
import dev.patika.ecommerce.dto.response.product.ProductResponse;
import dev.patika.ecommerce.entities.Category;
import dev.patika.ecommerce.entities.Product;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Service
public class ProductManager implements IProductService {

    private  final ProductRepo productRepo;


    public ProductManager(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product save(Product product) {
        return this.productRepo.save(product);
    }

    @Override
    public Product get(int id) {
        return this.productRepo.findById(id).orElseThrow(() -> new NotFoundException(Msg.NOT_FOUND));
    }

    @Override
    public Page<Product> cursor(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page,pageSize);
        return this.productRepo.findAll(pageable);
    }

    @Override
    public Product update(Product product) {
        this.get(product.getId());
        return  this.productRepo.save(product);
    }


    @Override
    public boolean delete(int id) {
        Product product =this.get(id);
        this.productRepo.delete(product);
        return true;
    }


}
