public class Event {
    private final String name;
    private final int startHour;
    private final int endHour;
    private final int maxParticipants;
    private int registeredParticipants = 0;

    public Event(String name, int startHour, int endHour, int maxParticipants) {
        this.name = name;
        if (startHour < endHour && maxParticipants > 0) {
            this.startHour = startHour;
            this.endHour = endHour;
            this.maxParticipants = maxParticipants;
        } else {
            throw new IllegalArgumentException("l'heure de départ doit être inférieure à l'heure de fin, et le nombre maximum de participants doit e^tre supérieur à 0");
        }
    }

    public boolean register(int count) {
        if (count <= 0 || this.registeredParticipants + count > this.maxParticipants) {
            return false;
        }
        registeredParticipants += count;
        return true;
    }

    public boolean isFull() {
        return registeredParticipants == maxParticipants;
    }

    public int getRemainingPlaces() {
        return maxParticipants - registeredParticipants;
    }

    public boolean hasConflictWith(Event otherEvent) {
        return (this.startHour < otherEvent.endHour && otherEvent.startHour < this.endHour);
    }

    public String getName() {
        return name;
    }
}