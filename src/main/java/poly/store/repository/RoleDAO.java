package poly.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import poly.store.model.Role;

public interface RoleDAO extends JpaRepository<Role, String> { }
