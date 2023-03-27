package OOP.MyRepository;

import java.util.ArrayList;

public abstract class AbstractRepository<TypeId, TypeEntity> {
    protected ArrayList<TypeEntity> items = new ArrayList<>();
}
