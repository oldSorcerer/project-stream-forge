package io.hammerhall.streamforge.task.code.level01.easy.part01.ore.air;

import io.hammerhall.streamforge.domain.air.Ticket;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

@DisplayName("Встречающий с табличкой")
public class AirCode0011 extends Base {

    /**
     * Задание: Найти билеты пассажиров с заданной фамилией без учёта регистра.
     * <p>
     * Описание: имя пассажира в билете ({@code passengerName}) записано латиницей как «Имя Фамилия»:
     * имя — одно слово до первого пробела, фамилия — всё, что после него. Фамилия бывает из нескольких
     * слов: у {@code "Ferdinando De Rosa"} фамилия — {@code "De Rosa"}. Билет подходит, если его фамилия
     * совпадает с заданной целиком, без учёта регистра букв: {@code "ivanov"}, {@code "IVANOV"} и
     * {@code "Ivanov"} находят {@code "Timur Ivanov"}, но не {@code "Lyudmila Ivanova"} и не
     * {@code "Ivanov"} в роли имени. Вернуть сами билеты в порядке обхода исходной коллекции; у
     * пассажира, который летит туда и обратно, два билета — в результат попадают оба. Пустой вход —
     * пустой список.
     *
     * @param tickets коллекция билетов
     * @param surname фамилия латиницей, в любом регистре
     * @return список билетов, фамилия пассажира в которых совпадает с заданной
     */
    public List<Ticket> task(@NonNull Collection<Ticket> tickets, @NonNull String surname) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0011");

        Collection<Ticket> tickets;
        try (Stream<Ticket> stream = tickets()) {
            tickets = stream.limit(200_000).toList();
        }

        String surname = "de rosa";

        List<Ticket> found = task(tickets, surname);

        IO.println("Среди первых 200 000 билетов с фамилией «" + surname + "»: " + found.size());
        found.stream().limit(15).forEach(ticket -> IO.println("%s %s %s %s".formatted(
                ticket.ticketNo(), ticket.passengerId(), ticket.passengerName(), ticket.outbound() ? "туда" : "обратно")));
    }
}
