/**
 * Exercício de polimorfismo dinâmico e estático.
 * Programação Modular - Universidade Federal de Minas Gerais
 * 2018/2
 * Aluno: Matheus Filipe Sieiro Vargas
 * Matrícula: 2014144812
 */

import java.util.*;
import java.util.Scanner;

public class Ex1 {

    class ObjectHandler {

        IntHandler objectId = null;
        StringHandler objectStringId = null;

        public ObjectHandler(IntHandler o) { this.objectId = o;}

        public ObjectHandler(StringHandler o) { this.objectStringId = o;}

        public boolean insertObjectOnList(List<ObjectHandler> objectHandlers, ObjectHandler objectHandler) {
            if(objectHandlers.add(objectHandler))
                return true;
            else
                return false;
        }

        @Override
        public int compareTo(Object o) {
            if(o.objectId != null) {
                return this.objectID.intHandlerId.compareTo(o.objectID.intHandlerId);
            } else {
                return this.objectStringId.stringHandlerId.compareTo(o.objectStringId.stringHandlerId);
            }
        }

        @Override
        public String toString() {
            if(o.objectId != null) {
                return "Object [Id=" + objectId.intHandlerId + "]";
            } else {
                return "Object [StringId=" + objectStringId.stringHandlerId + "]";
            }

        }

        public void crescOrderList(List<ObjectHandler> objectHandlers){
            Collections.sort(objectHandlers);
        }

        public void printObjectHandlerList(List<ObjectHandler> objectHandlers){
            System.out.println(objectHandlers);
        }
    }

    class IntHandler {
        int intHandlerId;
        public IntHandler(int i){
            this.intHandlerId = i;
        }
    }

    class StringHandler {
        String stringHandlerId;
        public StringHandler(String s){
            this.stringHandlerId = s;
        }
    }

    public static void main (String [] args){
        int NUM_OF_ENTRIES = 30;
        Scanner keyboard = new Scanner(System.in);
        List<ObjectHandler> integers = new ArrayList<ObjectHandler>();
        List<ObjectHandler> strings = new ArrayList<ObjectHandler>();

        for(int i = 0; i < NUM_OF_ENTRIES; i++) {
            System.out.println("Insira um inteiro");
            new IntHandler(keyboard.nextInt());
            System.out.println("Insira uma string");
            new StringHandler(keyboard.nextString());
        }

    }
}