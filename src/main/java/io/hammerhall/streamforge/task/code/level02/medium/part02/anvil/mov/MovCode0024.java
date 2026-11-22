package io.hammerhall.streamforge.task.code.level02.medium.part02.anvil.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@DisplayName("Золотая полка")
public class MovCode0024 extends Base {

    /**
     * Задание: Собрать список примечательных фильмов.
     * <p>
     * Описание: по переданной коллекции фильмов необходимо собрать список,
     * включающий:
     * 1. самый ранний по году выхода фильм;
     * 2. самый поздний по году выхода фильм;
     * 3. фильм с наибольшим числом жанров.
     * <p>
     * Если какой-либо из фильмов определить невозможно (например, коллекция пуста),
     * он в результат не добавляется. Повторяющиеся фильмы в результате не дублируются.
     * Для пустой коллекции возвращается пустой список.
     *
     * @param movies коллекция фильмов
     * @return список примечательных фильмов без повторов; пустой список, если их нет
     */
    public List<Movie> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0024");

        Collection<Movie> movies = movies();

        task(movies).stream().limit(20).forEach(IO::println);
    }
}
