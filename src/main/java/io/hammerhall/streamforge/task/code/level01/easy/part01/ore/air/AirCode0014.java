package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Flight;
import io.hammerhall.streamforge.domain.air.FlightStatus;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Радист на связи с бортом")
public class AirCode0014 extends Base {

    /**
     * Задание: Найти рейсы, которые вылетели, но ещё не прилетели на момент выгрузки.
     * <p>
     * Описание: статус рейса ({@code status}) описывает его состояние на момент выгрузки данных. Рейс,
     * который вылетел, но ещё не прилетел, находится в воздухе — у него статус
     * {@link FlightStatus#DEPARTED}: фактический вылет у такого рейса есть, фактического прилёта ещё
     * нет. Не подходят прилетевшие ({@code ARRIVED}), ещё не вылетевшие ({@code SCHEDULED},
     * {@code ON_TIME}, {@code DELAYED}, {@code BOARDING} — посадка идёт, но самолёт на земле) и
     * отменённые ({@code CANCELLED}) рейсы. Порядок рейсов в результате — порядок обхода исходной
     * коллекции; пустой вход — пустой список.
     *
     * @param flights коллекция рейсов
     * @return список рейсов, находящихся в воздухе на момент выгрузки
     */
    public List<Flight> task(@NonNull Collection<Flight> flights) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0014");

        Collection<Flight> flights = flights();

        List<Flight> inTheAir = task(flights);

        IO.println("В воздухе на момент выгрузки: " + inTheAir.size() + " из " + flights.size());
        inTheAir.stream().limit(15).forEach(flight -> IO.println("%d %s вылетел %s, по плану прилетит %s".formatted(
                flight.flightId(), flight.routeNo(), flight.actualDeparture(), flight.scheduledArrival())));
    }
}
