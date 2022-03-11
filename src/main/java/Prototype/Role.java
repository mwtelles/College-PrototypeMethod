package Prototype;

public class Role implements Cloneable{
    private String function;
    private int workload;

    public Role(String function, int workload) {
        super();
        this.function = function;
        this.workload = workload;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Role{" +
                "function='" + function + '\'' +
                ", workload=" + workload +
                '}';
    }
}
