public class Main {
    public static void main(String[] args) {
        IIt obj = new IIt();
        obj.study();
        obj.stream();
        obj.study(8);
    }
}

class IIt extends Nit {
    void study() {
        System.out.println("study hard");
    }

    void study(int num) {
        System.out.println("Number of students" + " " + num);
    }
}

abstract class Nit{
    Nit() {
        System.out.println("In NIT Scope");
    }

    abstract void study();

    void stream() {
        System.out.println("Circuital");
    }
}
