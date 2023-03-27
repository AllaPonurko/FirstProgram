package OOP;

import OOP.MyRepository.CrudRepository;
import OOP.MyRepository.Models.User;
import OOP.Parents.Child;

import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;

public class Work2503 implements Runnable
{
    @Override
    public void run() {
        myUsers();
    }
    void myUsers(){
        CrudRepository<UUID, User> users = new CrudRepository<>();
        users.create(new User("keeper@ninydev.com"));
        users.create(new User("nikitin_a@itstep.academy"));

        User toFind = new User("oleksandr.nykytin@tech.lab325.com");
        users.create(toFind);

        for (User user : users.readAll()
        ) {
            System.out.println(user.getName(user));
        }
        System.out.println("Find by Name");
        System.out.println(users.findById(toFind.getId()).getName(toFind));
    }
    void Override(){
        Child c=new Child();
        c.Do();
    }
        void myCollection() {
            Collection<String> list = new Collection<String>() {
                @Override
                public int size() {
                    return 0;
                }

                @Override
                public boolean isEmpty() {
                    return false;
                }

                @Override
                public boolean contains(Object o) {
                    return false;
                }

                @Override
                public Iterator<String> iterator() {
                    return null;
                }

                @Override
                public Object[] toArray() {
                    return new Object[0];
                }

                @Override
                public <T> T[] toArray(T[] a) {
                    return null;
                }

                @Override
                public boolean add(String s) {
                    return false;
                }

                @Override
                public boolean remove(Object o) {
                    return false;
                }

                @Override
                public boolean containsAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean addAll(Collection<? extends String> c) {
                    return false;
                }

                @Override
                public boolean removeAll(Collection<?> c) {
                    return false;
                }

                @Override
                public boolean retainAll(Collection<?> c) {
                    return false;
                }

                @Override
                public void clear() {

                }
            };
        }
    void repositoryCrud() {
        CrudRepository<Long, String> rep = new CrudRepository<>();
        rep.create("first");
        rep.create("second");
        rep.create("last");

        for (String str : rep.readAll()
        ) {
            System.out.println(str);
        }
    }

}
