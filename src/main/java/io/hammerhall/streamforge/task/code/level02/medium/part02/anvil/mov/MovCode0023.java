package io.hammerhall.streamforge.task.code.level02.medium.part02.anvil.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@DisplayName("Летопись студии")
public class MovCode0023 extends Base {

    /**
     * Задание: Посчитать количество фильмов для каждого года.
     * <p>
     * Описание: необходимо сгруппировать фильмы по году выхода и посчитать,
     * сколько фильмов вышло в каждом году. Ключом итоговой Map является год
     * выхода фильма, а значением — количество фильмов, вышедших в этот год.
     *
     * @param movies коллекция фильмов
     * @return Map, где ключ — год выхода, значение — количество фильмов за этот год
     */
    public Map<Integer, Long> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0023");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
