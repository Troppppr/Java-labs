

public class Athlete {
    private String name;
    private Boolean ready;
    private int result;

    public Athlete(String name) {
        this.name = name;
        this.ready = true;
    }

    @Override
    public String toString() {
        return "Атлет {" +
                "Имя: '" + name  +
                ", Статус: " + ready +
                ", Результат = " + result +
                '}';
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getReady() {
        return ready;
    }

    public void setReady(Boolean ready) {
        this.ready = ready;
    }
}
