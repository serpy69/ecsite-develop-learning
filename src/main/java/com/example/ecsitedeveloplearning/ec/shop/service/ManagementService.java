package com.example.ecsitedeveloplearning.ec.shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecsitedeveloplearning.ec.shop.model.Product;
import com.example.ecsitedeveloplearning.ec.shop.repository.ManagementRepository;

@Service
public class ManagementService {
	
	@Autowired
	ManagementRepository managementRepository;
	
	// 商品情報全件取得
	public List<Product> findAll() {
		return managementRepository.findAll();
	}
	
	// 商品情報取得
		public Optional<Product> findOne(long id) {
			return managementRepository.findById(id);
		}
		
		// 商品情報追加
		public void insert(Product product) {
			System.out.println("insert : " + product);
			managementRepository.save(product);
		}
		
		// 商品情報削除
		public void delete(long id) {
			managementRepository.deleteById(id);
		}
		
		public Long getCount() {
			Long count = managementRepository.count();
			return count;
		}
	
	

}
