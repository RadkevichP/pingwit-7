package pl.pingwit.lec_11.point_4;

public class Mail extends PostItem {
    private PriorityLevel priorityLevel;

    public Mail(String from, String to, PriorityLevel priorityLevel) {
        super(from, to);
        this.priorityLevel = priorityLevel;
    }

    public PriorityLevel getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(PriorityLevel priorityLevel) {
        this.priorityLevel = priorityLevel;
    }
}
