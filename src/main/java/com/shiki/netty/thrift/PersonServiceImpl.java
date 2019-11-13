package com.shiki.netty.thrift;

import com.shiki.thrift.generated.DataException;
import com.shiki.thrift.generated.Person;
import com.shiki.thrift.generated.PersonService;
import org.apache.thrift.TException;

/**
 * @author: shiki
 * @date: 2019/11/11 下午8:17
 * @description:
 */
public class PersonServiceImpl implements PersonService.Iface {
    @Override
    public Person getPersonByUsername(String username) throws DataException, TException {
        System.out.println(username);
        return new Person()
                .setAge(18)
                .setUsername(username)
                .setMarried(false);
    }

    @Override
    public void savePerson(Person person) throws DataException, TException {
        System.out.println(person.age);
        System.out.println(person.username);
        System.out.println(person.married);
    }
}
