package com.sprinboot20.app.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserRest {

	@JsonProperty("id usuario")
	private Long id;

	@JsonProperty("nombre completo")
	private String name;

	@JsonProperty("email")
	private String email;

	@JsonProperty("habilitado")
	private boolean enabled;
}
