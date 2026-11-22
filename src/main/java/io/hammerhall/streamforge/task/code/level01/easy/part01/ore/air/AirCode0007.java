package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Booking;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

@DisplayName("Звонок из отдела лояльности")
public class AirCode0007 extends Base {

    /**
     * Задание: Найти бронирования дороже заданной суммы.
     * <p>
     * Описание: из коллекции бронирований нужно оставить те, чья сумма ({@code totalAmount}, ₽)
     * строго больше заданной: бронирование ровно на заданную сумму не подходит. Суммы сравниваются
     * как числа, с копейками, и запись числа роли не играет: {@code 8125}, {@code 8125.0} и
     * {@code 8125.00} — одна и та же сумма. Порядок результата соответствует порядку обхода
     * исходной коллекции; если дороже нет ни одного — пустой список.
     *
     * @param bookings коллекция бронирований
     * @param amount   сумма, ₽, не меньше нуля; подходят бронирования строго дороже неё
     * @return список бронирований дороже {@code amount} в порядке обхода коллекции
     */
    public List<Booking> task(@NonNull Collection<Booking> bookings, @NonNull BigDecimal amount) {
        return bookings.stream()
                .filter(booking -> booking.totalAmount().compareTo(amount) > 0)
                .toList();

    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0007");

        try (Stream<Booking> stream = bookings()) {
            Collection<Booking> bookings = stream.limit(200_000).toList();
            BigDecimal amount = new BigDecimal("300000");

            List<Booking> result = task(bookings, amount);

            IO.println("Первые 200 000 бронирований; дороже " + amount + " ₽: " + result.size());
            result.stream()
                    .limit(15)
                    .forEach(b -> IO.println(b.bookRef() + "  " + b.totalAmount() + " ₽  куплено " + b.bookDate()));
        }
    }
}
