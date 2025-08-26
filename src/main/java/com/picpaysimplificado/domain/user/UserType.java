package com.picpaysimplificado.domain.user;

import org.springframework.boot.jdbc.metadata.CommonsDbcp2DataSourcePoolMetadata;

public enum UserType {
    // COMMOM para usuário comuns e MERCHANT  para lojistas
    //No desafio especifica os dois e que cada um tem seus métodos, por exemplo,lojistas não fazem transferências, mas apenas recebem
    COMMOM,
    MERCHANT
}
