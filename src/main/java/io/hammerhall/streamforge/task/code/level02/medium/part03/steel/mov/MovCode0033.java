package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

import io.hammerhall.streamforge.domain.movie.Director;
import io.hammerhall.streamforge.domain.movie.Genre;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@DisplayName("Творческий почерк")
public class MovCode0033 extends Base {

    /**
     * Задание: Для каждого режиссёра собрать множество жанров, в которых он работал.
     * <p>
     * Описание: по всем фильмам каждого режиссёра собираются их жанры без повторений.
     * Фильм с несколькими режиссёрами вносит свои жанры каждому из них.
     * <p>
     * Концепт: для каждого фильма порождаются пары «режиссёр и жанр», которые затем
     * собираются в множество жанров по каждому режиссёру.
     *
     * @param movies коллекция фильмов
     * @return индекс «режиссёр → множество жанров»
     */
    public Map<Director, Set<Genre>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0033");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
