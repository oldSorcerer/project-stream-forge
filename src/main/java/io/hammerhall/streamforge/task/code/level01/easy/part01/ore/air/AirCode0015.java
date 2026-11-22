package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Airport;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Снабженец аэропорта")
public class AirCode0015 extends Base {

    /**
     * Задание: Найти аэропорты севернее заданной широты.
     * <p>
     * Описание: широта аэропорта ({@code latitude}) — в градусах: северное полушарие — плюс, южное —
     * минус, экватор — ноль. Аэропорт севернее заданной широты, если его широта строго больше её:
     * аэропорт ровно на заданной широте не подходит. «Севернее» — по значению, а не по удалению от
     * экватора: севернее −30° лежат и −20°, и экватор, и всё северное полушарие, а −40° — южнее.
     * Долгота не учитывается. Порядок аэропортов в результате — порядок обхода исходной коллекции;
     * пустой вход — пустой список.
     *
     * @param airports коллекция аэропортов
     * @param latitude граничная широта в градусах, от −90 до 90; учитываются аэропорты строго севернее
     * @return список аэропортов, широта которых больше {@code latitude}
     */
    public List<Airport> task(@NonNull Collection<Airport> airports, double latitude) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0015");

        Collection<Airport> airports = airports();

        double latitude = 72.0;

        task(airports, latitude).stream().limit(20).forEach(airport -> IO.println("%s %s — %s, %s, широта %s".formatted(
                airport.code(), airport.nameEn(), airport.cityEn(), airport.countryEn(), airport.latitude())));
    }
}
