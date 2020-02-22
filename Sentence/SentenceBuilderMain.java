public class SentenceBuilderMain {
  public static void main(String[] args) {
    SentenceBuilder sb=new SentenceBuilder();
    System.out.println(sb.build());
  }
}
class SentenceBuilder {
  public StringBuilder build() {
    StringBuilder sb=new StringBuilder();
    String[] subjects = {"I", "We", "You", "A friend of mine"};
    String[] verbs = {"play", "love", "eat"};
    String[] objects = {"a football", "to cook"};
    int rand1 = (int) (Math.random() * subjects.length);
    int rand2 = (int) (Math.random() * verbs.length);
    int rand3 = (int) (Math.random() * objects.length);
    sb.append(subjects[rand1]);
    sb.append(" ");
    sb.append(verbs[rand2]);
    sb.append(" ");
    sb.append(objects[rand3]);
    return sb;
  }
}
