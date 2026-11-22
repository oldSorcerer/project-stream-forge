package io.hammerhall.streamforge.task.code.level02.medium.part02.anvil.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

@DisplayName("Анфилада залов")
public class MovCode0021 extends Base {

    /**
     * Задание: Сгруппировать фильмы по десятилетиям.
     * <p>
     * Описание: необходимо сгруппировать фильмы по десятилетиям их выхода. Десятилетие
     * вычисляется как год, округлённый вниз до десятков: например, 1994 относится
     * к 1990-м, 2001 — к 2000-м, 2019 — к 2010-м. Для каждого десятилетия нужно собрать
     * список фильмов, вышедших в этом десятилетии.
     * <p>
     * Итоговая структура должна быть отсортирована по десятилетию в порядке возрастания.
     *
     * @param movies коллекция фильмов
     * @return отсортированная по десятилетию карта, где ключ — десятилетие,
     * а значение — список фильмов, вышедших в этом десятилетии
     */
    public TreeMap<Integer, List<Movie>> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovCode0021");

        Collection<Movie> movies = movies();

        task(movies).entrySet().stream()
                .limit(20)
                .forEach(entry -> IO.println(entry.getKey() + " — " + entry.getValue().size()));
    }
}
