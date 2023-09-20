package mjavith.ineuron.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import mjavith.ineuron.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
