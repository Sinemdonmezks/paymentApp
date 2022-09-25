package com.sinem.paymentApp.repository;

import com.sinem.paymentApp.repository.entity.Home;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<Home,Long> {

}
