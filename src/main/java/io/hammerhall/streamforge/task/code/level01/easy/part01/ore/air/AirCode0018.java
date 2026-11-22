package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Flight;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Пассажиры у закрытого выхода")
public class AirCode0018 extends Base {

    /**
     * Задание: Найти рейсы без фактического времени вылета.
     * <p>
     * Описание: рейс без фактического времени вылета — тот, у которого {@code actualDeparture}
     * равен {@code null}: он ещё не вылетел (ждёт по расписанию, задерживается, идёт посадка) или
     * отменён. Рейс, который уже вылетел, — прилетел он или ещё в воздухе, — в результат не
     * попадает. Порядок рейсов соответствует порядку обхода исходной коллекции.
     *
     * @param flights коллекция рейсов
     * @return список рейсов, у которых нет фактического времени вылета
     */
    public List<Flight> task(@NonNull Collection<Flight> flights) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0018");

        Collection<Flight> flights = flights();

        List<Flight> result = task(flights);
        IO.println("Рейсов без фактического вылета: " + result.size() + " из " + flights.size());
        result.stream().limit(15).forEach(IO::println);
    }
}
