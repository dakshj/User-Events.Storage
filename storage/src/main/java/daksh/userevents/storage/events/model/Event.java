package daksh.userevents.storage.events.model;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

import java.io.Serializable;
import java.util.Map;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import daksh.userevents.storage.events.constants.DataConstants;

/**
 * Created by daksh on 22-May-16.
 */

@XmlRootElement
@Entity(DataConstants.COLLECTION_NAME)
public class Event implements Serializable {

    @Id
    @XmlElement
    private ObjectId id;

    @XmlElement
    private String name;

    @XmlElement(name = DataConstants.USER_PROPERTIES)
    @Property(DataConstants.USER_PROPERTIES)
    private Map<String, String> userProperties;

    @XmlElement(name = DataConstants.DEFAULT_PROPERTIES)
    @Property(DataConstants.DEFAULT_PROPERTIES)
    private Map<String, String> defaultProperties;

    public Event() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getUserProperties() {
        return userProperties;
    }

    public void setUserProperties(Map<String, String> userProperties) {
        this.userProperties = userProperties;
    }

    public Map<String, String> getDefaultProperties() {
        return defaultProperties;
    }

    public void setDefaultProperties(Map<String, String> defaultProperties) {
        this.defaultProperties = defaultProperties;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", userProperties=" + userProperties +
                ", defaultProperties=" + defaultProperties +
                '}';
    }
}