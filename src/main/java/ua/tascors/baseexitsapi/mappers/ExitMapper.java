package ua.tascors.baseexitsapi.mappers;

import org.mapstruct.Mapper;
import ua.tascors.baseexitsapi.dto.ExitDto;
import ua.tascors.baseexitsapi.models.Exit;

import java.util.List;

@Mapper(componentModel = "spring", uses = { LocationMapper.class})
public interface ExitMapper {
    ExitDto toDto(Exit source);
    Exit toModel(ExitDto exitDto);
    List<ExitDto> toDto(List<Exit> source);
    List<Exit> toModel(List<ExitDto> exitDtos);
}