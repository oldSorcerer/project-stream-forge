package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

import io.hammerhall.streamforge.domain.movie.Director;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@DisplayName("Картотека биографа")
public class MovCode0025 extends Base {

    /**
     * Задание: Построить индекс, сопоставляющий режиссёру годы его фильмов, а каждому
     * году — список вышедших в этом году фильмов режиссёра.
     * <p>
     * Описание: фильмы распределяются по режиссёрам, а внутри каждого режиссёра — по
     * году выхода. На нижнем уровне для пары «режиссёр и год» собран список его фильмов
     * этого года. Фильм с несколькими режиссёрами относится к каждому из них.
     * <p>
     * Концепт: двухуровневый индекс, где верхний ключ — режиссёр, вложенный — год, а
     * лист — фильмы, отвечающие обоим.
     *
     * @param movies коллекция фильмов
     * @return индекс «режиссёр → (год → список фильмов)»
     */
    public Map<Director, Map<Integer, List<Movie>>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0025");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream()
                .limit(20)
                .forEach(entry -> IO.println(entry.getKey() + " — " + entry.getValue().size()));
    }
}
