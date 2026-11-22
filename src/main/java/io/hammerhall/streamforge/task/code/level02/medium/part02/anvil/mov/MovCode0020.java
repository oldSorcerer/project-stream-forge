package io.hammerhall.streamforge.task.code.level02.medium.part02.anvil.mov;

import io.hammerhall.streamforge.domain.movie.Genre;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;

@DisplayName("Стенгазета кинотеатра")
public class MovCode0020 extends Base {

    /**
     * Задание: Посчитать количество встреч каждого жанра.
     * <p>
     * Описание: необходимо определить, сколько раз каждый жанр встречается
     * в коллекции фильмов. Каждое вхождение жанра у фильма считается отдельно.
     * Ключом результирующей карты является название жанра, значением —
     * количество его встреч среди всех фильмов.
     *
     * @param movies коллекция фильмов
     * @return карта, где ключ — название жанра, значение — количество встреч
     * этого жанра среди фильмов
     */
    public Map<String, Long> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0020");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
