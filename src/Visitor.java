class Visitor extends Person {
    private int age;

    public Visitor(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getMoreInfo() {
        return "Возраст: " + age;
    }
}