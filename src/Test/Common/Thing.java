package Test.Common;

import java.util.Objects;

public class Thing {

    int num;
    String name;

    public Thing(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Thing)) return false;
        Thing thing = (Thing) o;
        return num == thing.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num);
    }

    @Override
    public String toString() {
        return "Thing{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
