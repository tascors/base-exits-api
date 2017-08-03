package ua.tascors.baseexitsapi.mappers;

import org.mapstruct.Mapper;
import ua.tascors.baseexitsapi.dto.LocationDto;
import ua.tascors.baseexitsapi.models.Location;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LocationMapper {
    LocationDto toDto(Location source);
    Location toModel(LocationDto locationDto);
    List<LocationDto> toDto(List<Location> source);
    List<Location> toModel(List<LocationDto> locationDto);
}