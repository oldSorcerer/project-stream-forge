package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

@DisplayName("Аллея славы")
public class MovCode0035 extends Base {

    /**
     * Задание: Построить неизменяемый индекс «год выхода → фильм с наивысшим рейтингом этого года».
     * <p>
     * Метки: [MERGE_COLLISION], [TIE_BREAK], [IMMUTABLE]
     * <p>
     * Описание: необходимо для каждого года выхода определить фильм с наибольшим
     * рейтингом ({@code rank}) среди вышедших в этом году. Фильмы без рейтинга
     * ({@code rank == null}) в расчёте не участвуют и в индекс не попадают.
     * <p>
     * Если в одном году несколько фильмов делят наивысший рейтинг, выбирается фильм
     * с лексикографически меньшим названием. Итоговый индекс должен быть неизменяемым;
     * годы, в которых нет ни одного фильма с рейтингом, в индексе отсутствуют.
     *
     * @param movies коллекция фильмов
     * @return неизменяемый индекс «год → фильм с наивысшим рейтингом»
     */
    public Map<Integer, Movie> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0035");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
