package com.sonata.mvc.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.mvc.model.Carts;

@Repository
public interface CartRepository extends JpaRepository <Carts, Long> {

}
