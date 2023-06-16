package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service("par")
public class AumentoParServiceImpl implements AumentoService{

	@Override
	public BigDecimal incrementar(BigDecimal saldo) {
		BigDecimal comision = saldo.multiply(new BigDecimal(.05));
		
		return saldo.add(comision);
	}

}
