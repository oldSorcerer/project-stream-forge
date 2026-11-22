package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Airport;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Буклет турагентства")
public class AirCode0013 extends Base {

    /**
     * Задание: Найти аэропорты, в английском названии которых есть слово Valley.
     * <p>
     * Описание: нужно оставить аэропорты, английское название которых ({@code nameEn}) содержит строку
     * {@code "Valley"} — ровно так, с заглавной V, и в любом месте названия: в начале, в середине или в
     * конце. В названиях аэропортов эта строка всегда стоит отдельным словом, так что границы слова
     * проверять не нужно. Смотрится только название аэропорта — не город, не страна и не русское
     * название: аэропорт Teesside в городе Tees Valley не подходит. Порядок аэропортов в результате —
     * порядок обхода исходной коллекции; пустой вход — пустой список.
     *
     * @param airports коллекция аэропортов
     * @return список аэропортов, в английском названии которых есть {@code "Valley"}
     */
    public List<Airport> task(@NonNull Collection<Airport> airports) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0013");

        Collection<Airport> airports = airports();

        task(airports).stream().limit(20).forEach(airport -> IO.println("%s %s — %s, %s".formatted(
                airport.code(), airport.nameEn(), airport.cityEn(), airport.countryEn())));
    }
}
