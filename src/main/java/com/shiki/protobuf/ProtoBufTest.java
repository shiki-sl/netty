package com.shiki.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author: shiki
 * @date: 2019/11/10 下午9:34
 * @description: protobuf测试
 */
public class ProtoBufTest {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setAddress("杭州萧山")
                .setAge(18)
                .setName("shiki")
                .build();
        byte[] student2ByteArray = student.toByteArray();
        DataInfo.Student student1 = DataInfo.Student.parseFrom(student2ByteArray);
        System.out.println(student2ByteArray.length);
        System.out.println(student1);
        System.out.println(student1.getAddress());
        System.out.println(student1.getAge());
        System.out.println(student1.getName());
    }
}
