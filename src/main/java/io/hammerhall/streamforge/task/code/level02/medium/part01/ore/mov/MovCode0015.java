package io.hammerhall.streamforge.task.code.level02.medium.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Ретроспектива в синематеке")
public class MovCode0015 extends Base {

    /**
     * Задание: Найти все фильмы заданного режиссёра.
     * <p>
     * Описание: необходимо отфильтровать коллекцию фильмов и оставить только те,
     * у которых среди режиссёров присутствует режиссёр с указанным именем.
     * Сравнение выполняется по имени режиссёра.
     * <p>
     * Порядок фильмов в результате соответствует порядку обхода исходной коллекции.
     *
     * @param movies       коллекция фильмов
     * @param directorName имя режиссёра, фильмы которого нужно найти
     * @return список фильмов указанного режиссёра
     */
    public List<Movie> task(@NonNull Collection<Movie> movies, @NonNull String directorName) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0015");

        Collection<Movie> movies = movies();

        String directorName = "Steven Spielberg";

        task(movies, directorName).stream().limit(20).forEach(IO::println);
    }
}
