package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Segment;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

@DisplayName("Касса аэровокзала")
public class AirCode0009 extends Base {

    /**
     * Задание: Получить цены сегментов, округлённые до сотен рублей.
     * <p>
     * Описание: каждой записи коллекции сегментов соответствует одно число — цена сегмента
     * ({@code price}, ₽), округлённая до сотен рублей по школьному правилу: половина и больше — вверх
     * ({@link RoundingMode#HALF_UP}). Примеры: 8 125 → 8 100, 8 150 → 8 200, 8 175 → 8 200,
     * 3 250 → 3 300, 8 149.99 → 8 100. Результат — {@link BigDecimal} без знаков после запятой
     * (масштаб 0): {@code 8100}, а не {@code 8100.00} и не {@code 8.1E+3}. Порядок чисел
     * соответствует порядку обхода исходной коллекции; одинаковые цены не схлопываются. Пустая
     * коллекция — пустой список.
     *
     * @param segments коллекция сегментов
     * @return список цен, округлённых до сотен рублей, по одной на каждый сегмент, в порядке обхода
     */
    public List<BigDecimal> task(@NonNull Collection<Segment> segments) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0009");

        try (Stream<Segment> stream = segments()) {
            List<Segment> segments = stream.limit(200_000).toList();

            List<BigDecimal> rounded = task(segments);

            IO.println("Первые 200 000 сегментов; первые 15 цен — как есть и до сотен:");
            for (int i = 0; i < Math.min(15, segments.size()); i++) {
                Segment s = segments.get(i);
                IO.println(s.ticketNo() + "  " + s.fareConditions() + "  " + s.price() + " → " + rounded.get(i));
            }
        }
    }
}
