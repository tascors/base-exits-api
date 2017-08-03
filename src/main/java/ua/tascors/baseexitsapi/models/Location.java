package ua.tascors.baseexitsapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "locations")
public class Location {
    @Id
    @GeneratedValue
    private Long id;
    private Long latitude;
    private Long longitude;
    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "exit_id")
    private Exit exit;
}