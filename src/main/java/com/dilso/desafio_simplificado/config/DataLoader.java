package com.dilso.desafio_simplificado.config;

import com.dilso.desafio_simplificado.entity.WalletType;
import com.dilso.desafio_simplificado.repository.WalletTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final WalletTypeRepository walletTypeRepository;

    public DataLoader(WalletTypeRepository walletTypeRepository) {
        this.walletTypeRepository = walletTypeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(WalletType.EnumWalletType.values())
                .forEach(walletType -> walletTypeRepository.save(walletType.get()));
    }
}
