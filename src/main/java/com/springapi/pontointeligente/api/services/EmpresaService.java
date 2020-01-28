package com.springapi.pontointeligente.api.services;

import java.util.Optional;

import com.springapi.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um CNPJ
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Cadastra uma nova empresa no Banco de Dados
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	Empresa persistir(Empresa empresa);
	
}
