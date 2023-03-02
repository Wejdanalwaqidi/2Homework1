public class Q2 {
    public static void main(String[] args) {
        int[] r={1,2,3,4,5,6};
        int[] copy={2,3,3,5,4,5};
        System.arraycopy(r,0,copy,0,r.length);
        for(int i:copy)
            System.out.println(i);
    }
}