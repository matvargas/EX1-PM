/**
 * Exercício de polimorfismo dinâmico e estático.
 * Programação Modular - Universidade Federal de Minas Gerais
 * 2018/2
 * Aluno: Matheus Filipe Sieiro Vargas
 * Matrícula: 2014144812
 */

import java.util.*;

public class Ex1 {

    static class ObjectHandler {

        Object o;

        public ObjectHandler() { }

        public void insertObjectOnList(List<Object> objects, Object object) { objects.add(object); }

        public List<Object> crescOrderList(List<Object> objects){
            if(objects.get(0).getClass() == Integer.class) {
                List<Integer> integers = new ArrayList<Integer>();
                for(Object o : objects)
                    integers.add((Integer)o);
                Collections.sort(integers);
                objects = new ArrayList<Object>();
                for(int i : integers)
                    objects.add(i);
                return objects;
            } else {
                List<String> strings = new ArrayList<String>();
                for(Object o : objects)
                    strings.add((String)o);
                Collections.sort(strings);
                objects = new ArrayList<Object>();
                for(String s : strings)
                    objects.add(s);
                return objects;
            }
        }

        public void printObjectHandlerList(List<Object> objects){ System.out.println(objects); }
    }

    static class IntHandler { List<Object> integerList = new ArrayList<Object>(); }

    static class StringHandler { List<Object> stringList = new ArrayList<Object>();}

    public static void main (String [] args){
        ObjectHandler objectHandler = new ObjectHandler();
        IntHandler integers = new IntHandler();
        StringHandler strings = new StringHandler();

        objectHandler.insertObjectOnList(integers.integerList, 5);
        objectHandler.insertObjectOnList(integers.integerList, 3);
        objectHandler.insertObjectOnList(integers.integerList, 31);
        objectHandler.insertObjectOnList(integers.integerList, 4);
        objectHandler.insertObjectOnList(integers.integerList, 656);
        objectHandler.insertObjectOnList(integers.integerList, 2);
        objectHandler.insertObjectOnList(integers.integerList, 1);
        objectHandler.insertObjectOnList(integers.integerList, 94574);
        objectHandler.printObjectHandlerList(integers.integerList);
        objectHandler.insertObjectOnList(strings.stringList, "sdsfsdfds");
        objectHandler.insertObjectOnList(strings.stringList, "asaaaaaa");
        objectHandler.insertObjectOnList(strings.stringList, "bbbbfffff");
        objectHandler.insertObjectOnList(strings.stringList, "mbnmbnmnb");
        objectHandler.printObjectHandlerList(strings.stringList);
        strings.stringList = objectHandler.crescOrderList(strings.stringList);
        integers.integerList = objectHandler.crescOrderList(integers.integerList);
        objectHandler.printObjectHandlerList(integers.integerList);
        objectHandler.printObjectHandlerList(strings.stringList);

    }
}