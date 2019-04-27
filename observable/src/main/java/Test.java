/**
 * @Author: wensp
 * @Version: v1.0 2019-4-27
 */
public class Test {
    public static void main(String[] args) {
        Gper gper = Gper.getInstance();

        Teacher tom = new Teacher("Tom");
        Teacher jack = new Teacher("jack");

        gper.addObserver(tom);
        gper.addObserver(jack);

        Question question = new Question();
        question.setUserName("zhangs");
        question.setFdContent("How do you do?");

        gper.publishQuestion(question);

    }
}
