package lab03;

import java.util.Arrays;

public class Sprint {
    private final int capacity;
    private final int ticketLimit;
    private final Ticket[] tickets;
    private int ticketCount = 0;

    public Sprint(int capacity, int ticketLimit) {
        this.capacity = capacity;
        this.ticketLimit = ticketLimit;
        this.tickets = new Ticket[ticketLimit];
    }

    public boolean addUserStory(UserStory userStory) {
        return addTicket(userStory);
    }

    public boolean addBug(Bug bugReport) {
        return addTicket(bugReport);
    }

    private boolean addTicket(Ticket t) {
        if (t == null || t.isCompleted()) return false;
        if (ticketCount >= ticketLimit) return false;
        if (getTotalEstimate() + t.getEstimate() > capacity) return false;

        tickets[ticketCount++] = t;
        return true;
    }

    public int getTotalEstimate() {
        int total = 0;
        for (int i = 0; i < ticketCount; i++) {
            total += tickets[i].getEstimate();
        }
        return total;
    }

    public Ticket[] getTickets() {
        return Arrays.copyOf(tickets, ticketCount);
    }
}