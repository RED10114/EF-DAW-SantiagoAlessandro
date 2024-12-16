package pe.edu._8.ef_santiago_duran_alessandro.response;

import pe.edu._8.ef_santiago_duran_alessandro.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
