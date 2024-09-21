package julianaalves.rest;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.request;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class OlaMundoTest {
	@Test

	public void testOlaMundo() {
		Response response = request(Method.GET, "https://restapi.wcaquino.me/ola");
		Assert.assertTrue(response.getBody().asString().equals("Ola Mundo!"));
		Assert.assertTrue(response.statusCode() == 200);
		Assert.assertTrue("O status code deveria ser 200 ", response.statusCode() == 200);
		Assert.assertEquals(200, response.statusCode());

		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);

	}

	@Test
	public void devoConhecerOutrasFormasRestAssured() {
//		1ª opção: Forma mais prolixa de escrever a requisição de teste
		Response response = request(Method.GET, "https://restapi.wcaquino.me/ola");
		ValidatableResponse validacao = response.then();
		validacao.statusCode(200);

//		2ª opção: Forma mais simplificada de escrever a requisição de teste
		get("https://restapi.wcaquino.me/ola").then().statusCode(200);

//		3ª opção: Forma ideal de escrever a requisição de teste (Given, When, Then)
		given() //(Pré condições) Dado que, ao fazer uma requisição, 
		.when() //(Ação de Fato, o que será realizado) Quando eu fizer uma requisição para a página https://restapi.wcaquino.me/ola
			.get("https://restapi.wcaquino.me/ola")
		.then() //(São as verificações, as Assertivas) Então o meu status code deverá ser 200
//			.assertThat() Então verifique que 
			.statusCode(200); // O status code é 200
	}

}
