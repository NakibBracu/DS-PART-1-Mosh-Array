public class MyCustomArrayclass {
    int[] a;
    int size;
    public MyCustomArrayclass(int length){
        a = new int[length];
    }
    public int count_elements(){//this method will return the elements of the array
        return size;
    }
    public void printArray(){
       // System.out.println(Arrays.toString(a));// buily_in_method
        if(size==0) {
            throw new NullPointerException();
        }
        System.out.print("["+a[0]);
        for(int i=1;i<size;i++){
            System.out.print(" ,"+a[i]);
        }
        System.out.println("]");
    }
    public void resize_array(){ // this method will inscrease the array size dynamically
        if(a.length == size) {
            int[] b = new int[size*2];
            for (int i = 0; i < size; i++) {
                b[i] = a[i];
            }
            a = b;//refer the new array to old array
        }
    }
    public void insert(int item){
        resize_array();
    a[size]= item;
    size++;
    }
    public void remove(int item){
        for(int i=0;i<size;i++){
            if(a[i] == item){
                for(;i<size;i++){
                    a[i]=a[i+1];
                }
                size--;
            }
        }
    }
    public void insertAt(int index,int item){
        if(index<0 || index>size){//this will give exception when it is - or bigger than array size
            throw new IllegalArgumentException();
        }
        resize_array();// if resize needed
        for(int i=size-1;i>=index;i--){
        a[i+1]=a[i];
        }
        a[index]= item;
        size++;
    }
    public void removeAt(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException();
        }
        for(int i=index;i<size-1;i++)
            a[i]=a[i+1];
        size--;
    }
    public int indexof(int item){
        //best case first item O(1)
        //worst case last item O(n) which is the main complexity so this methods complexity is O(n)
        for(int i=0;i<size;i++){
            if(a[i]==item){
                return i;
            }
        }
        return -1;
    }
    public void reverse() {
        int[] newItems = new int[size];

        for (int i = 0; i < size; i++)
            newItems[i] = a[size - i - 1]; // [10,20,30]old-->new[30,0,0]i0-->new[30,20,0]i1-->[30,20,10]i2

        a = newItems;
    }
    public int max() {
        // O(n): Because we have to iterate over
        // the entire array to find the largest
        // number. This number may be at the end
        // of the array (worst case scenario).
        int max = 0;
        for (int item : a)
            if (item > max)
                max = item;

        return max;
    }
//    public Array intersect(Array other) {
//        var intersection = new Array(count);
//
//        for (int item : items)
//            if (other.indexOf(item) >= 0)
//                intersection.insert(item);
//
//        return intersection;
//    }




}
