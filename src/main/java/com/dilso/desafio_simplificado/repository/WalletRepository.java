package com.dilso.desafio_simplificado.repository;

import com.dilso.desafio_simplificado.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Long> {
}
