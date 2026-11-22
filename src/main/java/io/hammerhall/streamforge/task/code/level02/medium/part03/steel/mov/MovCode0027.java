package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@DisplayName("Кроссворд в антракте")
public class MovCode0027 extends Base {

    /**
     * Задание: Построить обратный индекс слов названий фильмов для поиска по частичному совпадению.
     * <p>
     * Метки: [INVERTED_INDEX]
     * <p>
     * Описание: название каждого фильма разбивается на слова (по пробелам, в нижнем
     * регистре); строится индекс, сопоставляющий каждому слову множество фильмов, в
     * названии которых оно встречается. Такой обратный индекс позволяет быстро находить
     * фильмы по отдельному слову. Пустые слова игнорируются; регистр не учитывается.
     *
     * @param movies коллекция фильмов
     * @return индекс «слово → множество фильмов»
     */
    public Map<String, Set<Movie>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0027");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream()
                .limit(20)
                .forEach(entry -> IO.println(entry.getKey() + " — " + entry.getValue().size()));
    }
}
