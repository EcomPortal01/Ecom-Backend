package com.ecom.app.service;

import com.ecom.app.dto.ProductDetailsDto;
import com.ecom.app.dto.ProductDto;

public interface ProductService {

	ProductDto saveProduct(ProductDto productDto);

	ProductDetailsDto getAllProductDetails(Long subProductId);

}
