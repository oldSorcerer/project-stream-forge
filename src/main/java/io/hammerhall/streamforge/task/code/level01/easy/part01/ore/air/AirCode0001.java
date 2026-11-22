package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Airport;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Справочник диспетчера")
public class AirCode0001 extends Base {

    /**
     * Задание: Получить названия всех аэропортов на русском языке.
     * <p>
     * Описание: необходимо преобразовать коллекцию аэропортов в список строк — русских названий
     * аэропортов ({@code nameRu}). Порядок названий соответствует порядку обхода исходной
     * коллекции; одинаковые названия разных аэропортов сохраняются — в мире несколько Портлендов
     * и Оклендов.
     *
     * @param airports коллекция аэропортов
     * @return список русских названий всех аэропортов
     */
    public List<String> task(@NonNull Collection<Airport> airports) {
        return airports.stream()
                .map(Airport::nameRu)
                .toList();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0001");

        Collection<Airport> airports = airports();

        task(airports).stream().limit(20).forEach(IO::println);
    }
}
