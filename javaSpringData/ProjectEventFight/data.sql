INSERT INTO luchador (nombre, apodo, fecha_nacimiento, caracter, arte_marcial) VALUES
('Connor McGregor', 'The Notorious', '1988-07-14', 'LOCO', 'BOXEO'),
('Khabib Nurmagomedov', 'The Eagle', '1988-09-20', 'DEFENSIVO', 'JUDO'),
('Amanda Nunes', 'The Lioness', '1988-05-30', 'OFENSIVO', 'KICKBOXING'),
('Israel Adesanya', 'The Last Stylebender', '1989-07-22', 'OFENSIVO', 'TAEKWONDO'),
('Jon Jones', 'Bones', '1987-07-19', 'DEFENSIVO', 'KARATE'),
('Max Holloway', 'Blessed', '1991-12-04', 'OFENSIVO', 'BOXEO'),
('Charles Oliveira', 'Do Bronxs', '1989-10-17', 'DEFENSIVO', 'JUDO'),
('Valentina Shevchenko', 'Bullet', '1988-03-07', 'OFENSIVO', 'KICKBOXING');

INSERT INTO entrenador (nombre, comision, salario, luchador_id) VALUES
('John Kavanagh', 0.15, 8000.00, 1), -- Entrena a Connor McGregor (1)
('Javier Mendez', 0.12, 7500.00, 2), -- Entrena a Khabib Nurmagomedov (2)
('Mike Winkeljohn', 0.10, 6000.00, 5), -- Entrena a Jon Jones (5)
('Jason Parillo', 0.11, 6500.00, 3), -- Entrena a Amanda Nunes (3)
('Eugene Bareman', 0.13, 7800.00, 4), -- Entrena a Israel Adesanya (4)
('Rafael Cordeiro', 0.14, 8500.00, 7); -- Entrena a Charles Oliveira (7)

INSERT INTO pelea (luchador1_id, luchador2_id, estadio_id, taquilla, fecha_pelea) VALUES
(1, 2, 1, 15000000.50, '2018-10-06'), -- McGregor (1) vs Khabib (2) en T-Mobile Arena (1)
(3, 4, 2, 8000000.25, '2021-03-06'), -- Nunes (3) vs Adesanya (4) en MSG (2)
(5, 1, 3, 12000000.00, '2024-01-20'), -- Jones (5) vs McGregor (1) en O2 Arena (3)
(6, 7, 4, 6500000.00, '2023-09-16'), -- Holloway (6) vs Oliveira (7) en Jeunesse Arena (4)
(2, 5, 5, 18000000.75, '2022-07-30'), -- Khabib (2) vs Jones (5) en Etihad Arena (5)
(4, 3, 6, 7200000.00, '2023-01-21'), -- Adesanya (4) vs Nunes (3) en Rogers Arena (6)
(8, 6, 7, 9100000.50, '2024-05-18'); -- Shevchenko (8) vs Holloway (6) en Saitama (7)

INSERT INTO estadio (nombre, ciudad, pais, aforo) VALUES
('T-Mobile Arena', 'Las Vegas', 'USA', 20000),
('Madison Square Garden', 'New York', 'USA', 18500),
('O2 Arena', 'London', 'UK', 21000),
('Jeunesse Arena', 'Rio de Janeiro', 'Brasil', 15000),
('Etihad Arena', 'Abu Dhabi', 'EAU', 16800),
('Rogers Arena', 'Vancouver', 'Canadá', 18900),
('Saitama Super Arena', 'Saitama', 'Japón', 37000);

INSERT INTO contrato_luchador_entrenador (entrenador_id, luchador_id, fecha_inicio, fecha_fin) VALUES
(1, 1, '2010-01-01', NULL), -- John Kavanagh (1) con Connor McGregor (1) - Activo
(2, 2, '2012-05-15', NULL), -- Javier Mendez (2) con Khabib Nurmagomedov (2) - Activo
(3, 5, '2015-11-20', '2023-12-31'), -- Mike Winkeljohn (3) con Jon Jones (5) - Finalizado
(4, 3, '2017-03-01', NULL), -- Jason Parillo (4) con Amanda Nunes (3) - Activo
(5, 4, '2018-06-10', NULL), -- Eugene Bareman (5) con Israel Adesanya (4) - Activo
(6, 7, '2019-02-01', NULL), -- Rafael Cordeiro (6) con Charles Oliveira (7) - Activo
(1, 5, '2024-01-01', NULL); -- John Kavanagh (1) con Jon Jones (5) - Nuevo contrato, Activo