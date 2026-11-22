package io.hammerhall.streamforge.task.code.level03.hard.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Director;
import io.hammerhall.streamforge.domain.movie.Genre;
import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@DisplayName("Шкаф с кассетами")
public class MovCode0036 extends Base {

    /**
     * Задание: Построить обратный индекс, сопоставляющий жанру его режиссёров, а каждому
     * такому режиссёру — множество его фильмов этого жанра.
     * <p>
     * Описание: фильмы распределяются в трёхуровневую структуру. Верхний уровень — жанр;
     * внутри жанра — режиссёры фильмов этого жанра; на нижнем уровне для пары «жанр и
     * режиссёр» собраны все фильмы этого режиссёра, относящиеся к этому жанру, без
     * повторений. Фильм с несколькими жанрами и несколькими режиссёрами участвует во
     * всех соответствующих сочетаниях.
     * <p>
     * Концепт: обращение исходной связи «фильм → его жанры и режиссёры» в индекс, где
     * путь до нижнего уровня ведёт от жанра через режиссёра, а листья не содержат
     * дубликатов.
     *
     * @param movies коллекция фильмов
     * @return индекс «жанр → (режиссёр → множество фильмов)»
     */
    public Map<Genre, Map<Director, Set<Movie>>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    // Промежуточная тройка для раскрытия «фильм → его (жанр, режиссёр) пары».
    private record GenreDirectorMovie(Genre genre, Director director, Movie movie) {
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0036");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream()
                .limit(20)
                .forEach(entry -> IO.println(entry.getKey() + " — " + entry.getValue().size()));
    }
}
