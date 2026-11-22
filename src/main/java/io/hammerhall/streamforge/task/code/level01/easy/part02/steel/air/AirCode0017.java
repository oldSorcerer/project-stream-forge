package io.hammerhall.streamforge.task.code.level01.easy.part02.steel.air;

import io.hammerhall.streamforge.domain.air.Booking;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@DisplayName("Тетрадь старшего кассира")
public class AirCode0017 extends Base {

    /**
     * Задание: Получить первые N бронирований по дате бронирования.
     * <p>
     * Описание: необходимо упорядочить бронирования по моменту покупки ({@code bookDate}) от ранних
     * к поздним и вернуть первые {@code n} из них. Момент — {@link java.time.Instant}: сравниваются
     * сами моменты с точностью до секунды, часовые пояса и календарные даты здесь не участвуют.
     * Бронирования с одинаковым моментом покупки идут в порядке обхода исходной коллекции.
     * Если бронирований меньше {@code n}, возвращаются все; при {@code n = 0} — пустой список.
     *
     * @param bookings коллекция бронирований
     * @param n        сколько бронирований вернуть, {@code n >= 0}
     * @return список из не более чем {@code n} самых ранних бронирований, от ранних к поздним
     */
    public List<Booking> task(@NonNull Collection<Booking> bookings, int n) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0017");

        try (Stream<Booking> stream = bookings()) {
            Collection<Booking> bookings = stream.limit(200_000).toList();
            IO.println("Бронирования — первые 200 000 строк выгрузки");

            task(bookings, 10).forEach(IO::println);
        }
    }
}
