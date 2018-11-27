package com.lz_java.repository;

import com.lz_java.entity.Role;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
    public Role findById(String id);

    public void deleteById(String id);

    public PageImpl findAll(Pageable pageable);
}
