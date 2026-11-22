package io.hammerhall.streamforge.task.code.level01.easy.part02.steel.air;

import io.hammerhall.streamforge.domain.air.Ticket;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@DisplayName("Сувениры из дьюти-фри")
public class AirCode0021 extends Base {

    /**
     * Задание: Получить множество стран пассажиров — код страны стоит в начале документа пассажира.
     * <p>
     * Описание: документ пассажира ({@code passengerId}) записан как код страны из двух
     * заглавных латинских букв, пробел и номер: {@code "IT 2425980678984"}. Нужно вернуть
     * множество кодов стран — ровно две буквы, без пробела и номера — по всем билетам коллекции;
     * каждый код входит в множество один раз, сколько бы билетов с ним ни было. Номер билета
     * ({@code ticketNo}) кода страны не содержит. Для пустой коллекции — пустое множество.
     * Порядок элементов множества не регламентирован.
     *
     * @param tickets коллекция билетов
     * @return множество двухбуквенных кодов стран из документов пассажиров
     */
    public Set<String> task(@NonNull Collection<Ticket> tickets) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0021");

        try (Stream<Ticket> stream = tickets()) {
            Collection<Ticket> tickets = stream.limit(200_000).toList();
            IO.println("Билеты — первые 200 000 строк выгрузки");

            Set<String> codes = task(tickets);
            IO.println("Стран: " + codes.size() + " — " + new TreeSet<>(codes));
        }
    }
}
