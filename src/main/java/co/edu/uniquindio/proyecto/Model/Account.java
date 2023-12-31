package co.edu.uniquindio.proyecto.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public class Account implements Serializable {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @Email
    @Column(length = 50, nullable = false, unique = true)
    private String email;

    @Column(length = 300, nullable = false)
    private String password;

    @OneToMany(mappedBy = "account")
    private List<Message>messageList;

}
