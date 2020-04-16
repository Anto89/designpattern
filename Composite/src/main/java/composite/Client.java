package composite;

public class Client {
    public static void main(String... args) {
        TreeElement file1 = new File("File 1");
        TreeElement file2 = new File("File 2");
        TreeElement file3 = new File("File 3");
        Directory directory = new Directory("Directory");
        Directory root = new Directory("Root");

        root.addElement(file1);
        directory.addElement(file2);
        directory.addElement(file3);
        root.addElement(directory);

        root.printName("");
    }
}
