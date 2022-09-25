package com.sinem.paymentApp.repository;

import com.sinem.paymentApp.repository.entity.PaymentDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDetailRepository extends JpaRepository<PaymentDetail,Long> {
}
