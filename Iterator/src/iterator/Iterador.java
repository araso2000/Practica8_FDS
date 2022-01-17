package iterator;

public interface Iterador {
    public Object next();
    public boolean hasNext();
    public int getSize();
    public void remove(int pos);
}
