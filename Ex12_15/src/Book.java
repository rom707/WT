/**
 * Created by User on 15.09.2016.
 */
public class Book implements Comparable {
    private String title;
    private String author;
    private int price;
    private static int education;
    private int isbn;

    @Override
    public int compareTo(Object o) {
        Book item = (Book)o;
        if (this.isbn < item.isbn)
            return -1;
        else if (this.isbn > item.isbn)
            return 1;
        else
            return -0;
    }

    @Override
    public boolean equals(Object obj) {
        try {
            Book book = (Book) obj;
            if (title.compareTo((book.title)) == 0 &&
                    author.compareTo((book.title)) == 0 &&
                    price == book.price &&
                    education == book.education)
                return true;
            return false;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public int hashCode() {
        return new String(this.title+
                this.author+
                this.price+
                this.education).hashCode();
    }

    @Override
    public String toString() {
        return this.author + " " + this.title;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clone = new Book();
        clone.title = new String(this.title);
        clone.author = new String(this.author);
        clone.price = this.price;
        clone.education = this.education;
        return clone;
    }
}
