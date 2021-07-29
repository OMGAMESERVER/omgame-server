package com.crionuke.omgameserver.runtime.events;

import com.crionuke.omgameserver.core.Address;

/**
 * @author Kirill Byvshev (k@byv.sh)
 * @version 1.0.0
 */
public class MessageReceivedEvent extends AddressedEvent {

    final long clientId;
    final String message;

    public MessageReceivedEvent(long clientId, Address address, String message) {
        super(address);
        this.clientId = clientId;
        this.message = message;
    }

    public long getClientId() {
        return clientId;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "MessageReceivedEvent{" +
                "address=" + address +
                ", clientId=" + clientId +
                ", message='" + message + '\'' +
                '}';
    }
}
