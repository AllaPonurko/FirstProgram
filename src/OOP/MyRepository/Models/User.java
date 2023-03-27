package OOP.MyRepository.Models;
import lombok.Data;
import OOP.MyRepository.Interfaces.IEntity;
import java.util.UUID;
@Data
public class User implements IEntity<UUID> {
    public User() {
        this.id = UUID.randomUUID();
    }

    public User(String email) {
        this();
        this.email = email;
    }
    private UUID id;
    private String email;

@Override
    public UUID getId() {
    return id;
}

public String getName(User u)
{
    return u.email;
}
}
