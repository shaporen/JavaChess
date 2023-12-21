package main;

import java.util.*;

public class Cordinates {
    public final File file;
    public final Integer rank;

    public Cordinates(File file, Integer rank) {
        this.file = file;
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cordinates that = (Cordinates) o;
        return file == that.file && rank.equals(that.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, rank);
    }
}
