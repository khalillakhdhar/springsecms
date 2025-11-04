package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dto.UserDTO;
import com.elitech.entities.Role;

public class RoleMapper {
	private static final ModelMapper modelMapper = new ModelMapper();
	public static UserDTO convertToDTO(Role role)
	{
		return modelMapper.map(role, UserDTO.class);
		
	}
	public static Role convertToEntity(UserDTO roleDTO)
	{
		return modelMapper.map(roleDTO, Role.class);
		
	}
}
