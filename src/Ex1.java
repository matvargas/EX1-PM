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

        public boolean insertObjectOnList(List<Object> objects, Object object) { objects.add(object) }

        //public void crescOrderList(List<Object> objects){ Collections.sort(objects); }

        public void printObjectHandlerList(List<Object> objects){
            System.out.println(objects);
        }
    }

    static class IntHandler {
        List<Object> integerList = new ArrayList<Object>();
    }

    static class StringHandler {
        List<Object> stringList = new ArrayList<Object>();
    }

    public static void main (String [] args){
        ObjectHandler objectHandler = new ObjectHandler();
        IntHandler integers = new IntHandler();
        StringHandler strings = new StringHandler();

        objectHandler.insertObjectOnList(integers.integerList, 5);
        objectHandler.insertObjectOnList(integers.integerList, 43);
        objectHandler.insertObjectOnList(integers.integerList, 3);
        objectHandler.insertObjectOnList(integers.integerList, 4);
        objectHandler.insertObjectOnList(integers.integerList, 656);
        objectHandler.insertObjectOnList(integers.integerList, 2);
        objectHandler.insertObjectOnList(integers.integerList, 1);
        objectHandler.insertObjectOnList(integers.integerList, 94574);
        objectHandler.printObjectHandlerList(integers.integerList);

    }
}