CREATE TABLE IF NOT EXISTS Cancha(
  id SERIAL,
        nombre VARCHAR (100) NOT NULL,
        hora INT NOT NULL,
        cancha VARCHAR(50) NOT NULL,
      PRIMARY KEY (id)
      );