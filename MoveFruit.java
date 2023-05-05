package ru.geekbrains;

public class MoveFruit<T extends Box<? extends Fruit>> {
    private final T from;
    private final T to;


    public MoveFruit(T from, T to) {
        this.from = from;
        this.to = to;

    }

    public void move() {
        Comparable<Object> weight = null;
//        if (from.getWeight() == weight) {
            System.out.printf("пересыпаем фрукты из коробки в коробку %.2s руб.\n", from.getCountFruit());
            System.out.printf("коробка из которой высываем : #%s: %.2f руб.\nКоробка в которую засыпаем: #%s: %.2f руб.\n",
                    from.getCountFruit(), from.getAllWeight(), to.getCountFruit(), to.getAllWeight());
            from.setAllWeight(to.getAllWeight());
            to.setAllWeight(from.getAllWeight());
            System.out.println("Текущее состояние коробок:");
            System.out.println(from);
            System.out.println(to);
//        } else {
//            System.out.println("Операция невозможна.");
//        }
    }

}

