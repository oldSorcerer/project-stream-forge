package io.hammerhall.streamforge.task.mind.level04.collapse.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@DisplayName("Не та бобина")
public class MovMind0001 extends Base {

    /**
     * Задание: Найти дубли фильмов по названию.
     * <p>
     * Описание: необходимо сгруппировать фильмы по их названию и оставить только
     * те группы, в которых оказалось больше одного фильма, то есть одноимённые
     * фильмы (ремейки, фильмы-тёзки разных лет и т.п.). Результат возвращается в
     * виде ассоциативного массива, где ключ — название, а значение — список
     * фильмов с этим названием.
     * Названия сравниваются с учётом регистра. Фильмы в каждом списке идут
     * в порядке обхода исходной коллекции.
     *
     * @param movies коллекция фильмов
     * @return ассоциативный массив «название → список одноимённых фильмов»
     */
    public Map<String, List<Movie>> task(@NonNull Collection<Movie> movies) {
        return movies.stream()
                .collect(Collectors.groupingBy(Movie::getTitle ));
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovMind0001");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
