package com.dilso.desafio_simplificado.repository;

import com.dilso.desafio_simplificado.entity.WalletType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletTypeRepository extends JpaRepository<WalletType, Long> {
}
