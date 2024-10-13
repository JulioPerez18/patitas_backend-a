package pe.edu.cibertec.patitas_backend_a.dto;

public record LoginRequestDTO(String tipoDocumento, String numeroDocumento, String password) {
}
