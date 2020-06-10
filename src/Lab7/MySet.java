package Lab7;

import java.util.Set;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Has three different constructors and implements various methods of Set interface
 * @version 1.0 10 June 2020
 * @author Bohdan Kovalenko
 */
public class MySet implements Set<Carriage> {
    private int size;
    private int normalsize = 15;
    private double increase = 1.3;
    private Object[] elem = new Object[normalsize];

    public MySet() {
        size = 0;
    }

    public MySet(Carriage c) {
        size = 1;
        elem[0] = c;
    }

    public MySet(Collection<Carriage> c) {
        size = 0;
        addAll(c);
    }

    private void increaseSize() {
        size = 0;
        Object[] a = elem;
        elem = new Object[(int)(elem.length*increase)];
        for (Object n : a) {
            add((Carriage)n);
        }
    }

    public int size () {
        return size;
    }

    private class Iter implements Iterator {
        private int i = 0;
        public boolean hasNext() {
            return i < lastNotEmpty();
        }
        public Object next() {
            while(hasNext()) {
                if (elem[i] == null) {
                    i++;
                } else {
                    return elem[i++];
                }
            }
            return null;
        }
    }

    public Iterator<Carriage> iterator() {
        return new Iter();
    }

    public boolean contains(Object o) {
        for (Object value : elem) {
            if (value == o) {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        Iter iter = (Iter)c.iterator();
        while (iter.hasNext()) {
            if(!contains(iter.next())) {
                return false;
            }
        }
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean add(Carriage c) {
        if (!contains(c)) {
            if (size == normalsize) {
                increaseSize();
            }
            for (int i = 0; i < elem.length; i++) {
                if (elem[i] == null) {
                    elem[i] = c;
                    size ++;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean addAll(Collection<? extends Carriage> c) {
        Iter iter = (Iter)c.iterator();
        if (size == normalsize) {
            increaseSize();
        }
        while (iter.hasNext()) {
            for (Object o : elem) {
                if (o == null) {
                    add((Carriage) iter.next());
                }
            }
        }
        return true;
    }

    public int lastNotEmpty() {
        int k = elem.length - 1;
        while (elem[k] == null) {
            k--;
        }
        return k + 1;
    }

    public boolean remove(Object o) {
        if(size == 0) {
            return false;
        }
        for (int i = 0; i < elem.length; i++) {
            if (elem[i] == o) {
                elem[i] = elem[lastNotEmpty()];
                elem[lastNotEmpty()] = null;
                size --;
                return true;
            }
        }
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        boolean check = false;
        for (Object n : c) {
            check |= remove(n);
        }
        return check;
    }

    public void clear() {
        Arrays.fill(elem, null);
        size = 0;
    }

    public Object[] toArray() {
        return Arrays.copyOf(elem, size);
    }

    public <E> E[] toArray(E[] a) {
        if (a.length < size) {
            return (E[])Arrays.copyOf(elem, size, a.getClass());
        }
        System.arraycopy(elem, 0, a, 0, size);
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }

    public boolean retainAll(Collection <?> c) {
        boolean check = false;
        for (Object n : elem) {
            if (!c.contains(n)) {
                check |= remove(n);
            }
        }
        return check;
    }
}
