public class House implements Cloneable{

    private int size;
    private Owner owner;

    public House(int size, Owner owner) {
        this.size = size;
        this.owner = owner;
    }

    public Object clone() throws CloneNotSupportedException {
        House house2 = (House) super.clone();
        house2.owner = (Owner) super.clone();
        return house2;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House that = (House) o;
        return this.owner.equals(that.getOwner()) && this.size == that.getSize();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
