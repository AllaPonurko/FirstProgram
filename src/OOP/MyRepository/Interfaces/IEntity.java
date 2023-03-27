package OOP.MyRepository.Interfaces;

public interface IEntity <TypeId>{
    public TypeId getId();


    public default void setId(TypeId id) {

    }
}
