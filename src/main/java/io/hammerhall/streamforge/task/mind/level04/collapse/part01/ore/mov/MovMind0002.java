package io.hammerhall.streamforge.task.mind.level04.collapse.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

@DisplayName("Непотопляемые")
public class MovMind0002 extends Base {

    /**
     * Задание: Найти жанры, которые встречаются в каждом десятилетии, представленном в базе.
     * <p>
     * Описание: необходимо определить все десятилетия, которые представлены в базе
     * фильмов. Десятилетие вычисляется как год, округлённый вниз до десятков
     * (например, 1994 относится к 1990-м). Затем для каждого жанра нужно собрать
     * множество десятилетий, в которых встречались фильмы этого жанра. В результат
     * должны попасть только те жанры, которые встречаются во всех десятилетиях,
     * представленных в базе. Для каждого жанра возвращается отсортированное
     * множество десятилетий. Итоговая Map отсортирована по названию жанра
     * в алфавитном порядке.
     * Десятилетие считается представленным в базе, если к нему относится хотя бы
     * один фильм — в том числе фильм без жанров. Жанры различаются по названию:
     * одноимённые жанры с разными идентификаторами считаются одним жанром.
     *
     * @param movies коллекция фильмов
     * @return TreeMap, где ключ — название жанра, значение — отсортированное
     * множество десятилетий
     */
    public TreeMap<String, TreeSet<Integer>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovMind0002");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream().limit(20).forEach(IO::println);
    }
}
