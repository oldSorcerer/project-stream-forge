package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.FareConditions;
import io.hammerhall.streamforge.domain.air.Seat;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Бортпроводница перед посадкой")
public class AirCode0004 extends Base {

    /**
     * Задание: Получить номера мест бизнес-класса заданной модели самолёта.
     * <p>
     * Описание: из коллекции мест салона нужно оставить места модели с заданным кодом
     * ({@code airplaneCode}, например {@code CR7}) и классом обслуживания
     * {@link FareConditions#BUSINESS}, и вернуть их номера ({@code seatNo}, например {@code 1A}) как
     * есть. Места других моделей не берутся, даже если номера совпадают: место {@code 1A} есть во
     * многих салонах. Код модели сравнивается как строка, по содержимому. Порядок номеров
     * соответствует порядку обхода исходной коллекции; если у модели нет мест бизнес-класса или
     * такой модели нет во входе — пустой список.
     *
     * @param seats        коллекция мест салона
     * @param airplaneCode код модели самолёта
     * @return список номеров мест бизнес-класса этой модели в порядке обхода коллекции
     */
    public List<String> task(@NonNull Collection<Seat> seats, @NonNull String airplaneCode) {
        return seats.stream()
                .filter(seat -> seat.airplaneCode().equals(airplaneCode))
                .filter(seat -> seat.fareConditions() == FareConditions.BUSINESS)
                .map(Seat::seatNo)
                .toList();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0004");

        Collection<Seat> seats = seats();
        String airplaneCode = "7M7";

        List<String> result = task(seats, airplaneCode);

        IO.println("Бизнес-класс модели " + airplaneCode + ": " + result.size() + " мест из " + seats.size() + " во всём справочнике");
        IO.println(String.join(" ", result));
    }
}
