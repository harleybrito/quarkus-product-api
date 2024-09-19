package org.acme.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.acme.dto.ProductDTO;
import org.acme.entity.ProductEntity;
import org.acme.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ProductService {
    @Inject
    ProductRepository productRepository;

    public List<ProductDTO> getAllProducts (){
        List<ProductDTO> products = new ArrayList<>();
        this.productRepository.findAll().stream().forEach(item -> {
            products.add(this.entityToDTO(item));
        });
        return products;
    }

    public ProductDTO findById(Long id) {
        ProductEntity productEntity = this.productRepository.findById(id);
        return this.entityToDTO(productEntity);
    }

    public void createNewProduct(ProductDTO productDTO) {
        this.productRepository.persist(this.DTOToEntity(productDTO));
    }

    public void deleteProduct(Long id) {
        this.productRepository.deleteById(id);
    }

    public void changeProduct(Long id, ProductDTO productDTO) {
        ProductEntity productEntity = this.productRepository.findById(id);
        productEntity.setName(productDTO.getName());
        productEntity.setPrice(productDTO.getPrice());
        productEntity.setDescription(productDTO.getDescription());
        productEntity.setCategory(productDTO.getCategory());
        productEntity.setModel(productDTO.getModel());
        this.productRepository.persist(productEntity);
    }

    private ProductEntity DTOToEntity(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(productDTO.getName());
        productEntity.setPrice(productDTO.getPrice());
        productEntity.setDescription(productDTO.getDescription());
        productEntity.setCategory(productDTO.getCategory());
        productEntity.setModel(productDTO.getModel());
        return productEntity;
    }

    private ProductDTO entityToDTO(ProductEntity productEntity) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(productEntity.getId());
        productDTO.setCategory(productEntity.getCategory());
        productDTO.setName(productEntity.getName());
        productDTO.setPrice(productEntity.getPrice());
        productDTO.setDescription(productEntity.getDescription());
        productDTO.setModel(productEntity.getModel());
        return productDTO;
    }
}
