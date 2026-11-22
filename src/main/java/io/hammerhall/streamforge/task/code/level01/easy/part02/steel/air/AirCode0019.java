package io.hammerhall.streamforge.task.code.level01.easy.part02.steel.air;

import io.hammerhall.streamforge.domain.air.Booking;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

@DisplayName("Кофе с финансовым директором")
public class AirCode0019 extends Base {

    /**
     * Задание: Найти самое дорогое бронирование.
     * <p>
     * Описание: самое дорогое бронирование — с наибольшей суммой {@code totalAmount}. Суммы
     * сравниваются как числа, с точностью до копейки ({@link java.math.BigDecimal#compareTo}):
     * {@code 8125.0} и {@code 8125.00} — одна и та же сумма. Если наибольшая сумма у нескольких
     * бронирований, вернуть то из них, что встречается первым в порядке обхода исходной коллекции.
     * Для пустой коллекции — {@code Optional.empty()}.
     *
     * @param bookings коллекция бронирований
     * @return бронирование с наибольшей суммой или {@code Optional.empty()}, если бронирований нет
     */
    public Optional<Booking> task(@NonNull Collection<Booking> bookings) {
        throw new RuntimeException();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0019");

        try (Stream<Booking> stream = bookings()) {
            Collection<Booking> bookings = stream.limit(200_000).toList();
            IO.println("Бронирования — первые 200 000 строк выгрузки");

            IO.println(task(bookings));
        }
    }
}
