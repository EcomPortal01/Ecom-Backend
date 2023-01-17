package com.ecom.app.service;

import java.util.List;

import com.ecom.app.dto.ParentProductDto;
import com.ecom.app.module.ParentProduct;

public interface ProductService {

	List<ParentProductDto> getAllParentProduct();

	ParentProduct saveParentProduct(ParentProductDto parentProduct);

}
