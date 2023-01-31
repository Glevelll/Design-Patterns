public class ComputerPartDisplayVisitor implements ComputerPartVisitor { //конкретный посетитель

    @Override
    public void visit(Computer computer) {
        System.out.println("Компьютер включен");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Мышь подключена");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Клавиатура подключена");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Монитор включен");
    }
}
