package ua.tascors.baseexitsapi.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;
    @Transient
    private String passwordConfirmation;
    private String firstName;
    private String lastName;
    private String avatar;
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<Exit> exits = new ArrayList<>();

    public User(String email, String password, String passwordConfirmation) {
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public User(String email, String password, String passwordConfirmation, String firstName,
                String lastName, String avatar, List<Exit> exits) {
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
        this.exits = exits;
    }
}
