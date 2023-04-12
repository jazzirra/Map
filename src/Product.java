public class Product implements Comparable {
    private String nameToy;

    public Product(String nameToy) {
        this.nameToy = nameToy;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameToy='" + nameToy + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        return this.nameToy.compareTo(((Product)o).nameToy);
    }
}