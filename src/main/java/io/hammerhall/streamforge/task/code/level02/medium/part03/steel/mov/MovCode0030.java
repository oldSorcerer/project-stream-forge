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

@DisplayName("Дневник обозревателя")
public class MovCode0030 extends Base {

    /**
     * Задание: Построить индекс «год → множество использовавшихся жанров».
     * <p>
     * Описание: необходимо сгруппировать фильмы по году выхода и для каждого года
     * собрать множество названий жанров, встречающихся у его фильмов.
     *
     * @param movies коллекция фильмов
     * @return индекс «год → множество названий жанров»
     */
    public Map<Integer, Set<String>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0030");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
