
package il.cshaifasweng.OCSFMediatorExample.client;

import il.cshaifasweng.OCSFMediatorExample.entities.Message;

public class IDEvent {
    private Message message;

    public Message getId() {
        return message;
    }

    public IDEvent(Message message) {
        this.message = message;
    }
}
