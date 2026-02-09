ALTER TABLE product CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
ALTER TABLE category CONVERT TO CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- =============================================================================
-- 1. CATEGORÍAS (40 registros)
-- =============================================================================
INSERT INTO category (id, name, description) VALUES 
(1, 'Running', 'Calzado y ropa técnica para corredores de alto rendimiento.'),
(2, 'Lifestyle', 'Moda urbana y calzado icónico para el día a día.'),
(3, 'Basketball', 'Equipamiento oficial para la cancha y estilo NBA.'),
(4, 'Training', 'Ropa y calzado para gimnasio y entrenamiento funcional.'),
(5, 'Soccer', 'Botas de fútbol y equipaciones de clubes internacionales.'),
(6, 'Tennis', 'Ropa y calzado de alto rendimiento para todas las superficies.'),
(7, 'Skateboarding', 'Línea Nike SB diseñada para patinadores profesionales.'),
(8, 'Yoga', 'Prendas elásticas y cómodas para máxima movilidad.'),
(9, 'Golf', 'Equipamiento elegante y técnico para el campo de golf.'),
(10, 'ACG', 'All Conditions Gear: equipo para exteriores y montaña.'),
(11, 'Jordan', 'La marca mítica inspirada en Michael Jordan.'),
(12, 'Trail Running', 'Calzado con tracción extrema para terrenos difíciles.'),
(13, 'Swimming', 'Bañadores y accesorios de natación de secado rápido.'),
(14, 'Accessories', 'Mochilas, gorras, guantes y calcetines técnicos.'),
(15, 'Kids', 'Productos específicos para atletas infantiles.'),
(16, 'Walking', 'Calzado diseñado para la máxima comodidad al caminar.'),
(17, 'Fleece', 'Prendas térmicas de tejido suave Tech Fleece.'),
(18, 'Sustainable', 'Productos fabricados con al menos un 20% de material reciclado.'),
(19, 'Custom', 'Productos personalizables a través de Nike By You.'),
(20, 'Vaporfly', 'La élite de las zapatillas de competición con placa de carbono.'),
(21, 'Baseball', 'Tacos y equipamiento para el diamante.'),
(22, 'Softball', 'Calzado y ropa específica para jugadoras de softball.'),
(23, 'Lacrosse', 'Equipación técnica para alta velocidad en lacrosse.'),
(24, 'Volleyball', 'Calzado con amortiguación para saltos constantes.'),
(25, 'Boxing', 'Botas de boxeo ligeras y con gran soporte de tobillo.'),
(26, 'Weightlifting', 'Zapatillas de halterofilia con talón rígido.'),
(27, 'Cycling', 'Calzado para ciclismo de interior y exterior.'),
(28, 'Maternity', 'Ropa deportiva diseñada para todas las etapas del embarazo.'),
(29, 'Plus Size', 'Colección de tallas grandes con ajuste deportivo.'),
(30, 'Vintage', 'Modelos retro recuperados de los archivos de Nike.'),
(31, 'Fan Gear', 'Merchandising oficial de selecciones y equipos.'),
(32, 'Rugby', 'Botas con tacos reforzados para máxima tracción.'),
(33, 'Dance', 'Ropa flexible y moderna para coreografías.'),
(34, 'Recovery', 'Calzado y ropa para después de entrenar.'),
(35, 'Sandals', 'Chanclas y sandalias para piscina o descanso.'),
(36, 'Boots', 'Botas de invierno Nike con protección contra el frío.'),
(37, 'Collaboration', 'Ediciones limitadas diseñadas con artistas y marcas.'),
(38, 'High Fashion', 'Línea de lujo que fusiona pasarela y deporte.'),
(39, 'Winter Sports', 'Capas base térmicas para deportes de nieve.'),
(40, 'Gymnastics', 'Mallas y bodies de alta flexibilidad.');

