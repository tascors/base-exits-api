package ua.tascors.baseexitsapi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ExitDto {
    private Long id;
    private String name;
    private String description;
    private LocationDto location;
}
