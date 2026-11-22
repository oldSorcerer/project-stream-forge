package io.hammerhall.streamforge.task.mind.level04.collapse.part01.ore.mov;

import io.hammerhall.streamforge.domain.movie.Movie;
import io.hammerhall.streamforge.task.Base;
import lombok.NonNull;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

@DisplayName("Родственные души")
public class MovMind0004 extends Base {

    /**
     * Задание: Найти группы режиссёров, у которых одинаковый набор из двух и более жанров.
     * <p>
     * Метки: [GROUPING_BY_SET]
     * <p>
     * Описание: необходимо для каждого режиссёра собрать множество уникальных жанров фильмов,
     * над которыми он работал.
     * Режиссёры различаются по полному имени ({@code getFullName()}): тёзки считаются
     * одним режиссёром, их жанры объединяются. Жанры различаются по названию:
     * одноимённые жанры считаются одним жанром.
     * <p>
     * Если фильм содержит несколько жанров, каждый жанр фильма должен попасть
     * в жанровый набор каждого режиссёра этого фильма.
     * Если фильм связан с несколькими режиссёрами, каждый режиссёр получает
     * вклад от всех жанров этого фильма.
     * <p>
     * Затем нужно сгруппировать режиссёров по их полному жанровому набору.
     * <p>
     * В результат должны попасть только такие группы, в которых:
     * 1. одинаковый жанровый набор имеют как минимум два режиссёра;
     * 2. сам жанровый набор содержит как минимум два жанра.
     * <p>
     * Например, если:
     * режиссёр A работал в жанрах {@code Action, Drama},
     * режиссёр B работал в жанрах {@code Drama, Action},
     * режиссёр C работал в жанрах {@code Comedy},
     * то режиссёры A и B образуют одну группу с жанровым набором
     * {@code [Action, Drama]}, а режиссёр C в результат не попадает.
     * <p>
     * Жанры внутри каждой группы должны быть отсортированы по алфавиту.
     * Имена режиссёров внутри каждой группы должны быть отсортированы
     * по алфавиту.
     * <p>
     * Итоговый список групп должен быть отсортирован:
     * 1. по убыванию количества режиссёров в группе;
     * 2. при равенстве — по убыванию количества жанров в группе;
     * 3. при равенстве — по первому имени режиссёра в группе
     * в алфавитном порядке.
     *
     * @param movies коллекция фильмов
     * @return список групп режиссёров с одинаковыми жанровыми наборами
     */
    public List<DirectorGenreProfileGroup> task(@NonNull Collection<Movie> movies) {
        throw new UnsupportedOperationException("Реализуйте метод");
    }

    /**
     * Группа режиссёров с идентичным полным набором жанров.
     * <p>
     * Жанры и имена режиссёров внутри группы отсортированы по алфавиту.
     * Количество жанров, количество режиссёров и первое имя вычисляются методами
     * {@link #genreCount()}, {@link #directorCount()} и {@link #firstDirectorName()},
     * чтобы избежать дублирования данных в полях.
     * <p>
     * По условию задачи используется только для групп с ≥ 2 жанрами и ≥ 2 режиссёрами.
     *
     * @param genreNames    отсортированное множество жанров (общее для всех режиссёров группы)
     * @param directorNames отсортированный список имён режиссёров с точно таким же набором жанров
     */
    private record DirectorGenreProfileGroup(SortedSet<String> genreNames, List<String> directorNames) {

        /**
         * Возвращает количество жанров в общем наборе группы.
         *
         * @return размер множества жанров
         */
        int genreCount() {
            throw new UnsupportedOperationException("Реализуйте метод");
        }

        /**
         * Возвращает количество режиссёров в группе.
         *
         * @return размер списка режиссёров
         */
        int directorCount() {
            throw new UnsupportedOperationException("Реализуйте метод");
        }

        /**
         * Возвращает лексикографически первое имя режиссёра в группе.
         *
         * @return первое имя режиссёра или пустая строка, если список пуст
         */
        String firstDirectorName() {
            throw new UnsupportedOperationException("Реализуйте метод");
        }

        @Override
        public String toString() {
            return "Жанры: %s | Количество жанров: %d | Количество режиссёров: %d | Режиссёры: %s"
                    .formatted(genreNames, genreCount(), directorCount(), directorNames);
        }
    }

    @Test
    void runTask() {
        IO.println("Это вывод, а не проверка. Проверить решение: ./hammerhall submit MovMind0004");

        Collection<Movie> movies = movies();

        task(movies).stream()
                .limit(20)
                .forEach(group -> IO.println(group.genreNames() + " — режиссёров: " + group.directorNames().size()));
    }
}
