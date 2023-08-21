package OnJava8.Chapter6;

class Person {
    public void eat(Fruit fruit) {
        Fruit peeled = fruit.getPeeled();
        if (peeled.cover.isCovered)
            System.out.println("Uwaaaaaa");
        else
            System.out.println("Yummy");
    }
}

class Cover {
    boolean isCovered;

    public Cover(boolean isCovered) {
        this.isCovered = isCovered;
    }
}


abstract class Fruit {
    public Cover cover;

    abstract Fruit getPeeled();
}

class Peeler {
    static <T extends Fruit> T peel(T fruit) {
        if (fruit.cover.isCovered) {
            fruit.cover.isCovered = false;
            System.out.println("Cover get peeled");
        }
        return fruit;
    }
}

class Apple extends Fruit {
    public Apple() {
        this.cover = new Cover(true);
    }

    @Override
    public Apple getPeeled() {
        return Peeler.peel(this);
    }
}

class Peach extends Fruit {
    public Peach() {
        this.cover = new Cover(false);
    }

    @Override
    Fruit getPeeled() {
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        Person jason = new Person();
        jason.eat(new Apple());
        jason.eat(new Peach());
    }
}
