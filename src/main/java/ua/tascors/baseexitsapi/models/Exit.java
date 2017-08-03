package ua.tascors.baseexitsapi.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "exits")
public class Exit {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @ManyToOne
    private User user;
    @OneToOne(mappedBy = "exit")
    private Location location;
}