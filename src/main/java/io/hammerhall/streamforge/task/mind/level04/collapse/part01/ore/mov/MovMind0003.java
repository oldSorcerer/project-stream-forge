package io.hammerhall.streamforge.task.mind.level04.collapse.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Genre;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

@DisplayName("Бинго синефила")
public class MovMind0003 extends Base {

    /**
     * Задание: Найти годы, где совокупность фильмов покрывает все жанры из заданного набора.
     * <p>
     * Описание: необходимо сгруппировать фильмы по году выхода и для каждого года
     * собрать множество уникальных названий жанров, встречающихся у фильмов этого года.
     * Один фильм может относиться к нескольким жанрам, поэтому каждый жанр учитывается
     * при построении жанрового множества года.
     * <p>
     * В результат попадают только те годы, где совокупное множество жанров содержит
     * <b>все</b> названия из {@code requiredGenreNames}. Например, если передан набор
     * {@code {"Drama", "Comedy", "Crime"}}, год попадёт в результат, только когда среди
     * фильмов этого года представлены все три жанра. Необязательно, чтобы они были
     * в одном фильме — жанры могут быть распределены между разными фильмами одного года.
     * Названия жанров сравниваются с учётом регистра.
     * <p>
     * Если {@code requiredGenreNames} пуст, условие покрытия считается выполненным
     * для каждого года из коллекции. Результат возвращается в порядке возрастания года.
     *
     * @param movies             коллекция фильмов
     * @param requiredGenreNames набор обязательных названий жанров
     * @return отсортированный по возрастанию список годов, покрывающих все обязательные жанры
     */
    public List<Integer> task(@NonNull Collection<Movie> movies, @NonNull Set<String> requiredGenreNames) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovMind0003");

        Collection<Movie> movies = movies();

        Set<String> requiredGenreNames = Set.of("Drama", "Crime");

        task(movies, requiredGenreNames).stream().limit(20).forEach(IO::println);
    }
}
