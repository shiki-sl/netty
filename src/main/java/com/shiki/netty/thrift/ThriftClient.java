package com.shiki.netty.thrift;

import com.shiki.thrift.generated.Person;
import com.shiki.thrift.generated.PersonService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * @author: shiki
 * @date: 2019/11/12 下午4:28
 * @description:
 */
public class ThriftClient {
    public static void main(String[] args) {
        TTransport transport = new TFramedTransport(new TSocket("localhost",8899),600);
        TProtocol protocol = new TCompactProtocol(transport);
        PersonService.Client client = new PersonService.Client(protocol);
        try {
            transport.open();
            Person shiki = client.getPersonByUsername("shiki");
            System.out.println(shiki.married);
            System.out.println(shiki.age);
            System.out.println(shiki.username);

            System.out.println("=====================");
            Person person = new Person();
            person.setMarried(true).setAge(18).setUsername("shiki");
            client.savePerson(person);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            transport.close();
        }
    }
}
