package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Flight;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.ZoneId;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

@DisplayName("Пересменка в московской диспетчерской")
public class AirCode0008 extends Base {

    /**
     * Задание: Найти рейсы, вылетающие в заданный час по московскому времени.
     * <p>
     * Описание: из коллекции рейсов нужно оставить те, у которых плановый вылет
     * ({@code scheduledDeparture}) приходится на заданный час по московскому времени — пояс
     * {@code Europe/Moscow}, независимо от аэропорта вылета: рейс в 21:30 по UTC вылетает в 00:30 по
     * Москве, то есть в час 0. Час — от 0 до 23 и включает все минуты и секунды: в час 10 входят
     * вылеты с 10:00:00 по 10:59:59, вылет в 11:00 — уже час 11. Фактический вылет и прилёт значения
     * не имеют; отменённый рейс тоже подходит, если запланирован на этот час. Порядок результата
     * соответствует порядку обхода исходной коллекции; если таких рейсов нет — пустой список.
     *
     * @param flights коллекция рейсов
     * @param hour    час по московскому времени, от 0 до 23
     * @return список рейсов с плановым вылетом в заданный московский час в порядке обхода коллекции
     */
    public List<Flight> task(@NonNull Collection<Flight> flights, int hour) {
        ZoneId moscow = ZoneId.of("Europe/Moscow");
        return flights.stream()
                .filter(flight -> flight.scheduledDeparture().atZone(moscow).getHour() == hour)
                .toList();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0008");

        Collection<Flight> flights = flights();
        int hour = 6;
        ZoneId moscow = ZoneId.of("Europe/Moscow");

        List<Flight> result = task(flights, hour);

        IO.println("Плановый вылет с " + hour + ":00 до " + hour + ":59 по Москве: " + result.size() + " рейсов из " + flights.size());
        result.stream()
                .limit(15)
                .forEach(f -> IO.println(f.flightId() + "  " + f.routeNo() + "  "
                        + f.scheduledDeparture().atZone(moscow).toLocalDateTime() + " МСК  " + f.status()));
    }
}
