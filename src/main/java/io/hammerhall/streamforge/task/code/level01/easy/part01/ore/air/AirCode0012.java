package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Route;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Штурманская на рассвете")
public class AirCode0012 extends Base {

    /**
     * Задание: Найти маршруты, номер которых начинается с заданных символов.
     * <p>
     * Описание: нужно оставить версии маршрутов, номер которых ({@code routeNo}) начинается с заданной
     * строки — именно начинается, совпадение в середине номера не считается. Регистр букв учитывается:
     * {@code "pg"} не совпадает с {@code "PG0001"}. Строка длиннее номера не совпадает ни с чем, а пустая
     * строка — начало любого номера, и тогда подходят все версии. У одного номера маршрута несколько
     * версий (расписание пересобирается помесячно) — в результат попадает каждая подходящая версия,
     * без схлопывания по номеру. Порядок версий в результате — порядок обхода исходной коллекции;
     * пустой вход — пустой список.
     *
     * @param routes коллекция версий маршрутов
     * @param prefix начало номера маршрута
     * @return список версий маршрутов, номер которых начинается с {@code prefix}
     */
    public List<Route> task(@NonNull Collection<Route> routes, @NonNull String prefix) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0012");

        Collection<Route> routes = routes();

        String prefix = "PG000";

        List<Route> found = task(routes, prefix);

        IO.println("Версий маршрутов: " + routes.size() + ", с номером на «" + prefix + "»: " + found.size());
        found.stream().limit(15).forEach(route -> IO.println("%s %s → %s, %s – %s, самолёт %s".formatted(
                route.routeNo(), route.departureAirport(), route.arrivalAirport(),
                route.validFrom(), route.validTo(), route.airplaneCode())));
    }
}