-- =============================================================================
-- 2. PRODUCTOS (40 registros)
-- =============================================================================
INSERT INTO product (id, name, description, base_price, active, image_url, category_id) VALUES 
(1, 'Nike Air Max 270', 'Icónica unidad Air para comodidad urbana.', 150.0, 1, 'https://images.unsplash.com/photo-1542291026-7eec264c27ff?auto=format&fit=crop&w=600&q=80', 2),
(2, 'Nike Pegasus 40', 'Amortiguación reactiva para corredores diarios.', 130.0, 1, 'https://images.unsplash.com/photo-1549298916-b41d501d3772?auto=format&fit=crop&w=600&q=80', 1),
(3, 'Nike Dunk Low', 'Estilo clásico de los 80 para la calle.', 110.0, 1, 'https://images.unsplash.com/photo-1600185365483-26d7a4cc7519?auto=format&fit=crop&w=600&q=80', 7),
(4, 'Nike Metcon 9', 'Estabilidad máxima para levantamientos pesados.', 140.0, 1, 'https://images.unsplash.com/photo-1539185441755-769473a23570?auto=format&fit=crop&w=600&q=80', 4),
(5, 'Mercurial Superfly 9', 'Velocidad explosiva para campos de fútbol.', 270.0, 1, 'https://images.unsplash.com/photo-1511886929837-354d827aae26?auto=format&fit=crop&w=600&q=80', 5),
(6, 'Air Force 1 07', 'La leyenda del baloncesto en tus pies.', 120.0, 1, 'https://images.unsplash.com/photo-1595950653106-6c9ebd614d3a?auto=format&fit=crop&w=600&q=80', 2),
(7, 'LeBron XXI', 'Protección contra impactos para jugadores potentes.', 200.0, 1, 'https://images.unsplash.com/photo-1579338559194-a162d19bf842?auto=format&fit=crop&w=600&q=80', 3),
(8, 'Vaporfly NEXT% 3', 'Zapatillas para romper récords personales.', 260.0, 1, 'https://images.unsplash.com/photo-1460353581641-37baddab0fa2?auto=format&fit=crop&w=600&q=80', 20),
(9, 'Nike Tech Fleece Hoodie', 'Sudadera ligera de máxima calidez.', 110.0, 1, 'https://images.unsplash.com/photo-1556821840-3a63f95609a7?auto=format&fit=crop&w=600&q=80', 17),
(10, 'ACG Mountain Fly 2', 'Tracción y protección en cualquier sendero.', 180.0, 1, 'https://images.unsplash.com/photo-1551107696-a4b0c5a0d9a2?auto=format&fit=crop&w=600&q=80', 10),
(11, 'Air Jordan 1 High OG', 'El comienzo de una era en el calzado.', 180.0, 1, 'https://images.unsplash.com/photo-1552346154-21d32810aba3?auto=format&fit=crop&w=600&q=80', 11),
(12, 'Nike Wildhorse 8', 'Resistencia y agarre para el trail running.', 135.0, 1, 'https://images.unsplash.com/photo-1538233412743-917a46c73ee1?auto=format&fit=crop&w=600&q=80', 12),
(13, 'Nike Pro Leggings', 'Capa base de alto rendimiento.', 55.0, 1, 'https://images.unsplash.com/photo-1506152983158-b4a74a01c721?auto=format&fit=crop&w=600&q=80', 8),
(14, 'Zoom Court NXT', 'Velocidad y agilidad en la pista de tenis.', 155.0, 1, 'https://images.unsplash.com/photo-1612450865753-5bb8d79e1c34?auto=format&fit=crop&w=600&q=80', 6),
(15, 'Golf Victory Polo', 'Comodidad transpirable para 18 hoyos.', 45.0, 1, 'https://images.unsplash.com/photo-1587151711096-23c51fcd2d9c?auto=format&fit=crop&w=600&q=80', 9),
(16, 'Nike SB Ishod', 'Diseño moderno para el skate técnico.', 105.0, 1, 'https://images.unsplash.com/photo-1549103684-247dd883d38e?auto=format&fit=crop&w=600&q=80', 7),
(17, 'Nike Swim Briefs', 'Diseño hidrodinámico para competición.', 35.0, 1, 'https://images.unsplash.com/photo-1519046904884-53103b34b206?auto=format&fit=crop&w=600&q=80', 13),
(18, 'Nike Elite Socks', 'Amortiguación estratégica para baloncesto.', 18.0, 1, 'https://images.unsplash.com/photo-1582555172866-f73bb12a2ab3?auto=format&fit=crop&w=600&q=80', 14),
(19, 'Nike Star Runner Kids', 'Fáciles de poner para pequeños atletas.', 45.0, 1, 'https://images.unsplash.com/photo-1514989940723-e8e51635b782?auto=format&fit=crop&w=600&q=80', 15),
(20, 'Nike React Phantom', 'Zapatilla de running sin cordones.', 150.0, 1, 'https://images.unsplash.com/photo-1587563871167-1ee9c731aefb?auto=format&fit=crop&w=600&q=80', 1),
(21, 'Nike Invincible 3', 'Espuma ZoomX para máxima amortiguación.', 190.0, 1, 'https://images.unsplash.com/photo-1606107557195-0e29a4b5b4aa?auto=format&fit=crop&w=600&q=80', 1),
(22, 'Nike Blazer Mid 77', 'Estilo vintage de baloncesto.', 105.0, 1, 'https://images.unsplash.com/photo-1605348532760-6753d2c41324?auto=format&fit=crop&w=600&q=80', 30),
(23, 'Air Max Plus', 'Estilo Tuned Air agresivo.', 185.0, 1, 'https://images.unsplash.com/photo-1514444917583-e455b51c705c?auto=format&fit=crop&w=600&q=80', 2),
(24, 'Alphafly NEXT% 2', 'La cima de la tecnología de maratón.', 300.0, 1, 'https://images.unsplash.com/photo-1491553895911-0055eca6402d?auto=format&fit=crop&w=600&q=80', 20),
(25, 'Air Jordan 4 Retro', 'Detalles icónicos y soporte premium.', 210.0, 1, 'https://images.unsplash.com/photo-1597043540263-737721849a21?auto=format&fit=crop&w=600&q=80', 11),
(26, 'Nike Free Metcon 5', 'Flexibilidad para saltos y sprints.', 125.0, 1, 'https://images.unsplash.com/photo-1543163521-1bf539c55dd2?auto=format&fit=crop&w=600&q=80', 4),
(27, 'Nike Cortez', 'El diseño que lanzó a Nike a la fama.', 95.0, 1, 'https://images.unsplash.com/photo-1603808033192-082d6919d3e1?auto=format&fit=crop&w=600&q=80', 30),
(28, 'Nike Zegama Trail', 'Reactividad en terrenos técnicos.', 165.0, 1, 'https://images.unsplash.com/photo-1534067783941-51c9c23ecefd?auto=format&fit=crop&w=600&q=80', 12),
(29, 'Nike One Leggings', 'Versatilidad para cualquier entrenamiento.', 60.0, 1, 'https://images.unsplash.com/photo-1515886657613-9f3515b0c78f?auto=format&fit=crop&w=600&q=80', 8),
(30, 'Air Max 90', 'Cojín de aire clásico y durabilidad.', 140.0, 1, 'https://images.unsplash.com/photo-1521903062400-b80a2bb8cb3d?auto=format&fit=crop&w=600&q=80', 2),
(31, 'Kyrie Infinity', 'Control total para cambios de dirección.', 140.0, 1, 'https://images.unsplash.com/photo-1508609349937-5ec4ae374ebf?auto=format&fit=crop&w=600&q=80', 3),
(32, 'Nike Phantom Luna', 'Botas diseñadas para el fútbol femenino.', 280.0, 1, 'https://images.unsplash.com/photo-1511886929837-354d827aae26?auto=format&fit=crop&w=600&q=80', 5),
(33, 'Nike Romaleos 4', 'Base ancha para levantamiento olímpico.', 200.0, 1, 'https://images.unsplash.com/photo-1526506118085-60ce8714f8c5?auto=format&fit=crop&w=600&q=80', 26),
(34, 'Nike SB Dunk High', 'Versión alta del clásico del skate.', 125.0, 1, 'https://images.unsplash.com/photo-1520250497591-112f2f40a3f4?auto=format&fit=crop&w=600&q=80', 7),
(35, 'Nike Victori One', 'La chancla esencial para el descanso.', 35.0, 1, 'https://images.unsplash.com/photo-1603487742131-4160ec999306?auto=format&fit=crop&w=600&q=80', 35),
(36, 'Nike Structure 25', 'Soporte estable para sobrepronadores.', 140.0, 1, 'https://images.unsplash.com/photo-1516478177764-9fe5bd7e9717?auto=format&fit=crop&w=600&q=80', 1),
(37, 'Nike Vomero 17', 'Amortiguación premium para largas distancias.', 170.0, 1, 'https://images.unsplash.com/photo-1571008887538-b36bb32f4571?auto=format&fit=crop&w=600&q=80', 1),
(38, 'Nike Air Max Dawn', 'Inspiración en el running vintage.', 115.0, 1, 'https://images.unsplash.com/photo-1605408499391-6368c628ef42?auto=format&fit=crop&w=600&q=80', 30),
(39, 'Air Jordan 11 Retro', 'El equilibrio perfecto entre elegancia y deporte.', 230.0, 1, 'https://images.unsplash.com/photo-1597043540263-737721849a21?auto=format&fit=crop&w=600&q=80', 11),
(40, 'Nike Storm-FIT Jacket', 'Chaqueta resistente al viento y la lluvia.', 120.0, 1, 'https://images.unsplash.com/photo-1591047139829-d91aec96caea?auto=format&fit=crop&w=600&q=80', 14);

