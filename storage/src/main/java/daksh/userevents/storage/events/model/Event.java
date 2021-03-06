package daksh.userevents.storage.events.model;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Property;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import daksh.userevents.storage.common.api.ObjectIdJsonSerializer;
import daksh.userevents.storage.common.model.Model;
import daksh.userevents.storage.devices.constants.DeviceNetworkConstants;
import daksh.userevents.storage.users.constants.UserNetworkConstants;

/**
 * Created by daksh on 22-May-16.
 */

@XmlRootElement
@Entity(noClassnameStored = true)
public class Event extends Model {

    @XmlElement(name = UserNetworkConstants.USER_ID)
    @Property(UserNetworkConstants.USER_ID)
    @JsonSerialize(using = ObjectIdJsonSerializer.class)
    private ObjectId userId;

    @XmlElement(name = DeviceNetworkConstants.DEVICE_ID)
    @Property(DeviceNetworkConstants.DEVICE_ID)
    @JsonSerialize(using = ObjectIdJsonSerializer.class)
    private ObjectId deviceId;

    public ObjectId getUserId() {
        return userId;
    }

    public void setUserId(ObjectId userId) {
        this.userId = userId;
    }

    public ObjectId getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(ObjectId deviceId) {
        this.deviceId = deviceId;
    }
}
