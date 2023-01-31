public interface ComputerPart { //представление элемента
    public void accept(ComputerPartVisitor computerPartVisitor);
}