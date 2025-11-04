package com.elitech.dto;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})

public class UserDTO {
private long id;
@NotBlank(message = "le nom est obligatoire")
private String name;
@Email(message =  "veuillez saisir un email valide")
@NotBlank(message = "le email est obligatoire")
private String email;
@NotBlank(message = "le mot de passe est obligatoire")
@Size(min = 6, message = "le mot de passe doit comporter au moins 6 caractéres")
private String password;
@JsonIgnoreProperties("users") // serialization
private Set<RoleDTO> roles;

}
