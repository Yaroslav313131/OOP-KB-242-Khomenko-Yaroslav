package lab03;

public class Ticket {
    private final int id;
    private final String name;
    private final int estimate;
    private boolean isCompleted;

    public Ticket(int id, String name, int estimate) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name error");
        if (estimate <= 0) throw new IllegalArgumentException("Estimate <= 0");
        if (id <= 0) throw new IllegalArgumentException("ID <= 0");

        this.id = id;
        this.name = name;
        this.estimate = estimate;
        this.isCompleted = false;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getEstimate() { return estimate; }
    public boolean isCompleted() { return isCompleted; }

    public void complete() { this.isCompleted = true; }
}