CREATE TABLE hotels (
                        id SERIAL PRIMARY KEY,
                        hotel_name VARCHAR(255) NOT NULL,
                        city VARCHAR(255) NOT NULL,
                        address VARCHAR(255) NOT NULL,
                        manager_id BIGINT NOT NULL,
                        creation_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE rooms (
                       id SERIAL PRIMARY KEY,
                       room_type VARCHAR(50) CHECK (room_type IN ('STANDARD', 'LUX', 'VIP')),
                       count INT NOT NULL CHECK (count > 0),
                       price DECIMAL(10, 2) NOT NULL CHECK (price > 0),
                       max_person INT NOT NULL CHECK (max_person > 0),
                       hotel_id INT NOT NULL,
                       FOREIGN KEY (hotel_id) REFERENCES hotels(id) ON DELETE CASCADE
);
CREATE TABLE reservations (
                              id SERIAL PRIMARY KEY,
                              user_id BIGINT NOT NULL,
                              room_id BIGINT NOT NULL,
                              arrival_date DATE NOT NULL,
                              departure_date DATE NOT NULL,
                              CONSTRAINT fk_reservations_room FOREIGN KEY (room_id) REFERENCES rooms(id) ON DELETE CASCADE
);
