package listas.circulares;

public class Main {
    public static void main(String[] args) {

        ListaCircular<String> minhaListacircular = new ListaCircular<>();

        minhaListacircular.add("c0");
        System.out.println(minhaListacircular);

        minhaListacircular.remove(0);
        System.out.println(minhaListacircular);

        minhaListacircular.add("c2");
        minhaListacircular.add("c3");

        System.out.println(minhaListacircular);

        System.out.println(minhaListacircular.get(0));

        for (int i = 0; i < 20; i++) {
            System.out.println(minhaListacircular.get(i));

        }






    }
}
