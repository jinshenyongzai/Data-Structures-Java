public class Main {

    public static void main(String[] args) {

//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++)
//            arr[i] = i;
//
//        int[] scores = new int[]{100, 99, 66};
//        for (int i = 0; i < scores.length; i++)
//            System.out.println(scores[i]);
//
//        for (int score : scores)
//            System.out.println(score);
//
//        scores[0] = 98;
//        for (int score : scores)
//            System.out.println(score);

        Array<Integer> arr = new Array<>(10);
        for (int i = 0; i < 10; i++)
            arr.addLast(i);
        System.out.println(arr);

        arr.add(1, 100);
        System.out.println(arr);

//        arr.addFirst(-1);
//        System.out.println(arr);

//        arr.addLast(10);
//        System.out.println(arr);
//        arr.remove(2);
//        System.out.println(arr);
//
        arr.removeElement(4);
        System.out.println(arr);
    }
}
