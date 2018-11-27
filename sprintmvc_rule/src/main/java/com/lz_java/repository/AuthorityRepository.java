package com.lz_java.repository;

import com.lz_java.entity.Authority;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends CrudRepository<Authority, String> {
    public Authority findById(String id);

    public void deleteById(String id);

    public PageImpl findAll(Pageable pageable);
}
