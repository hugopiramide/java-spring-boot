package edu.hugo.back.BibliotecaPersonal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import edu.hugo.back.BibliotecaPersonal.model.Libro;
import edu.hugo.back.BibliotecaPersonal.model.dto.LibroDTO;

@Mapper(componentModel = "spring")
public interface ILibroMapper {

    @Mapping(target = "isbn", expression = "java(new Isbn(dto.isbn()))")
    @Mapping(target = "precio", expression = "java(new Money(dto.precio(), dto.moneda()))")
    Libro toEntity(LibroDTO dto);

    @Mapping(source = "isbn.value", target = "isbn")
    @Mapping(source = "precio.mount", target = "precio")
    @Mapping(source = "precio.currency", target = "moneda")
    LibroDTO toDto(Libro libro);

    @Mapping(target = "isbn", expression = "java(new Isbn(dto.isbn()))")
    @Mapping(target = "precio", expression = "java(new Money(dto.precio(), dto.moneda()))")
    void updateLibroFromDto(LibroDTO dto, @MappingTarget Libro entity);
}
