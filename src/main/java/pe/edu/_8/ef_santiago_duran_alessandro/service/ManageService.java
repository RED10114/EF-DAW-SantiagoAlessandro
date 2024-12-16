package pe.edu._8.ef_santiago_duran_alessandro.service;

import pe.edu._8.ef_santiago_duran_alessandro.dto.CarDetailDto;
import pe.edu._8.ef_santiago_duran_alessandro.dto.CarDto;
import pe.edu._8.ef_santiago_duran_alessandro.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto CarDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;
}
