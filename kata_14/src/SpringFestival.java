import java.util.ArrayList;
import java.util.List;

public class SpringFestival {

    String name;
    List<Event> events = new ArrayList<>();

    public SpringFestival(String name) {
        this.name = name;
    }

    public void addEvent(Event event) {
        this.events.add(event);
    }

    public List<String> getAvailableEvents() {
        List<String> availableEvents = new ArrayList<>();
        for (Event event : this.events) {
            if (!event.isFull()) {
                availableEvents.add(event.getName());
            }
        }
        return availableEvents;
    }

    public List<String> getConflictingEvents(Event event) {
        // chercher une fonction "filter" pour simplifier cette fonction
        List<String> conflictingEvents = new ArrayList<>();
        for (Event comparingEvent : this.events) {
            if (!comparingEvent.hasConflictWith(event)) {
                conflictingEvents.add(comparingEvent.getName());
            }
        }
        return conflictingEvents;
    }
}