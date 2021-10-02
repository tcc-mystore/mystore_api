package br.com.mystore.api.v1.openapi.controller;

import io.swagger.annotations.Api;

@Api(tags = "Produtos")
public interface EmpresaProdutoControllerOpenApi {

//	@ApiOperation("Lista os produtos de um empresa")
//	@ApiResponses({
//		@ApiResponse(code = 400, message = "ID do empresa inválido", response = Problema.class),
//		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problema.class)
//	})
//	CollectionModel<ProdutoModel> listar(
//			@ApiParam(value = "ID do empresa", example = "1", required = true)
//			Long empresaId,
//			
//			@ApiParam(value = "Indica se deve ou não incluir produtos inativos no resultado da listagem", 
//				example = "false", defaultValue = "false")
//			Boolean incluirInativos);
//
//	@ApiOperation("Busca um produto de um empresa")
//	@ApiResponses({
//		@ApiResponse(code = 400, message = "ID do empresa ou produto inválido", response = Problema.class),
//		@ApiResponse(code = 404, message = "Produto de empresa não encontrado", response = Problema.class)
//	})
//	ProdutoModel buscar(
//			@ApiParam(value = "ID do empresa", example = "1", required = true)
//			Long empresaId,
//			
//			@ApiParam(value = "ID do produto", example = "1", required = true)
//			Long produtoId);
//
//	@ApiOperation("Cadastra um produto de um empresa")
//	@ApiResponses({
//		@ApiResponse(code = 201, message = "Produto cadastrado"),
//		@ApiResponse(code = 404, message = "Restaurante não encontrado", response = Problema.class)
//	})
//	ProdutoModel adicionar(
//			@ApiParam(value = "ID do empresa", example = "1", required = true)
//			Long empresaId,
//			
//			@ApiParam(name = "corpo", value = "Representação de um novo produto", required = true)
//			ProdutoInput produtoInput);
//
//	@ApiOperation("Atualiza um produto de um empresa")
//	@ApiResponses({
//		@ApiResponse(code = 200, message = "Produto atualizado"),
//		@ApiResponse(code = 404, message = "Produto de empresa não encontrado", response = Problema.class)
//	})
//	ProdutoModel atualizar(
//			@ApiParam(value = "ID do empresa", example = "1", required = true)
//			Long empresaId,
//			
//			@ApiParam(value = "ID do produto", example = "1", required = true)
//			Long produtoId,
//			
//			@ApiParam(name = "corpo", value = "Representação de um produto com os novos dados", 
//				required = true)
//			ProdutoInput produtoInput);

}