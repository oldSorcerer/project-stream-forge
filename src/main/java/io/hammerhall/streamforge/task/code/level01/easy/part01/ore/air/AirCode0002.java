package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Flight;
import io.hammerhall.streamforge.domain.air.FlightStatus;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Хмурое утро в терминале")
public class AirCode0002 extends Base {

    /**
     * Задание: Найти все отменённые рейсы.
     * <p>
     * Описание: из коллекции рейсов нужно оставить те, у которых статус —
     * {@link FlightStatus#CANCELLED} (в данных — {@code Cancelled}). Отменённым рейс считается только
     * по статусу: у рейса, который ещё не вылетел ({@code SCHEDULED}, {@code ON_TIME},
     * {@code DELAYED}, {@code BOARDING}), фактического вылета тоже нет, но он не отменён. Порядок
     * результата соответствует порядку обхода исходной коллекции; если отменённых рейсов нет —
     * пустой список.
     *
     * @param flights коллекция рейсов
     * @return список отменённых рейсов в порядке обхода коллекции
     */
    public List<Flight> task(@NonNull Collection<Flight> flights) {
        return flights.stream()
                .filter(flight -> flight.status() == FlightStatus.CANCELLED)
                .toList();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0002");

        Collection<Flight> flights = flights();

        List<Flight> cancelled = task(flights);

        IO.println("Отменённых рейсов: " + cancelled.size() + " из " + flights.size());
        cancelled.stream()
                .limit(15)
                .forEach(f -> IO.println(f.flightId() + "  " + f.routeNo() + "  плановый вылет " + f.scheduledDeparture()));
    }
}
