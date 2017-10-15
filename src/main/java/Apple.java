/**
 * Apple
 * @author admin
 * @date 2017/10/15
 */
public class Apple {

    private int size;

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(o.getClass() != Apple.class) {
            return false;
        }

        return ((Apple)o).getSize() == this.size;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
