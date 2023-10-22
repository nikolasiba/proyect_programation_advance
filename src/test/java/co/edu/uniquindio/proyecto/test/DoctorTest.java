package co.edu.uniquindio.proyecto.test;


import co.edu.uniquindio.proyecto.Dto.Doctor.AppointmentDocDTO;
import co.edu.uniquindio.proyecto.Exception.AppointmentException.AppointmentsNotFoundException;
import co.edu.uniquindio.proyecto.Model.Enum.AppointmentState;
import co.edu.uniquindio.proyecto.Repository.DoctorRepo;
import co.edu.uniquindio.proyecto.Services.Interfaces.DoctorServices;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.List;

@Sql(value = "/dataset.sql")
@Transactional
@SpringBootTest
public class DoctorTest {

    @Autowired
    private DoctorServices doctorServices;
    @Autowired
    private DoctorRepo doctorRepo;


    @Test
    public void listAppointment() {
        try {
            List<AppointmentDocDTO> appointmentDocDTOS = doctorServices.listAppointment(4);
            System.out.println(appointmentDocDTOS);
        } catch (AppointmentsNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void listPendingAppointments() {
        try {
            List<AppointmentDocDTO> appointmentDocDTOS = doctorServices.listPendingAppointments(4, AppointmentState.PENDING);
            System.out.println(appointmentDocDTOS);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void listSchedules() {

        try {
            List<AppointmentDocDTO> appointmentDocDTOS = doctorServices.listAppointment(4);
            System.out.println(appointmentDocDTOS);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void listFinishedAndCancelledAppointments() {
        try {
            List<AppointmentDocDTO> appointmentDocDTOS = doctorServices.listFinishedAndCancelledAppointments(4);
            if (appointmentDocDTOS.isEmpty()) {
                throw new AppointmentsNotFoundException("No se encontraron citas finalizadas o canceladas");
            }
            System.out.println(appointmentDocDTOS);
        } catch (AppointmentsNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
