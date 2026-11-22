package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Route;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Планёрка штурманов")
public class AirCode0006 extends Base {

    /**
     * Задание: Получить плановую длительность каждого маршрута в минутах.
     * <p>
     * Описание: каждой записи коллекции — версии маршрута — соответствует одно число: её плановая
     * длительность полёта ({@code duration}), выраженная целиком в минутах — вместе с часами:
     * 2 ч 05 мин — это 125. В данных длительность — целое число минут. Порядок чисел соответствует
     * порядку обхода исходной коллекции; у каждой версии — своё число, даже если у нескольких версий
     * одного маршрута длительность совпадает. Пустая коллекция — пустой список.
     *
     * @param routes коллекция версий маршрутов
     * @return список длительностей в минутах, по одной на каждую версию, в порядке обхода коллекции
     */
    public List<Long> task(@NonNull Collection<Route> routes) {
        return routes.stream()
                .map(route -> route.duration().toMinutes())
                .toList();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0006");

        List<Route> routes = List.copyOf(routes());

        List<Long> minutes = task(routes);

        IO.println("Версий маршрутов: " + routes.size() + "; первые 15:");
        for (int i = 0; i < Math.min(15, routes.size()); i++) {
            Route r = routes.get(i);
            IO.println(r.routeNo() + "  " + r.departureAirport() + " → " + r.arrivalAirport() + "  " + minutes.get(i) + " мин");
        }
    }
}
