package com.example.demo.javassist;

import com.xiaomi.miliao.thrift.ThriftUtil;
import javassist.CannotCompileException;
import javassist.ClassClassPath;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.NotFoundException;

public class Test {
    public static void main(String[] args) throws NotFoundException, CannotCompileException {
        Class<?>[] interfaces = TestClass.class.getClasses();
        for (Class<?> i : interfaces) {
            System.out.println("ethan " + i.getName());
        }
        String serviceDefName = ThriftUtil.getServiceDefinitionClass(TestClass.class);
        System.out.println("ethan2 " + serviceDefName);

        ClassPool classPool = ClassPool.getDefault();
        classPool.insertClassPath(new ClassClassPath(TestClass.class));
        classPool.makeClass("TestInterface");
        CtClass ctClass = classPool.get("com.example.demo.javassist.TestClass");
        for (CtClass c : ctClass.getInterfaces()) {
            System.out.println(c.getName());
        }
    }
}
