package io.hammerhall.streamforge.task.code.level01.easy.part02.steel.air;

import io.hammerhall.streamforge.domain.air.Booking;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.stream.Stream;

@DisplayName("Кабинет главного бухгалтера")
public class AirCode0023 extends Base {

    /**
     * Задание: Посчитать общую выручку всех бронирований.
     * <p>
     * Описание: выручка — сумма {@code totalAmount} всех бронирований коллекции, посчитанная
     * точно, копейка в копейку: в {@link BigDecimal}, без перехода к {@code double} и без
     * округления. Одинаковые суммы разных бронирований складываются каждая. Результат — с двумя
     * знаками после запятой (масштаб 2, как деньги в данных: {@code 8125.00}), даже если суммы на
     * входе записаны с меньшим числом знаков ({@code 5000}, {@code 120.5}); для пустой коллекции —
     * {@code 0.00}.
     *
     * @param bookings коллекция бронирований
     * @return общая выручка, ₽, с масштабом 2
     */
    public BigDecimal task(@NonNull Collection<Booking> bookings) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0023");

        try (Stream<Booking> stream = bookings()) {
            Collection<Booking> bookings = stream.limit(200_000).toList();
            IO.println("Бронирования — первые 200 000 строк выгрузки");

            IO.println("Выручка, ₽: " + task(bookings).toPlainString());
        }
    }
}
