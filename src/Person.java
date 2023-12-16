abstract class Person {
    protected String fullName;

    public void printInfo() {
        System.out.println("Имя: " + getLastName());
        System.out.println(getMoreInfo());
    }

    public String getLastName() {
        String[] names = fullName.split(" ");
        return names[names.length - 1];
    }

    public abstract String getMoreInfo();
}
