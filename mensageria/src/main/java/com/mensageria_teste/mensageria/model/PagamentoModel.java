package com.mensageria_teste.mensageria.model;

import lombok.Data;

@Data
public class PagamentoModel {
    
    private String id;
    private String idUser;
    private String idProduct;
    private String cardNumber;

}
