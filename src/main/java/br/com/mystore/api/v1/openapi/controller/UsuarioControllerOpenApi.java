package br.com.mystore.api.v1.openapi.controller;

import org.springframework.hateoas.CollectionModel;

import br.com.mystore.api.exceptionhandler.Problema;
import br.com.mystore.api.v1.model.UsuarioModel;
import br.com.mystore.api.v1.model.imput.SenhaInput;
import br.com.mystore.api.v1.model.imput.UsuarioComSenhaInput;
import br.com.mystore.api.v1.model.imput.UsuarioInput;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Usuários")
public interface UsuarioControllerOpenApi {

	@ApiOperation("Cadastra um usuário")
	@ApiResponses({
		@ApiResponse(code = 201, message = "Usuário cadastrado"),
	})
	UsuarioModel adicionar(
			@ApiParam(name = "corpo", value = "Representação de um novo usuário", required = true)
			UsuarioInput usuarioInput);

	@ApiOperation("Atualiza a senha de um usuário")
	@ApiResponses({
		@ApiResponse(code = 204, message = "Senha alterada com sucesso"),
		@ApiResponse(code = 404, message = "Usuário não encontrado", response = Problema.class)
	})
	void alterarSenha(
			@ApiParam(value = "ID do usuário", example = "1", required = true)
			Long usuarioId,
			
			@ApiParam(name = "corpo", value = "Representação de uma nova senha", 
				required = true)
			SenhaInput senha);
	
	@ApiOperation("Atualiza um usuário por ID")
	@ApiResponses({
		@ApiResponse(code = 200, message = "Usuário atualizado"),
		@ApiResponse(code = 404, message = "Usuário não encontrado", response = Problema.class)
	})
	UsuarioModel atualizar(
			@ApiParam(value = "ID do usuário", example = "1", required = true)
			Long usuarioId,
			
			@ApiParam(name = "corpo", value = "Representação de um usuário com os novos dados",
				required = true)
			UsuarioInput usuarioInput);


	@ApiOperation("Busca um usuário por ID")
	@ApiResponses({
		@ApiResponse(code = 400, message = "ID do usuário inválido", response = Problema.class),
		@ApiResponse(code = 404, message = "Usuário não encontrado", response = Problema.class)
	})
	UsuarioModel buscar(
			@ApiParam(value = "ID do usuário", example = "1", required = true)
			Long usuarioId);

	@ApiOperation("Cadastra um usuário")
	@ApiResponses({
		@ApiResponse(code = 201, message = "Senha cadastrada"),
	})
	UsuarioModel cadastrarSenha(
			@ApiParam(name = "corpo", value = "Representação de um usuário com código de acesso", required = true)
			UsuarioComSenhaInput usuarioComSenhaInput);
	
	@ApiOperation("Solicitar o código de acesso do usuário por e-mail")
	@ApiResponses({
		@ApiResponse(code = 400, message = "E-mail do usuário inválido", response = Problema.class),
		@ApiResponse(code = 404, message = "Usuário não encontrado", response = Problema.class)
	})
	UsuarioModel codigoAcesso(
			@ApiParam(value = "E-mail do usuário", example = "joao@mystore.com.br", required = true)
			String usuarioEmail);	
	
	@ApiOperation("Lista os usuários")
	CollectionModel<UsuarioModel> listar();

}