package com.elitech.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthRequest {
@NotBlank(message="username obligatoire")
private String userName;
@NotBlank(message="password obligatoire")
private String password;
}
