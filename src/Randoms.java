import java.util.*;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    protected List<Integer> list = new ArrayList<>();

//    формируем коллекцию случайных чисел в указанном диапазоне с конечным числом 100
    public Randoms(int min, int max) {
        do {
            this.list.add(this.random.nextInt((max - min + 1) + min + 1));
        } while (this.random.nextInt((max - min + 1) + min + 1) != 100);
    }

//    Переопределяем итератор
    @Override
    public Iterator<Integer> iterator() {
//        создаем анонимный класс итератора с переопрделенными методами
        return new Iterator<>() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < list.size()) {
                    next++;
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public Integer next() {
                return list.get(next);
            }
        };
    }
}
