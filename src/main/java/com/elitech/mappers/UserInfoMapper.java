package com.elitech.mappers;

import org.modelmapper.ModelMapper;

import com.elitech.dto.UserDTO;
import com.elitech.entities.UserInfo;

public class UserInfoMapper {
	private static final ModelMapper modelMapper = new ModelMapper();
	public static UserDTO convertToDTO(UserInfo userInfo)
	{
		return modelMapper.map(userInfo, UserDTO.class);
		
	}
	public static UserInfo convertToEntity(UserDTO userInfoDTO)
	{
		return modelMapper.map(userInfoDTO, UserInfo.class);
		
	}
}
