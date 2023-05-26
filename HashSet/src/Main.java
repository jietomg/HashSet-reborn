public class Main {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        hashSet.add(8);
        hashSet.add(7);
        hashSet.add(2);
        hashSet.add(9);
        hashSet.add(5);
        hashSet.remove(4);
        System.out.println(hashSet.size());
    }
}
