public class Main {
    public static void main(String[] args) {
        PlaneUtill.getAllPlane()
                .stream()
                .forEach(plane -> System.out.println(plane));


        PlaneUtill.getAllPlane()
                .stream()
                .forEach(plane -> System.out.println(plane));
    }
}