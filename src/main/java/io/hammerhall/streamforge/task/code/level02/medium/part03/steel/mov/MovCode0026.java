package io.hammerhall.streamforge.task.code.level02.medium.part03.steel.mov;

import io.hammerhall.streamforge.domain.movie.Director;
import io.hammerhall.streamforge.domain.movie.Genre;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@DisplayName("Пасьянс программного директора")
public class MovCode0026 extends Base {

    /**
     * Задание: Построить индекс «пара (жанр, режиссёр) → список фильмов».
     * <p>
     * Описание: ключом является сочетание жанра и режиссёра, а значением — фильмы
     * этого жанра, снятые этим режиссёром. Один фильм порождает пару для каждого
     * сочетания своих жанров и режиссёров, поэтому при нескольких жанрах или
     * режиссёрах он попадает сразу в несколько пар.
     *
     * @param movies коллекция фильмов
     * @return индекс «(жанр, режиссёр) → список фильмов»
     */
    public Map<GenreDirector, List<Movie>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    /**
     * Составной ключ индекса — пара из жанра и режиссёра.
     *
     * @param genre    жанр
     * @param director режиссёр
     */
    public record GenreDirector(Genre genre, Director director) {

        @Override
        public String toString() {
            return "%s / %s".formatted(genre.getName(), director.getFullName());
        }
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0026");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