-- =============================================================================
-- 3. VARIANTES DE PRODUCTO (40 registros)
-- =============================================================================
INSERT INTO product_variant (id, product_id, size, stock, price_modifier) VALUES 
(1, 1, '42', 45, 0.0), (2, 2, '41', 120, 0.0), (3, 3, '43', 15, 10.0), (4, 4, '40', 25, 0.0),
(5, 5, '44', 10, 25.0), (6, 6, '42', 300, 0.0), (7, 7, '45', 20, 0.0), (8, 8, '42', 8, 40.0),
(9, 9, 'M', 60, 0.0), (10, 10, '43', 14, 0.0), (11, 11, '44', 5, 60.0), (12, 12, '41', 30, 0.0),
(13, 13, 'S', 80, 0.0), (14, 14, '42', 20, 0.0), (15, 15, 'L', 40, 0.0), (16, 16, '40', 22, 0.0),
(17, 17, 'M', 55, 0.0), (18, 18, 'L', 500, 0.0), (19, 19, '32', 50, 0.0), (20, 20, '42', 12, 0.0),
(21, 21, '43', 35, 0.0), (22, 22, '44', 30, 0.0), (23, 23, '42', 18, 5.0), (24, 24, '42', 6, 50.0),
(25, 25, '45', 10, 70.0), (26, 26, '40', 25, 0.0), (27, 27, '42', 45, 0.0), (28, 28, '43', 20, 0.0),
(29, 29, 'XS', 70, 0.0), (30, 30, '41', 40, 0.0), (31, 31, '44', 25, 0.0), (32, 32, '42', 15, 20.0),
(33, 33, '43', 12, 0.0), (34, 34, '40', 18, 0.0), (35, 35, '42', 150, 0.0), (36, 36, '41', 28, 0.0),
(37, 37, '44', 22, 0.0), (38, 38, '42', 35, 0.0), (39, 39, '45', 4, 90.0), (40, 40, 'XL', 20, 0.0);

