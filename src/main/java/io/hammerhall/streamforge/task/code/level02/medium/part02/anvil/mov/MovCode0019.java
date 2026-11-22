package io.hammerhall.streamforge.task.code.level02.medium.part02.anvil.mov;

import io.hammerhall.streamforge.domain.movie.Director;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

@DisplayName("Пригласительные на фестиваль")
public class MovCode0019 extends Base {

    /**
     * Задание: Получить список всех режиссёров фильмов без создания промежуточных коллекций.
     * <p>
     * Описание: каждый фильм может иметь нескольких режиссёров. Необходимо
     * извлечь всех режиссёров из всех фильмов, сохранив порядок их
     * появления (сначала все режиссёры первого фильма, затем второго и так
     * далее). Повторяющиеся режиссёры не удаляются. Для пустой коллекции
     * фильмов возвращается пустой список.
     *
     * @param movies коллекция фильмов
     * @return список всех режиссёров в порядке появления
     */
    public List<Director> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0019");

        Collection<Movie> movies = movies();

        task(movies).stream().limit(20).forEach(IO::println);
    }
}
