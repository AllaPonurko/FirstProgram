package OOP.MyRepository.Interfaces;

public interface ICreateRepository<TypeId,TypeEntity> {
    public void create(TypeEntity item);
}
