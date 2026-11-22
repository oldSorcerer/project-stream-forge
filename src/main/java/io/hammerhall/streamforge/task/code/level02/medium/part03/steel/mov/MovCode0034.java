package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

@DisplayName("Собрание сочинений")
public class MovCode0034 extends Base {

    /**
     * Задание: Построить индекс «режиссёр → {@link NavigableSet} его фильмов»
     * с сортировкой фильмов по году и названию.
     * <p>
     * Описание: необходимо сопоставить каждому режиссёру набор его фильмов,
     * упорядоченный по году выхода, а при равенстве года — по названию. Индекс
     * упорядочен по имени режиссёра.
     *
     * @param movies коллекция фильмов
     * @return индекс «имя режиссёра → отсортированный набор его фильмов»
     */
    public Map<String, NavigableSet<Movie>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0034");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream()
                .limit(20)
                .forEach(entry -> IO.println(entry.getKey() + " — " + entry.getValue().size()));
    }
}
