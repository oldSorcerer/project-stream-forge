package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Booking;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.stream.Stream;

@DisplayName("Ревизор в кассовом зале")
public class AirCode0016 extends Base {

    /**
     * Задание: Проверить, что все бронирования дороже заданной суммы.
     * <p>
     * Описание: нужно вернуть {@code true}, если сумма каждого бронирования ({@code totalAmount}, ₽)
     * строго больше заданной, и {@code false}, если есть хотя бы одно бронирование не дороже её.
     * Бронирование ровно на заданную сумму условие нарушает. Суммы сравниваются по величине и точно, без
     * перевода в {@code double}: {@code 1750} и {@code 1750.00} — одна и та же сумма, а
     * {@code 8125.00} больше, чем {@code 8124.9999999999999}. Пустая коллекция — {@code true}: в ней нет
     * бронирования, которое нарушало бы условие.
     *
     * @param bookings коллекция бронирований
     * @param amount   сумма, ₽; бронирования сравниваются с ней строго
     * @return {@code true}, если все бронирования дороже {@code amount}
     */
    public boolean task(@NonNull Collection<Booking> bookings, @NonNull BigDecimal amount) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0016");

        Collection<Booking> bookings;
        try (Stream<Booking> stream = bookings()) {
            bookings = stream.limit(200_000).toList();
        }

        IO.println("Первые 200 000 бронирований");
        IO.println("Все дороже 1 700 ₽: " + task(bookings, new BigDecimal("1700")));
        IO.println("Все дороже 1 750 ₽: " + task(bookings, new BigDecimal("1750")));
        IO.println("Все дороже 10 000 ₽: " + task(bookings, new BigDecimal("10000")));
    }
}
