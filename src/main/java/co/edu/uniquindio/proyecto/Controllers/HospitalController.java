package co.edu.uniquindio.proyecto.Controllers;

import co.edu.uniquindio.proyecto.Model.Enum.BloodType;
import co.edu.uniquindio.proyecto.Model.Enum.City;
import co.edu.uniquindio.proyecto.Model.Enum.Eps;
import co.edu.uniquindio.proyecto.Model.Enum.Specialization;
import co.edu.uniquindio.proyecto.Services.Interfaces.HospitalServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/hospital")
public class HospitalController {

    private final HospitalServices hospitalServices;

    @GetMapping("/get-listBloodType")
    public List<BloodType> listBloodType() {
        return hospitalServices.listBLoodType();
    }

    @GetMapping("/get-listCity")
    public List<City> listCity() {
        return hospitalServices.listCity();
    }

    @GetMapping("/get-listEps")
    public List<Eps> listEps() {
        return hospitalServices.listEps();
    }

    @GetMapping("/get-listSpecialization")
    public List<Specialization> listSpecialization() {
        return hospitalServices.listSpecialization();
    }

}
