package co.edu.uniquindio.proyecto.Model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
public class Attention implements Serializable {

    @Id
    private int code;

    @Lob
    @Column(length = 300)
    private String diagnosis;

    @Lob
    @Column(length = 300)
    private String treatment;

    @Lob
    @Column(length = 300)
    private String medicalNotes;

    @OneToOne
    private Appointment appointment;


}
