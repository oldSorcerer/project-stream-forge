package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

import io.hammerhall.streamforge.domain.movie.Genre;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@DisplayName("Вкус публики")
public class MovCode0032 extends Base {

    /**
     * Задание: Найти название самого популярного жанра по количеству фильмов.
     * <p>
     * Метки: [TIE_BREAK]
     * <p>
     * Описание: необходимо определить жанр, который чаще всего встречается
     * в жанровых списках фильмов. Если несколько жанров имеют одинаковое количество
     * встреч, необходимо вернуть название жанра, которое идёт позже по алфавиту.
     *
     * @param movies коллекция фильмов
     * @return название самого популярного жанра
     * @throws NoSuchElementException если коллекция фильмов пустая
     *                                или не найдено ни одного жанра
     */
    public String task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0032");

        Collection<Movie> movies = movies();

        IO.println(task(movies));
    }
}
