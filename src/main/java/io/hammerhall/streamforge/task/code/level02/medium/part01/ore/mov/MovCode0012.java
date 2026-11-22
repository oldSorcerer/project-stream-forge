package io.hammerhall.streamforge.task.code.level02.medium.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.Optional;

@DisplayName("Звонок дистрибьютора")
public class MovCode0012 extends Base {

    /**
     * Задание: Найти самый поздний фильм в базе.
     * <p>
     * Описание: необходимо найти фильм с максимальным годом выхода среди всех
     * фильмов из исходной коллекции. Если несколько фильмов имеют одинаковый
     * максимальный год, допускается вернуть любой из них. Если коллекция фильмов
     * пустая, результатом должен быть Optional.empty().
     *
     * @param movies коллекция фильмов
     * @return Optional с самым поздним фильмом или Optional.empty(),
     * если коллекция пуста
     */
    public Optional<Movie> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0012");

        Collection<Movie> movies = movies();

        IO.println(task(movies));
    }
}
