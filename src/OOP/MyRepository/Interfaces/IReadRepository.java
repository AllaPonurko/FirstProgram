package OOP.MyRepository.Interfaces;

import java.util.ArrayList;

public interface IReadRepository <TypeId,TypeEntity>{
    public ArrayList<TypeEntity> readAll();

    public TypeEntity findById(TypeId id);

    public TypeEntity findByIndex(int index);
    public TypeEntity findByNum(int num);
}
