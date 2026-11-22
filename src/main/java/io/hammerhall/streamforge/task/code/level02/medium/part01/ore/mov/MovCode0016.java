package io.hammerhall.streamforge.task.code.level02.medium.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@DisplayName("Ящики прокатной конторы")
public class MovCode0016 extends Base {

    /**
     * Задание: Сгруппировать фильмы по количеству жанров.
     * <p>
     * Описание: необходимо сгруппировать фильмы по количеству жанров, указанных
     * у каждого фильма. Ключом итоговой Map является количество жанров, а значением
     * — список фильмов, у которых ровно такое количество жанров.
     * <p>
     * Порядок фильмов внутри группы соответствует порядку обхода исходной коллекции.
     *
     * @param movies коллекция фильмов
     * @return Map, где ключ — количество жанров, значение — список фильмов
     * с таким количеством жанров
     */
    public Map<Integer, List<Movie>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0016");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream()
                .limit(20)
                .forEach(entry -> IO.println(entry.getKey() + " — " + entry.getValue().size()));
    }
}
