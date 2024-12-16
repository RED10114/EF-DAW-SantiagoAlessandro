package pe.edu._8.ef_santiago_duran_alessandro.response;

import pe.edu._8.ef_santiago_duran_alessandro.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
