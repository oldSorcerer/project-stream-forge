package io.hammerhall.streamforge.task.code.level01.easy.part02.steel.air;

import io.hammerhall.streamforge.domain.air.Ticket;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

@DisplayName("Звонок в колл-центр")
public class AirCode0020 extends Base {

    /**
     * Задание: Получить имена пассажиров бронирования по алфавиту.
     * <p>
     * Описание: из коллекции билетов нужно взять билеты бронирования {@code bookRef} и вернуть
     * имена их пассажиров ({@code passengerName}) по алфавиту — в естественном порядке строк
     * ({@link String#compareTo}: по кодам символов, поэтому заглавные буквы идут раньше строчных,
     * а буквы с диакритикой — после латинских без неё). Каждое имя — один раз: у пассажира,
     * который летит туда и обратно, в брони два билета, а тёзки — разные пассажиры с одним
     * именем — тоже дают одну строку. Номер брони сравнивается точно, с учётом регистра.
     * Если билетов этой брони нет, результат — пустой список.
     *
     * @param tickets коллекция билетов
     * @param bookRef номер брони
     * @return имена пассажиров брони без повторов, в естественном порядке строк
     */
    public List<String> task(@NonNull Collection<Ticket> tickets, @NonNull String bookRef) {
        return tickets.stream()
                .filter(ticket -> ticket.bookRef().equals(bookRef))
                .map(Ticket::passengerName)
                .distinct()
                .sorted()
                .toList();
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit AirCode0020");

        try (Stream<Ticket> stream = tickets()) {
            Collection<Ticket> tickets = stream.limit(200_000).toList();
            IO.println("Билеты — первые 200 000 строк выгрузки; бронь CTNV4K");

            task(tickets, "CTNV4K").forEach(IO::println);
        }
    }
}