-- =============================================================================
-- 4. USUARIOS (40 registros)
-- =============================================================================
INSERT INTO user (id, user_name, email, password, role, create_at, profile_img_url, name, surnames, birthday) VALUES 
(1, 'admin_hcd', 'admin@nike.com', 'admin_hash', 'ROLE_ADMIN', NOW(), 'img1.jpg', 'Admin', 'Hcd', '1980-01-01'),
(2, 'runner_pro', 'marcos@runner.com', 'pass1', 'ROLE_USER', NOW(), 'img2.jpg', 'Marcos', 'Gonzalez', '1990-05-10'),
(3, 'skater_88', 'tony@sb.com', 'pass2', 'ROLE_USER', NOW(), 'img3.jpg', 'Tony', 'Hawk', '1982-06-12'),
(4, 'gym_girl', 'ana@fit.com', 'pass3', 'ROLE_USER', NOW(), 'img4.jpg', 'Ana', 'Lopez', '1995-03-22'),
(5, 'sneaker_head', 'kevin@hype.com', 'pass4', 'ROLE_USER', NOW(), 'img5.jpg', 'Kevin', 'Smith', '1991-11-05'),
(6, 'jordan_fan', 'mike23@aj.com', 'pass5', 'ROLE_USER', NOW(), 'img6.jpg', 'Mike', 'Jordan', '1963-02-17'),
(7, 'tenis_elite', 'rafa@court.com', 'pass6', 'ROLE_USER', NOW(), 'img7.jpg', 'Rafael', 'Nadal', '1986-06-03'),
(8, 'yoga_zen', 'elena@yoga.com', 'pass7', 'ROLE_USER', NOW(), 'img8.jpg', 'Elena', 'Martinez', '1992-07-15'),
(9, 'soccer_star', 'cris7@football.com', 'pass8', 'ROLE_USER', NOW(), 'img9.jpg', 'Cristiano', 'Ronaldo', '1985-02-05'),
(10, 'marathon_man', 'eliud@fast.com', 'pass9', 'ROLE_USER', NOW(), 'img10.jpg', 'Eliud', 'Kipchoge', '1984-11-05'),
(11, 'user11', 'user11@nike.com', 'pass11', 'ROLE_USER', NOW(), 'img11.jpg', 'User', 'Eleven', '1993-01-11'),
(12, 'user12', 'user12@nike.com', 'pass12', 'ROLE_USER', NOW(), 'img12.jpg', 'User', 'Twelve', '1993-02-12'),
(13, 'user13', 'user13@nike.com', 'pass13', 'ROLE_USER', NOW(), 'img13.jpg', 'User', 'Thirteen', '1993-03-13'),
(14, 'user14', 'user14@nike.com', 'pass14', 'ROLE_USER', NOW(), 'img14.jpg', 'User', 'Fourteen', '1993-04-14'),
(15, 'user15', 'user15@nike.com', 'pass15', 'ROLE_USER', NOW(), 'img15.jpg', 'User', 'Fifteen', '1993-05-15'),
(16, 'user16', 'user16@nike.com', 'pass16', 'ROLE_USER', NOW(), 'img16.jpg', 'User', 'Sixteen', '1993-06-16'),
(17, 'user17', 'user17@nike.com', 'pass17', 'ROLE_USER', NOW(), 'img17.jpg', 'User', 'Seventeen', '1993-07-17'),
(18, 'user18', 'user18@nike.com', 'pass18', 'ROLE_USER', NOW(), 'img18.jpg', 'User', 'Eighteen', '1993-08-18'),
(19, 'user19', 'user19@nike.com', 'pass19', 'ROLE_USER', NOW(), 'img19.jpg', 'User', 'Nineteen', '1993-09-19'),
(20, 'user20', 'user20@nike.com', 'pass20', 'ROLE_USER', NOW(), 'img20.jpg', 'User', 'Twenty', '1993-10-20'),
(21, 'user21', 'user21@nike.com', 'pass21', 'ROLE_USER', NOW(), 'img21.jpg', 'User', '21', '1993-11-21'),
(22, 'user22', 'user22@nike.com', 'pass22', 'ROLE_USER', NOW(), 'img22.jpg', 'User', '22', '1993-12-22'),
(23, 'user23', 'user23@nike.com', 'pass23', 'ROLE_USER', NOW(), 'img23.jpg', 'User', '23', '1994-01-23'),
(24, 'user24', 'user24@nike.com', 'pass24', 'ROLE_USER', NOW(), 'img24.jpg', 'User', '24', '1994-02-24'),
(25, 'user25', 'user25@nike.com', 'pass25', 'ROLE_USER', NOW(), 'img25.jpg', 'User', '25', '1994-03-25'),
(26, 'user26', 'user26@nike.com', 'pass26', 'ROLE_USER', NOW(), 'img26.jpg', 'User', '26', '1994-04-26'),
(27, 'user27', 'user27@nike.com', 'pass27', 'ROLE_USER', NOW(), 'img27.jpg', 'User', '27', '1994-05-27'),
(28, 'user28', 'user28@nike.com', 'pass28', 'ROLE_USER', NOW(), 'img28.jpg', 'User', '28', '1994-06-28'),
(29, 'user29', 'user29@nike.com', 'pass29', 'ROLE_USER', NOW(), 'img29.jpg', 'User', '29', '1994-07-29'),
(30, 'user30', 'user30@nike.com', 'pass30', 'ROLE_USER', NOW(), 'img30.jpg', 'User', '30', '1994-08-30'),
(31, 'user31', 'user31@nike.com', 'pass31', 'ROLE_USER', NOW(), 'img31.jpg', 'User', '31', '1994-09-30'),
(32, 'user32', 'user32@nike.com', 'pass32', 'ROLE_USER', NOW(), 'img32.jpg', 'User', '32', '1994-10-31'),
(33, 'user33', 'user33@nike.com', 'pass33', 'ROLE_USER', NOW(), 'img33.jpg', 'User', '33', '1994-11-30'),
(34, 'user34', 'user34@nike.com', 'pass34', 'ROLE_USER', NOW(), 'img34.jpg', 'User', '34', '1994-12-31'),
(35, 'user35', 'user35@nike.com', 'pass35', 'ROLE_USER', NOW(), 'img35.jpg', 'User', '35', '1995-01-01'),
(36, 'user36', 'user36@nike.com', 'pass36', 'ROLE_USER', NOW(), 'img36.jpg', 'User', '36', '1995-02-02'),
(37, 'user37', 'user37@nike.com', 'pass37', 'ROLE_USER', NOW(), 'img37.jpg', 'User', '37', '1995-03-03'),
(38, 'user38', 'user38@nike.com', 'pass38', 'ROLE_USER', NOW(), 'img38.jpg', 'User', '38', '1995-04-04'),
(39, 'user39', 'user39@nike.com', 'pass39', 'ROLE_USER', NOW(), 'img39.jpg', 'User', '39', '1995-05-05'),
(40, 'user40', 'user40@nike.com', 'pass40', 'ROLE_USER', NOW(), 'img40.jpg', 'User', '40', '1995-06-06');

