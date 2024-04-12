public class Main {
    public static void main(String[] args) {
        Triangolo triangolo = new Triangolo(6, 9);
        Rettangolo rettangolo = new Rettangolo(2.5, 6.7);
        System.out.println("L'are del triangolo è " + triangolo.calcoloArea());
        System.out.println("L'are del rettangolo è " + rettangolo.calcoloArea());
    }
}
