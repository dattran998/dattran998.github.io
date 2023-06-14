public class Engineer extends Officer {
    private String branch;

    public Engineer(String name, int age, String gender, String address, String branch) {
        super(name, age, gender, address);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "branch='" + branch + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void show() {
        System.out.printf("%-7s|%-10s|%-2d|%-3s|%-10s|%-10s\n", "Engineer", name, age, gender, address, branch);
    }
}
