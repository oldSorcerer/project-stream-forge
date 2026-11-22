package io.hammerhall.streamforge.task.code.level03.hard.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Director;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

@DisplayName("Мемуары кинорежиссёра")
public class MovCode0037 extends Base {

    /**
     * Задание: Для каждого режиссёра определить самый ранний и самый поздний по году
     * выхода фильм его карьеры.
     * <p>
     * Описание: у каждого режиссёра из всех его фильмов одновременно берутся два крайних
     * по году — самый ранний и самый поздний. Оба определяются в пределах фильмов
     * именно этого режиссёра. Фильм с несколькими режиссёрами учитывается в карьере
     * каждого из них.
     * <p>
     * Концепт: для каждого режиссёра — пара крайних по году фильмов, полученная за один
     * проход по его фильмам.
     *
     * @param movies коллекция фильмов
     * @return индекс «режиссёр → (первый фильм, последний фильм)»
     */
    public Map<Director, CareerSpan> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    /**
     * Крайние фильмы карьеры режиссёра.
     */
    public record CareerSpan(Movie first, Movie last) {
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0037");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
