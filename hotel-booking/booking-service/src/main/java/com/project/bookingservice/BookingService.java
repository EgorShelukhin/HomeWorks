package com.project.bookingservice;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class BookingService {

    private final RestTemplate restTemplate;

    @Value("${data-service.url}")
    private final String dataServiceUrl;

    public boolean bookRoom(BookingRequest request) {
        String url = String.format("%s/api/v1/rooms/%d/availability?arrivalDate=%s&departureDate=%s",
                dataServiceUrl, request.getRoomId(),
                request.getArrivalDate(), request.getDepartureDate());

        // Отправляем GET-запрос в DataService
        ResponseEntity<Boolean> response = restTemplate.getForEntity(url, Boolean.class);

        if(Boolean.TRUE.equals(response.getBody())) {
            // Если комната свободна – отправляем запрос на бронирование
            String bookingUrl = String.format("%s/api/v1/reservations", dataServiceUrl);
            ResponseEntity<Void> bookingResponse = restTemplate.postForEntity(bookingUrl, request, Void.class);
            return bookingResponse.getStatusCode().is2xxSuccessful();
        }

        return false;

    }
}