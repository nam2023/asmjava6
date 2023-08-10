package poly.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.store.model.OrderDetail;

public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{
}