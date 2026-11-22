package io.hammerhall.streamforge.task.code.level02.medium.part02.anvil.mov;

import io.hammerhall.streamforge.domain.movie.Director;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.TreeMap;
import java.util.stream.Collectors;

@DisplayName("Портфолио постановщиков")
public class MovCode0022 extends Base {

    /**
     * Задание: Найти количество фильмов каждого режиссёра.
     * <p>
     * Описание: необходимо подсчитать, со сколькими фильмами связан каждый режиссёр.
     * Результирующая карта должна быть отсортирована по имени режиссёра
     * в алфавитном порядке.
     *
     * @param movies коллекция фильмов
     * @return отсортированная по имени карта, где ключ — имя режиссёра,
     * значение — количество его фильмов
     */
    public TreeMap<String, Long> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0022");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
