package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Flight;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Collection;
import java.util.List;

@DisplayName("Тележка бортпроводницы")
public class AirCode0010 extends Base {

    /**
     * Задание: Найти рейсы с плановой длительностью больше трёх часов.
     * <p>
     * Описание: плановая длительность рейса — промежуток от планового вылета
     * ({@code scheduledDeparture}) до планового прилёта ({@code scheduledArrival}). Оба времени —
     * моменты {@link java.time.Instant}, поэтому часовые пояса аэропортов в расчёт не входят, а рейс,
     * который вылетает до полуночи и прилетает после неё, считается так же, как любой другой.
     * Нужно оставить рейсы, плановая длительность которых строго больше трёх часов: рейс ровно на
     * 3 ч 00 мин не подходит, на 3 ч 01 мин — подходит. Фактические времена и статус рейса не
     * учитываются: у отменённого или ещё не вылетевшего рейса плановая длительность тоже есть.
     * Порядок рейсов в результате — порядок обхода исходной коллекции; пустой вход — пустой список.
     *
     * @param flights коллекция рейсов
     * @return список рейсов, плановая длительность которых больше трёх часов
     */
    public List<Flight> task(@NonNull Collection<Flight> flights) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0010");

        Collection<Flight> flights = flights();

        List<Flight> longFlights = task(flights);

        IO.println("Рейсов: " + flights.size() + ", из них дольше трёх часов по плану: " + longFlights.size());
        longFlights.stream().limit(15).forEach(flight -> IO.println("%d %s %s → %s (%s)".formatted(
                flight.flightId(), flight.routeNo(), flight.scheduledDeparture(), flight.scheduledArrival(),
                Duration.between(flight.scheduledDeparture(), flight.scheduledArrival()))));
    }
}
