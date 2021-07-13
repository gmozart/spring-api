package com.springapi.crm.model;


import javax.persistence.GeneratedValue;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor //Cria os construtores com os argumentos
@NoArgsConstructor //Cria os construtores sem os argumentos
public class User {
	
	private Long id;
	private String name;
	private String username;

	
}
