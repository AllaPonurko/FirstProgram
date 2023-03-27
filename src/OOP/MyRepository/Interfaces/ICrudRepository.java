package OOP.MyRepository.Interfaces;

public interface ICrudRepository <TypeId,TypeEntity> extends
        ICreateRepository<TypeId,TypeEntity>,
        IDeleteRepository<TypeId,TypeEntity>,
        IUpdateRepository<TypeId,TypeEntity>,
        IReadRepository<TypeId,TypeEntity>
{
}
