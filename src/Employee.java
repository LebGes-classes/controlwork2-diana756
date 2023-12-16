class Employee extends Person {
    private String position;

    public Employee(String fullName, String position) {
        this.fullName = fullName;
        this.position = position;
    }

    public String getMoreInfo() {
        return "Должность: " + position;
    }
}
