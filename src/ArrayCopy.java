import java.util.Arrays;

public class ArrayCopy {
    int [] arrayToCopy;
    int [] arrayWhereCopy;
    public void arrayCopy (){
        arrayToCopy = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        arrayWhereCopy = new int [arrayToCopy.length*2];
        System.arraycopy(arrayToCopy,0,arrayWhereCopy, arrayToCopy.length/2, arrayToCopy.length );
        System.out.println(Arrays.toString(arrayWhereCopy));
    }
}