-- =============================================================================
-- 5. CARRITOS (40 registros - Uno por cada usuario)
-- =============================================================================
INSERT INTO cart (id, user_id, update_at) VALUES 
(1, 1, NOW()), (2, 2, NOW()), (3, 3, NOW()), (4, 4, NOW()), (5, 5, NOW()),
(6, 6, NOW()), (7, 7, NOW()), (8, 8, NOW()), (9, 9, NOW()), (10, 10, NOW()),
(11, 11, NOW()), (12, 12, NOW()), (13, 13, NOW()), (14, 14, NOW()), (15, 15, NOW()),
(16, 16, NOW()), (17, 17, NOW()), (18, 18, NOW()), (19, 19, NOW()), (20, 20, NOW()),
(21, 21, NOW()), (22, 22, NOW()), (23, 23, NOW()), (24, 24, NOW()), (25, 25, NOW()),
(26, 26, NOW()), (27, 27, NOW()), (28, 28, NOW()), (29, 29, NOW()), (30, 30, NOW()),
(31, 31, NOW()), (32, 32, NOW()), (33, 33, NOW()), (34, 34, NOW()), (35, 35, NOW()),
(36, 36, NOW()), (37, 37, NOW()), (38, 38, NOW()), (39, 39, NOW()), (40, 40, NOW());

