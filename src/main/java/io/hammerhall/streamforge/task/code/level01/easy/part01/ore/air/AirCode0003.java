package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Airport;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.util.Collection;
import java.util.List;

@DisplayName("Командировка за Урал")
public class AirCode0003 extends Base {

    /**
     * Задание: Найти аэропорты в заданном часовом поясе.
     * <p>
     * Описание: из коллекции аэропортов нужно оставить те, чей часовой пояс ({@code timezone})
     * совпадает с заданным. Пояса сравниваются по равенству ({@code ZoneId.equals}), то есть по
     * идентификатору вида {@code Europe/Moscow}, а не по смещению от UTC: Стамбул
     * ({@code Europe/Istanbul}) круглый год живёт по UTC+3, как и Москва, но пояс у него другой.
     * Город аэропорта роли не играет — Пермь, например, живёт в поясе {@code Asia/Yekaterinburg}.
     * Порядок результата соответствует порядку обхода исходной коллекции; если в поясе нет ни
     * одного аэропорта — пустой список.
     *
     * @param airports коллекция аэропортов
     * @param zone     часовой пояс
     * @return список аэропортов заданного пояса в порядке обхода коллекции
     */
    public List<Airport> task(@NonNull Collection<Airport> airports, @NonNull ZoneId zone) {
        return airports.stream()
                .filter(airport -> airport.timezone().equals(zone))
                .toList();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0003");

        Collection<Airport> airports = airports();
        ZoneId zone = ZoneId.of("Asia/Yekaterinburg");

        List<Airport> result = task(airports, zone);

        IO.println("Аэропортов в поясе " + zone + ": " + result.size() + " из " + airports.size());
        result.stream()
                .limit(15)
                .forEach(a -> IO.println(a.code() + "  " + a.nameRu() + " (" + a.cityRu() + ")"));
    }
}
