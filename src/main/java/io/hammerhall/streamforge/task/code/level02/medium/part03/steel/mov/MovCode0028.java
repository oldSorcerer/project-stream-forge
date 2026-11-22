package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

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

@DisplayName("Мода на экране")
public class MovCode0028 extends Base {

    /**
     * Задание: Для каждого десятилетия построить множество использовавшихся жанров.
     * <p>
     * Описание: фильмы группируются по десятилетию их выпуска. Десятилетие
     * определяется как год, округлённый вниз до ближайшего десятка
     * (например, 1994 → 1990). Для каждого десятилетия собирается множество
     * (без повторений) всех жанров фильмов, вышедших в этом десятилетии.
     * Если у фильма несколько жанров, каждый из них учитывается.
     * <p>
     * Для пустой коллекции фильмов возвращается пустой ассоциативный массив.
     *
     * @param movies коллекция фильмов
     * @return ассоциативный массив «десятилетие → множество жанров»
     */
    public Map<Integer, Set<Genre>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0028");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
