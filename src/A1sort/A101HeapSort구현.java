package A1sort;

public class A101HeapSort구현 {
    public static void main(String[] args) {
        int[] arr = {7,6,5,8,3,5,9,1,6};
        //최초힙구성
        for(int i=arr.length/2-1; i>=0; i--){
            heapify(i);

        }
    }
    static void heapify(int parent){
        int left = parent*2+1;
        int right = parent*2+2;

    }
}
