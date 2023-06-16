package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("impar")
public class AumentoImparServiceImpl implements AumentoService{

	@Override
	public BigDecimal incrementar(BigDecimal saldo) {
		// TODO Auto-generated method stub
		return saldo;
	}

}
