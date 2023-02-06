import java.util.*;

public class Randoms implements Iterable<Integer> {

    protected Random random = new Random();
    protected int max;
    protected  int min;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
    }

//  Переопределяем итератор
    @Override
    public Iterator<Integer> iterator() {
//  создаем анонимный класс итератора с переопрделенными методами
        return new Iterator<>() {

            @Override
            public boolean hasNext() {
//  т.к. итерация бесконечна и прерывается в main всегда возвращаем true
                return true;
            }

            @Override
            public Integer next() {
                return random.nextInt(max - min) + min + 1;
            }
        };
    }
}