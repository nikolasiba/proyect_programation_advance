package co.edu.uniquindio.proyecto.Repository;

import co.edu.uniquindio.proyecto.Model.Appointment;
import co.edu.uniquindio.proyecto.Model.Enum.AppointmentState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepo extends JpaRepository<Appointment,Integer> {

    List<Appointment>findAllByAppointmentState(AppointmentState appointmentState);
    List<Appointment>findAllByPatientCode(int code);
    List<Appointment>findAllByDoctorCode(int code);


}