-- =============================================================================
-- 6. ÍTEMS DEL CARRITO (40 registros)
-- =============================================================================
INSERT INTO cart_item (id, cart_id, product_variant_id, quantity) VALUES 
(1, 1, 1, 1), (2, 2, 2, 1), (3, 3, 3, 1), (4, 4, 4, 1), (5, 5, 5, 1),
(6, 6, 6, 1), (7, 7, 7, 1), (8, 8, 8, 1), (9, 9, 9, 1), (10, 10, 10, 1),
(11, 11, 11, 1), (12, 12, 12, 1), (13, 13, 13, 1), (14, 14, 14, 1), (15, 15, 15, 1),
(16, 16, 16, 1), (17, 17, 17, 1), (18, 18, 18, 5), (19, 19, 19, 1), (20, 20, 20, 1),
(21, 21, 21, 1), (22, 22, 22, 1), (23, 23, 23, 1), (24, 24, 24, 1), (25, 25, 25, 1),
(26, 26, 26, 1), (27, 27, 27, 1), (28, 28, 28, 1), (29, 29, 29, 1), (30, 30, 30, 1),
(31, 31, 31, 1), (32, 32, 32, 1), (33, 33, 33, 1), (34, 34, 34, 1), (35, 35, 35, 1),
(36, 36, 36, 1), (37, 37, 37, 1), (38, 38, 38, 1), (39, 39, 39, 1), (40, 40, 40, 1);