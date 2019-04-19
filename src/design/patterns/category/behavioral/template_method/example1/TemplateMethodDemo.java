package design.patterns.category.behavioral.template_method.example1;

public class TemplateMethodDemo {

    public static void main(String[] args) {
        Generalization algorithm = new Realization();
        algorithm.findSolution();
    }
}
