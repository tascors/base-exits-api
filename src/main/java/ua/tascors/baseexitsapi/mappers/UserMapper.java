package ua.tascors.baseexitsapi.mappers;

import org.mapstruct.Mapper;
import ua.tascors.baseexitsapi.dto.UserDto;
import ua.tascors.baseexitsapi.models.User;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User source);
    User toModel(UserDto dto);
    List<UserDto> toDto(List<User> source);
    List<User> toModel(List<UserDto> dtos);
}