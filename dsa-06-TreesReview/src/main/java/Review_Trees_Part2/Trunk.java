package Review_Trees_Part2;

public class Trunk {

    Trunk prev;
    String str;

    public Trunk(Trunk prev, String str) {
        this.prev = prev;
        this.str = str;
    }
}
