package poly.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.store.model.Category;

public interface CategoryDAO extends JpaRepository<Category, String>{
}
