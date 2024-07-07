import java.util.Objects;

public class Book {

    private String name;


    private Person rentedBy;

    public Book(String name, Person rentedBy) {
        this.name = name;
        this.rentedBy = rentedBy;


    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", rentedBy=" + rentedBy +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getRentedBy() {
        return rentedBy;
    }

    public void setRentedBy(Person rentedBy) {
        this.rentedBy = rentedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(rentedBy, book.rentedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rentedBy);
    }
}
