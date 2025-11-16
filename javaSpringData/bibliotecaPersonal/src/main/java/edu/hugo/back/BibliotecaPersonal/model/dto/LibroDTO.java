package edu.hugo.back.BibliotecaPersonal.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record LibroDTO(
    String titulo,
    Long[] autorIds,
    String isbn,
    BigDecimal precio,
    String moneda,
    String editorial,
    LocalDate fechaLanzamiento
) {}