package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Flight;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Collection;

@DisplayName("Разбор у начальника смены")
public class AirCode0005 extends Base {

    /**
     * Задание: Посчитать рейсы, вылетевшие с опозданием больше заданного числа минут.
     * <p>
     * Описание: опоздание рейса — время от планового вылета ({@code scheduledDeparture}) до
     * фактического ({@code actualDeparture}), с точностью до секунды. Нужно посчитать рейсы, у
     * которых опоздание строго больше {@code minutes} минут: ровно 15 минут при пороге 15 не
     * считается, 15 минут 1 секунда — считается. Рейс, вылетевший раньше расписания, опоздания не
     * имеет. Рейсы без фактического вылета (ещё не вылетевшие и отменённые) не считаются. Прилёт —
     * плановый и фактический — значения не имеет. Пустая коллекция — 0.
     *
     * @param flights коллекция рейсов
     * @param minutes порог опоздания в минутах, не меньше нуля; учитываются рейсы с опозданием
     *                строго больше него
     * @return число рейсов, вылетевших с опозданием больше {@code minutes} минут
     */
    public long task(@NonNull Collection<Flight> flights, int minutes) {
        return flights.stream()
                .filter(flight -> flight.actualDeparture() != null)
                .filter(flight -> flight.actualDeparture()
                        .isAfter(flight.scheduledDeparture().plus(Duration.ofMinutes(minutes))))
                .count();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0005");

        Collection<Flight> flights = flights();

        IO.println("Всего рейсов: " + flights.size());
        for (int minutes : new int[] {5, 15, 60, 180}) {
            IO.println("Опоздание больше " + minutes + " мин: " + task(flights, minutes));
        }
    }
}
