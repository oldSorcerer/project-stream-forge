package io.hammerhall.streamforge.task.code.level02.medium.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Тематическая неделя")
public class MovCode0014 extends Base {

    /**
     * Задание: Найти все фильмы заданного жанра.
     * <p>
     * Описание: необходимо отфильтровать коллекцию фильмов и оставить только те,
     * у которых среди жанров присутствует жанр с указанным названием.
     * Сравнение выполняется по названию жанра, с учётом регистра.
     * <p>
     * Порядок фильмов в результате соответствует порядку обхода исходной коллекции.
     *
     * @param movies    коллекция фильмов
     * @param genreName название жанра, фильмы которого нужно найти
     * @return список фильмов указанного жанра
     */
    public List<Movie> task(@NonNull Collection<Movie> movies, @NonNull String genreName) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0014");

        Collection<Movie> movies = movies();

        String genreName = "Drama";

        task(movies, genreName).stream().limit(20).forEach(IO::println);
    }
}
