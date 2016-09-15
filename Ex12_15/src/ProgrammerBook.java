/**
 * Created by User on 15.09.2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    @Override
    public boolean equals(Object obj) {
        try {
            ProgrammerBook pb = (ProgrammerBook) obj;
            if (language.compareTo((pb.language)) == 0 &&
                    level == pb.level &&
                    super.equals(obj))
                return true;
            return false;
        }
        catch (Exception e){
            return false;
        }
    }

    @Override
    public int hashCode() {
        return new String(super.hashCode() +
                this.language+
                this.level).hashCode();
    }

    @Override
    public String toString() {
        return super.toString() + this.language + " " + this.level;
    }
}
