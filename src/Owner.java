public class Owner implements Cloneable {

    private String name;

    public Owner(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        Owner ow = (Owner)super.clone();
        return ow;
    }

    public Owner(Owner that) {
        this(that.getName());
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner that = (Owner) o;
        return this.name.equals(that.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
