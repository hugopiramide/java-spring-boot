-- ===========================
-- 🔹 TABLA: ENTRENADOR
-- ===========================
INSERT INTO entrenador (comison, salario, nombre)
VALUES
(0.10, 5000, 'Jorge Morales'),
(0.15, 5500, 'Raúl Jiménez'),
(0.12, 4800, 'Pedro Sánchez'),
(0.18, 6000, 'Héctor Díaz'),
(0.14, 5300, 'Fernando Pérez'),
(0.11, 5100, 'Miguel López');

-- ===========================
-- 🔹 TABLA: LUCHADOR
-- ===========================
INSERT INTO luchador (luchador_id,arte_marcial, fecha_nacimiento, apodo, nombre, caracter,entrenador_id)
VALUES
(1,0, '1990-04-15', 'El Santo', 'Rodolfo Guzmán', 'OFENSIVO', 1),
(2,1, '1987-09-22', 'Blue Demon', 'Alejandro Muñoz', 'DEFENSIVO', 2),
(3,2, '1995-12-10', 'Rey Misterio', 'Óscar Gutiérrez', 'LOCO', 4),
(4,3, '1992-03-05', 'La Bestia', 'Carlos Mendoza', 'OFENSIVO', 3),
(5,4, '1989-07-30', 'El Tigre', 'Manuel Torres', 'DEFENSIVO', 5),
(6,5, '1993-01-11', 'El Fantasma', 'Luis Ortega', 'LOCO', 6);

-- ===========================
-- 🔹 TABLA: CONTRATO_LUCHADOR_ENTRENADOR
-- ===========================
INSERT INTO contrato_luchador_entrenador (fecha_inicio, fecha_fin, entrenador_id, luchador_id)
VALUES
('2020-01-01', '2022-12-31', 1, 1),
('2021-03-10', '2023-03-10', 2, 2),
('2019-07-01', '2021-07-01', 3, 3),
('2022-02-15', '2024-02-15', 4, 4),
('2020-05-20', '2022-05-20', 5, 5),
('2023-01-01', NULL, 6, 6);

-- ===========================
-- 🔹 TABLA: ESTADIO
-- ===========================
INSERT INTO estadio (aforo, ciudad, nombre, pais)
VALUES
(15000, 'Ciudad de México', 'Arena México', 'México'),
(12000, 'Guadalajara', 'Coliseo Jalisco', 'México'),
(18000, 'Monterrey', 'Estadio Regio', 'México'),
(22000, 'Buenos Aires', 'Estadio Libertador', 'Argentina'),
(25000, 'Miami', 'American Airlines Arena', 'EEUU'),
(30000, 'Tokio', 'Saitama Super Arena', 'Japón');

-- ===========================
-- 🔹 TABLA: PELEA
-- ===========================
INSERT INTO pelea (luchador1_id, luchador2_id, fecha_pelea, estadio_id, taquilla) VALUES 
(1, 2, '2024-10-20', 1, 150000.00),
(3, 4, '2024-11-05', 2, 95000.50),
(5, 1, '2025-01-15', 1, 200000.00),
(2, 3, '2025-02-28', 2, 80000.75),
(4, 5, '2025-05-01', 1, 125500.25);